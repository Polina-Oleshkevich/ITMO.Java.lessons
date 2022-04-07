package org.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Str {
    public static void main(String[] args) {
        task1("Эта сортировка — хороший пример использования принципа «разделяй и властвуй.");
        System.out.println(task2("Хорошо"));
        task3("Моя любимая бяка");
        System.out.println(task4("Это хорошо.", "jjj"));
        task5("The given string is: This is a test string\n" +
                "The string reversed word by word is:\n" +
                "sihT si a tset gnirts\n");
    }

    public static void task1(String string) {
        String[] s = string.split(" ");
        String l = new String();
        int res = 0;
        for (String s1 : s) {
            if (s1.length() > res) {
                l = s1;
                res = s1.length();
            }
        }
        System.out.println("Самое длинное слово в этом тексте: " + l);
    }

    public static boolean task2(String string) {
        String toLower = string.toLowerCase();
        return (toLower.equals(new StringBuilder(toLower).reverse().toString()));
    }

    public static void task3(String string) {
        String a = string.replaceAll("бяка", "[вырезано цензурой]");
        System.out.println(a);
    }

    public static int task4(String string1, String string2) {
        Pattern pattern = Pattern.compile(string2);
        Matcher matcher = pattern.matcher(string1);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }


    public static void task5(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] s = string.split(" ");
        for (String n : s) {
            stringBuilder.append(new StringBuilder(n).reverse())
                    .append(" ");
        }
        System.out.println("The string reversed word by word is: " + stringBuilder);
    }

}


