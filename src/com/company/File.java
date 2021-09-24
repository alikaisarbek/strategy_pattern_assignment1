package com.company;

public abstract class File {
    private Convert convert;

    public File (Convert convert) {
        this.convert = convert;
    }

    public void convertion(){
        this.convert.convert();
    }

    public abstract void display();

    public void setConvert(Convert convert) {
        this.convert = convert;
    }
}


