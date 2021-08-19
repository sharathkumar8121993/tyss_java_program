package com.codewitskam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s= "INDIA";
/*
        int i;
        for(i=0; i<s.length(); i++){
            //System.out.print(s.charAt(i));
            System.out.println(s.charAt(i));
        }
        System.out.println("String");

        for (i=s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
        // using temp variable
        /*

         */
        String rev="";

        for (int j = s.length()-1; j >=0 ; j--) {
            rev =rev + s.charAt(j);
        }
        System.out.println(rev);
        

    }

}
