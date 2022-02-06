package com.example.springtdd.service;

public class OutsideStateFactor {

    public double outsideStateFactor(boolean value){
        return value ? 1.1 : 1.0;
    }
}
