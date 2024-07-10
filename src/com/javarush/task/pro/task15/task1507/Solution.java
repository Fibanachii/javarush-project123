package com.javarush.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Path path = Paths.get(new Scanner(System.in).nextLine());
        try {
            List<String> encoded = Files.readAllLines(path);

            for (String content : encoded) {
                if (encoded.indexOf(content) % 2 == 0)
                System.out.println(content);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

