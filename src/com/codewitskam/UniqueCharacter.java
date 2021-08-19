package com.codewitskam;

import java.util.HashSet;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "india";

        //Create a Set
        HashSet<Character> set = new HashSet<Character>();
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
            if (count == 1) {
                //print in a single line
                System.out.print(ch);
            }


        }
    }
}
