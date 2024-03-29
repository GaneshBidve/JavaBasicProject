package com.reverseProject.gb;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "I Love My India";

        char[] input = str.toCharArray();

        reverseWord(input);
        System.out.println(input);
    }

    public static void reverseWord(char[] input) {

        reverseChar(input, 0, input.length-1);
        //reverseChar() method will print
        // this line "aidnI yM evoL I"

        //collect reversed character
        int reversedWord = 0;//"aidnI yM evoL I"
        for(int i=0; i<=input.length; i++){

            if(i == input.length || input[i] == ' ') {
                reverseChar(input, reversedWord, i-1);
                reversedWord = i+1;
            }
        }
    }

    public static void reverseChar(char[] input, int firstChar, int lastChar) {

        while(firstChar < lastChar) {

            char temp = input[lastChar];
            input[lastChar] = input[firstChar];
            input[firstChar] = temp;
            firstChar++;
            lastChar--;
        }
    }
}
