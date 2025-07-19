package com.pingwit_java_course.part14.point_1;

public class TrimStripExample {
    public static void main(String[] args) {
        // trim() удаляет только символы <= U+0020 (пробел)
        String s = "\t abc \n";

        System.out.println("abc=" + s.trim());
        System.out.println("abc=" + s.strip());

        Character c = '\u2000';
        String stringWithCharacter = c + "abc" + c;

        System.out.println(Character.isWhitespace(c));
        System.out.println("abc=" + stringWithCharacter.trim());
        System.out.println("abc=" + stringWithCharacter.strip());
    }
}