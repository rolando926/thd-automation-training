package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day4;

/**
 * Created by rrolando on 11/4/16.
 */
public class RandomString {

    private int limit;

    public RandomString(){this.limit = 10;}

    public int getLimit(){
        return limit;
    }

    public void setLimit(int value){
        if (value > 0 && value < 11){
            limit = value;
        }
    }

    public String randomString() {
        String str = "";

        for (int i = 0; i < limit; i++) {
            switch ((int) (Math.random() * 26)) {
                case 0:
                    str+= "*";
                    break;
                case 1:
                    str += "A";
                    break;
                case 2:
                    str += "B";
                    break;
                case 3:
                    str += "C";
                    break;
                case 4:
                    str += "D";
                    break;
                case 5:
                    str += "E";
                    break;
                case 6:
                    str += "F";
                    break;
                case 7:
                    str += "G";
                    break;
                case 8:
                    str += "H";
                    break;
                case 9:
                    str += "I";
                    break;
                case 10:
                    str += "J";
                    break;
                case 11:
                    str += "K";
                    break;
                case 12:
                    str += "L";
                    break;
                case 13:
                    str += "M";
                    break;
                case 14:
                    str += "N";
                    break;
                case 15:
                    str += "O";
                    break;
                case 16:
                    str += "P";
                    break;
                case 17:
                    str += "Q";
                    break;
                case 18:
                    str += "R";
                    break;
                case 19:
                    str += "S";
                    break;
                case 20:
                    str += "T";
                    break;
                case 21:
                    str += "U";
                    break;
                case 22:
                    str += "V";
                    break;
                case 23:
                    str += "W";
                    break;
                case 24:
                    str += "X";
                    break;
                case 25:
                    str += "Y";
                    break;
                case 26:
                    str += "Z";
                    break;
            }
        }
        return str;
    }
}
