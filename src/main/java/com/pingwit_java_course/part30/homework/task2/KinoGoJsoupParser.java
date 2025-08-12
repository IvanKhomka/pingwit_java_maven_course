package com.pingwit_java_course.part30.homework.task2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class KinoGoJsoupParser {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/part30/KinoGo.html");
        Document doc = Jsoup.parse(file, StandardCharsets.UTF_8.name());

        List<Film> films = new ArrayList<>();

        for (Element shortstory : doc.select("div.shortstory")) {
            Film film = new Film();

            Element titleEl = shortstory.selectFirst("div.shortstory__title h2");
            if (titleEl != null) {
                film.title = titleEl.text();
            }

            for (Element span : shortstory.select("div.shortstory__info span")) {
                String label = span.selectFirst("b") != null ? span.selectFirst("b").text() : "";

                if (label.contains("Год выпуска")) {
                    film.year = span.select("a").text();
                } else if (label.contains("Страна")) {
                    film.country = span.select("a").text();
                } else if (label.contains("Жанр")) {
                    film.genre = span.select("a").eachText().toString();
                } else if (label.contains("Продолжительность")) {
                    film.duration = span.ownText();
                } else if (label.contains("Премьера")) {
                    film.premiere = span.ownText();
                } else if (label.contains("Качество")) {
                    film.quality = span.ownText();
                }
            }

            films.add(film);
        }

        for (Film f : films) {
            System.out.println(f);
        }
    }
}