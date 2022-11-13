package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class AppTwo {
    public static void main(String[] args) {
        String string = "Round Table Festival World";
        Pattern pattern = Pattern.compile("^R\\w+\s(T\\w+)\s(F\\w+)");
//        Pattern patternTwo = Pattern.compile("R\\w+\sT\\w+\sF\\w+");
        Matcher matcher = pattern.matcher(string);
        boolean matches = matcher.matches();
        System.out.println("matches = " + matches);
        if (matcher.find()){
            System.out.println(matcher.group(2));
        }else {
            System.out.println("Could not find anything!!");
        }
    }
}
