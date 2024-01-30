package com.epam.demo;

import com.epam.utils.String_Utils;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!String_Utils.isPositiveNumber(str)) {
                return false;
            }
        }
        return true;
    }
}