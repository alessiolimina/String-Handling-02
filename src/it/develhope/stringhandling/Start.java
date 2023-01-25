package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        System.out.println("------------Starting----------------");

        String string1 = "United Kingdom";
        String string2 = "Germany";

        String sub1 = string1.substring(0,6);
        String sub2 = string1.substring(7,14);

        String s3 = sub1 + " " + string2 + " " + sub2;

        s3 = s3.toUpperCase();

        char[] charArray = s3.toCharArray();

        System.out.println(charArray);

        System.out.println("--------------------------------------");

        }
    }

