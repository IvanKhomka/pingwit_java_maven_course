package com.pingwit_java_course.part28.homework.task1;

import org.apache.poi.util.Units;
import org.apache.poi.xwpf.usermodel.*;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class EminemSingForTheMomentToMicrosoftWord {
    public static void main(String[] args) throws Exception {
        XWPFDocument document = new XWPFDocument();

        String font = "Courier";
        createImage(document, Path.of("src/main/java/com/pingwit_java_course/part28/homework/task1/sing_for_the_moment.png"));
        createTitle(document, font, "Eminem");
        createSubTitle(document, font, "Sing For The Moment");
        createRegularText(document, font, Files.readString(Path.of("src/main/java/com/pingwit_java_course/part28/homework/task1/Sing_For_The_Moment.txt")));

        Files.readAllLines(Path.of("src/main/java/com/pingwit_java_course/part28/homework/task1/Sing_For_The_Moment.txt"))
                .forEach(line -> createRegularText(document, font, line));

        write(document);
    }

    private static void createTitle(XWPFDocument document, String font, String text) {
        XWPFParagraph title = document.createParagraph();
        title.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun titleRun = title.createRun();
        titleRun.setText(text);
        titleRun.setColor("8417c6");
        titleRun.setBold(true);
        titleRun.setFontFamily(font);
        titleRun.setFontSize(26);
    }

    private static void createSubTitle(XWPFDocument document, String font, String text) {
        XWPFParagraph subtitle = document.createParagraph();
        subtitle.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun subtitleRun = subtitle.createRun();
        subtitleRun.setText(text);
        subtitleRun.setColor("bf95d9");
        subtitleRun.setBold(true);
        subtitleRun.setFontFamily(font);
        subtitleRun.setFontSize(20);
        subtitleRun.setUnderline(UnderlinePatterns.WAVE);
    }

    private static void createRegularText(XWPFDocument document, String font, String text) {
        XWPFParagraph subtitle = document.createParagraph();
        subtitle.setAlignment(ParagraphAlignment.CENTER);

        XWPFRun subtitleRun = subtitle.createRun();
        subtitleRun.setText(text);
        subtitleRun.setColor("000000");
        subtitleRun.setBold(true);
        subtitleRun.setFontFamily(font);
        subtitleRun.setFontSize(14);
    }

    private static void createImage(XWPFDocument document, Path imagePath) throws Exception {
        XWPFParagraph imageParagraph = document.createParagraph();
        imageParagraph.setAlignment(ParagraphAlignment.LEFT);

        XWPFRun imageRun = imageParagraph.createRun();
        imageRun.addPicture(Files.newInputStream(imagePath), XWPFDocument.PICTURE_TYPE_PNG, imagePath.toFile().getName(), Units.toEMU(250), Units.toEMU(250));
    }

    private static void write(XWPFDocument document) {
        String currentDirectory = "src/main/java/com/pingwit_java_course/part28/homework/task1";
        String outputFileName = currentDirectory + "/EminemSingForTheMomentSong.docx";

        try (FileOutputStream fos = new FileOutputStream(outputFileName)) {
            document.write(fos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}