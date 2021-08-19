package com.codewitskam;

public class WithoutUsingLength {
    public static void main(String[] args) {
        String s="sharath";

        char[] c =s.toCharArray();
        int count =0;
        for (char ignored :c) {
            count++;
        }
        for (int i = count-1; i >=0 ; i--) {
            System.out.println(s.charAt(i));
        }
    }
}
