package com.pingwit_java_course.part30.homework.task2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KinoGoJsoupParser {

    public static void main(String[] args) throws IOException {
        File file = new File("src/main/resources/part30/KinoGo.html");
        Document doc = Jsoup.parse(file, StandardCharsets.UTF_8.name());

        List<Film> films = new ArrayList<>();

        for (Element shortStory : doc.select("div.shortstory")) {
            Film film = new Film();

            Element titleEl = shortStory.selectFirst("div.shortstory__title h2");
            if (titleEl != null) {
                film.setTitle(titleEl.text());
            }

            for (Element span : shortStory.select("div.shortstory__info span")) {
                Optional.ofNullable(span.selectFirst("b"))
                        .map(Element::text)
                        .ifPresent(label -> updateFilm(label, span, film));
            }

            films.add(film);
        }

        films.forEach(System.out::println);
    }

    private static void updateFilm(String label, Element span, Film film) {
        if (label.contains("Год выпуска")) {
            film.setYear(span.select("a").text());
        } else if (label.contains("Страна")) {
            film.setCountry(span.select("a").text());
        } else if (label.contains("Жанр")) {
            film.setGenre(span.select("a").eachText().toString());
        } else if (label.contains("Продолжительность")) {
            film.setDuration(span.ownText());
        } else if (label.contains("Премьера")) {
            film.setPremiere(span.ownText());
        } else if (label.contains("Качество")) {
            film.setQuality(span.ownText());
        }
    }
}