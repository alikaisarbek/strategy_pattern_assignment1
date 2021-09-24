package com.company;

public class Pdf extends File{
    public Pdf(){
        super(new Converttopdf());}
    @Override
    public void display(){ System.out.println("I am pdf");}
}
