package com.codewitskam;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueCharacterInTheGivenString {
    public static void main(String[] args) {
        String s = "india";

        //Create a Set
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (Character ch : set) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {

                if (ch == s.charAt(i)) {
                    count++;
                }
            }
//to print unique character
            if (count == 1) {
                System.out.println(ch);
            }


        }
    }
}
