package com.company;

public class Ppt extends File{
    public Ppt(){
        super(new Converttoppt());}
    @Override
    public void display(){ System.out.println("I am ppt");}
}
