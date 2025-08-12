package com.pingwit_java_course.part30.homework.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KinoGoStringParser {

    public static void main(String[] args) throws IOException {

        String html = Files.readString(Paths.get("src/main/resources/part30/KinoGo.html"));

        List<Film> films = new ArrayList<>();

        Pattern storyPattern = Pattern.compile(
                "<div[^>]*class=\"shortstory\"[^>]*>(.*?)<div class=\"shortstory__meta\">",
                Pattern.DOTALL
        );
        Matcher storyMatcher = storyPattern.matcher(html);

        while (storyMatcher.find()) {
            String block = storyMatcher.group(1);
            Film film = new Film();

            film.title = extract(block, "<h2>(.*?)</h2>");
            film.year = extract(block, "Год выпуска:</b>\\s*<a[^>]*>(.*?)</a>");
            film.country = extract(block, "Страна:</b>\\s*<a[^>]*>(.*?)</a>");
            film.genre = extractAll(block, "Жанр:</b>(.*?)</span>");
            film.duration = extract(block, "Продолжительность:</b>([^<]*)");
            film.premiere = extract(block, "Премьера.*?</b>([^<]*)");
            film.quality = extract(block, "Качество:</b>([^<]*)");

            films.add(film);
        }

        for (Film f : films) {
            System.out.println(f);
        }
    }

    private static String extract(String html, String regex) {
        Matcher m = Pattern.compile(regex, Pattern.DOTALL).matcher(html);
        if (m.find()) {
            return m.group(1).trim();
        }
        return null;
    }

    private static String extractAll(String html, String regex) {
        Matcher m = Pattern.compile(regex, Pattern.DOTALL).matcher(html);
        if (m.find()) {
            String genreBlock = m.group(1);
            Matcher gm = Pattern.compile("<a[^>]*>(.*?)</a>").matcher(genreBlock);
            List<String> genres = new ArrayList<>();
            while (gm.find()) {
                genres.add(gm.group(1).trim());
            }
            return String.join(", ", genres);
        }
        return null;
    }
}