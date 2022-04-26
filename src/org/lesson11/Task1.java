package org.lesson11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    //1.Написать метод, который читает текстовый файл и возвращает его в виде списка строк.
    public static List<String> fileString(File file) {
        file = new File("files/text.txt");
        List strList = new ArrayList<String>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input = null;
            while ((input = reader.readLine()) != null) {
                strList.add(input);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return (strList);
    }

    //Task2. Написать метод, который записывает в файл строку, переданную параметром.
    public static void writesString(String s) {
        File file2 = new File("files/file2.txt");
        FileWriter inp = null;
        try {
            inp = new FileWriter(file2);
            inp.write(s);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                inp.close();
            } catch (IOException e) {
                e.getMessage();
            }
        }
    }

    //Task3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла в один.
    public static void streamFiles() {
        File file1 = new File("files/file1.txt");
        File file2 = new File("files/file2.txt");
        File file3 = new File("files/file3.txt");

        OutputStream outstream = null;
        InputStream mainstream1 = null;
        InputStream mainstream2 = null;
        String s = "\n";
        try {
            outstream = new FileOutputStream(file3);
            mainstream1 = new FileInputStream(file1);
            mainstream2 = new FileInputStream(file2);

            while (mainstream1.available() > 0) {
                outstream.write(mainstream1.read());
            }
            outstream.write(s.getBytes());

            while (mainstream2.available() > 0) {
                outstream.write(mainstream2.read());
            }

        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (mainstream1 != null && mainstream2 != null) {
                    mainstream1.close();
                    mainstream2.close();
                }
                if (outstream != null) {
                    outstream.close();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    //Task4. Написать метод который заменяет в файле все не символьные знаки на знак ‘$’
    public static void replacement() {
        File file3 = new File("files/file3.txt");
        File file4 = new File("files/file4.txt");
        String inp3 = null;

        OutputStream out = null;
        InputStream ins = null;

        try {
            out = new FileOutputStream(file4);
            ins = new FileInputStream(file3);
            BufferedReader br = new BufferedReader(new FileReader(file4));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file4));
            String ln;
            while (ins.available() > 0) {
                out.write(ins.read());
            }
            while ((ln = br.readLine()) != null) {
                bw.write(ln.replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$"));
                bw.newLine();
            }
            br.close();
            bw.close();
            Files.move(file4.toPath(), file4.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                if (ins != null) {
                    ins.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("files/file1.txt");
        System.out.println(fileString(file));
        writesString("Hello");
        streamFiles();
        replacement();
    }
}

