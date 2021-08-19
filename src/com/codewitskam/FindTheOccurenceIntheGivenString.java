package com.codewitskam;

import java.util.LinkedHashSet;

public class FindTheOccurenceIntheGivenString {
    public static void main(String[] args) {
        String s = "welcome to Bangalore";
        String[] str = s.split(s);

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < str.length; i++) {
            set.add(str[i]);
        }
        for (String word : set) {
            int count = 0;
            for (int i = 0; i < str.length; i++) {
                if (word.equals(str[i])) {
                    count++;
                }
                System.out.println(word + " ");
                if (count>1){
                    System.out.println(word);
                }
            }

        }
    }
}
