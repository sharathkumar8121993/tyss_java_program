package com.codewitskam;

public class WithoutUsingThirdVariable {
    public static  void main(String[] args) {
        String s="sharath";

        char[] c =s.toCharArray();
        int count =0;
        for (char ignored :c) {
            count++;
        }
        String rev="";
        for (int i=count;i>=0;i--){
            rev=rev+s.charAt(i);
        }
    }
}
