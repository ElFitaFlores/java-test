package com.example.javatest.util;

import java.util.Optional;

public class StringUtil {
    public static String repeat(String str, Integer times) {
        if (times < 0) {
            throw new IllegalArgumentException("Negatives not allowed.");
        }

        String result = "";

        for (int i = 0; i < times; i++) {
            result = result + str;
        }

        return result;
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
