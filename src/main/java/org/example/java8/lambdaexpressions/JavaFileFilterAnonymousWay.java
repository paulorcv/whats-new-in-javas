package org.example.java8.lambdaexpressions;

import java.io.File;
import java.io.FileFilter;


public class JavaFileFilterAnonymousWay {

    public static void main(String[] args) {
        FileFilter javaFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        File dir = new File("c:/dev/projetos/effectiveTesting/src/main/java/org/example");
        File[] javaFiles = dir.listFiles(javaFilter);

        for (File file : javaFiles) {
            System.out.println("Arquivo:");
            System.out.println(file.getAbsoluteFile());
        }
    }
}
