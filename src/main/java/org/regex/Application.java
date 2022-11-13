package org.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main(String[] args) {
        
//        String string = "Many More to ManageM";
        String string = "This is simple";
        String stringTwo = "This is 'very important' text";
        String s = " ";
        System.out.println("s = " + s);

        Pattern pattern = Pattern.compile("'(.+)'");
//        Pattern pattern = Pattern.compile("'\\.'");
        Matcher matcher = pattern.matcher(stringTwo);
        while(matcher.find()){
            System.out.println(matcher.group(1));
        }
//        System.out.println(matcher.group(0));
//        boolean matches = matcher.matches();
//        System.out.println("matches = " + matches);
    }
}
