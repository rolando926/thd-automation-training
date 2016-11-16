package com.thd.automation.training.Objects_Classes.day5;

import com.thd.automation.training.Methods_Encapsulation_Conditionals.day4.RandomString;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rrolando on 11/12/16.
 */
public class UtilityClass {

    //Use encapsulation to declare special char
    private char ch;

    //Generate constructor with default value for special char
    UtilityClass(){
        this.ch = '*';
    }

    //getter and setter methods
    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    //return new string using String methods
    public String replaceAllVowelsFromString(String string){
        int size = string.length();
        String newString = "";
        for (int i = 0; i < size; i++){
            switch(Character.toLowerCase(string.charAt(i))){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    newString+=ch;
                    break;
                default:
                    newString+=string.charAt(i);
                    break;
            }
        }
        return newString;
    }

    //return new string changing string into array
    public String replaceAllVowelsFromStringIntoArray(String string){
        char[] charArray = string.toCharArray();
        int size = charArray.length;
        for (int i = 0; i < size; i++){
            switch(Character.toLowerCase(charArray[i])){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    charArray[i] = ch;
                    break;
            }
        }
        return String.copyValueOf(charArray);
    }

    //return new string using regex matcher
    public String replaceAllVowelsFromStringREGEX(String string){
        Pattern p = Pattern.compile("(a|e|i|o|u|A|E|I|O|U)");
        Matcher m = p.matcher(string);
        return m.replaceAll(String.valueOf(ch));
    }
}
