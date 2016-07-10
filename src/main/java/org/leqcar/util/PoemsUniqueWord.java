package org.leqcar.util;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by jongtenerife on 09/07/2016.
 */
public class PoemsUniqueWord {


    public static void main(String[] args) {

        try (Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource("poem.txt").toURI()),
                Charset.defaultCharset())) {

            long uniqueWords = 0;
            uniqueWords = lines.flatMap(e -> Arrays.stream(e.split(" ")))
                    .distinct()
                    .count();
            System.out.println("Number of unique words: "+uniqueWords);
        } catch (IOException | URISyntaxException e) {
            //log something
        }
    }
}
