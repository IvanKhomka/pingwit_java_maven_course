package com.pingwit_java_course.part30.homework.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDomParser {

    public static void main(String[] args) {
        try {
            InputStream xmlInput = Optional.ofNullable(
                    StudentDomParser.class.getClassLoader().getResourceAsStream("part30/students.xml")
            ).orElseThrow(() -> new IllegalStateException("File students.xml not found!"));

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlInput);

            NodeList studentNodes = doc.getElementsByTagName("student");

            List<Student> students = new ArrayList<>();

            for (int i = 0; i < studentNodes.getLength(); i++) {
                Element studentElement = (Element) studentNodes.item(i);

                String groupNumber = getTagValue(studentElement, "groupNumber");
                String firstName = getTagValue(studentElement, "firstName");
                String lastName = getTagValue(studentElement, "lastName");
                String faculty = getTagValue(studentElement, "faculty");

                students.add(new Student(groupNumber, firstName, lastName, faculty));
            }

            for (Student student : students) {
                System.out.println(student);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getTagValue(Element element, String tag) {
        NodeList list = element.getElementsByTagName(tag);
        if (list.getLength() > 0) {
            return list.item(0).getTextContent();
        }
        return null;
    }
}