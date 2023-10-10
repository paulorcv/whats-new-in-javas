package org.example.java8.lambdaexpressions;

import java.io.File;
import java.io.FileFilter;


public class JavaFileFilterTraditionalWay implements FileFilter {

    @Override
    public boolean accept(File file) {
        return file.getName().endsWith(".java");
    }

    public static void main(String[] args) {
        JavaFileFilterTraditionalWay filter = new JavaFileFilterTraditionalWay();
        File dir = new File("c:/dev/projetos/effectiveTesting/src/main/java/org/example");
        File[] javaFiles = dir.listFiles(filter);

        for (File file : javaFiles) {
            System.out.println("Arquivo:");
            System.out.println(file.getAbsoluteFile());
        }
    }
}
