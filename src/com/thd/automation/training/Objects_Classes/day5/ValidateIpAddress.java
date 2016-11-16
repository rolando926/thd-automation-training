package com.thd.automation.training.Objects_Classes.day5;

/**
 * Created by rrolando on 11/10/16.
 */
public class ValidateIpAddress {

    public static void main(String[] args) {
        String[] ipAdresses = {"000.12.12.034",
                "121.234.12.12",
                "23.45.12.56",
                "00.12.123.123123.123",
                "122.23",
                "Hello.IP",
                "123@123#123@123"};

        String strPartialRegex = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
        String strFullRegex = strPartialRegex
                + "\\." + "{3}"
                + strPartialRegex;

        int counter = 0;
        int size = ipAdresses.length;

        while(counter < size){
            if(ipAdresses[counter].matches(strFullRegex)){
                System.out.println(ipAdresses[counter] + " is a valid ip address.");
            }
            else{
                System.out.println(ipAdresses[counter] + " is NOT a valid ip address.");
            }
            counter++;
        }
    }









}
