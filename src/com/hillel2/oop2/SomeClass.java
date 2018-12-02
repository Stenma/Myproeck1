package com.hillel2.oop2;

public class SomeClass {
    public int data;
    private int pData;

    public int getPData(){
        return pData;
    }

    public void setPData(int pData){
        this.pData = pData;
    }

    public void settingNewVal(){
        data = 33;
    }
}
