package com.codewitskam;

public class EqualsToAndComapreTo {
    public static void main(String[] args) {
        String s1="abcdf";
        String s2="ab";
        System.out.println(s1==s2);//checks address
        System.out.println(s1.equals(s1));//checks the content
        System.out.println(s1.compareTo(s2));//comapres with ASCII value

        String s4="welcome";
        String s5="syss";
        System.out.println(s4==s5);//checks address
        System.out.println(s4.equals(s5));//checks the content
        System.out.println(s4.compareTo(s5));//comapres with ASCII value
    }
}

