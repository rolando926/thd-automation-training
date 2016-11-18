package com.thd.automation.training.InterfacesExceptionsAndDeployments.Day2;

/**
 * Created by rrolando on 11/17/16.
 */
public class Calculate extends AreaAndVolume {

    private int length;
    private int base;
    private int height;
    private int radius;

    public Calculate(){
        this.length = 10;
        this.height = 20;
        this.radius = 15;
        this.base = this.length;
    }

    public void setLength(int length) {
        this.length = length;
        this.base = this.length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area(String type){
        switch(type.toUpperCase()){
            case "SQUARE":
                System.out.println(areaSquare(length,length));
                break;
            case "TRIANGLE":
                System.out.println(areaTriangle(base,height));
                break;
            case "CIRCLE":
                System.out.println(areaCircle(radius));
                break;
            default:
                System.out.println("This figure is not a valid one.");
        }
    }


    private int areaSquare(int l, int w){
        return l*w;
    }

    private double areaCircle(int radius){
        return Math.PI*(radius*radius);
    }

    private double areaTriangle(int base, int height){
        return (base*height)/2;
    }

}
