package it.develhope.stringhandling;

public class Start {
    public static void main(String[] args) {

        String string1 = "United Kingdom";

        String string2 = "Germany";

        String sub1 = string1.substring(0,6);

        String sub2 = string1.substring(7,14);

        String s3 = sub1.concat(string2).concat(sub2);

        s3 = (s3.toUpperCase()).replaceAll("", " ");

        char[] charArray = s3.toCharArray();

        for (int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]);

        }
    }
}
/*
define a string called string1 that has assigned the value "United Kingdom"
define a string called string2 that has assigned the value "Germany"
without using the split method:
assign the first part of string1 before the space character (United) to sub1
assign the second part of string after the space character (Kingdom) to sub2
concatenate in this order sub1, string2 and sub2 into an array of chars called charArray, being sure that:
there are spaces between the words
all letters are uppercase
print the charArray
 */