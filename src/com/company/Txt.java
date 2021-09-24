package com.company;

public class Txt extends File{
    public Txt(){
        super(new Converttotxt());}
    @Override
    public void display(){ System.out.println("I am txt");}
}
