package org.example.java8.lambdaexpressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {

    public static void main(String[] args) {

        Comparator<String> comp = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());

        List<String> list = Arrays.asList("***", "**", "****", "*");
        Collections.sort(list, comp);

        for (String s : list) {
            System.out.println(s);
        }

    }

}
