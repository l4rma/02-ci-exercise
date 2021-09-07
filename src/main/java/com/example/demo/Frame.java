package com.example.demo;

public class Frame {
    int kast = 0;
    int runde = 1;


    public int getKast() {
        return kast;
    }

    public void setKast(int kast) {
        if(kast>2){
            runde++;
            kast=0;
        }
        this.kast = kast;
    }

    public int getRunde() {
        return runde;
    }

    public void setRunde(int runde) {
        this.runde = runde;
    }
}
