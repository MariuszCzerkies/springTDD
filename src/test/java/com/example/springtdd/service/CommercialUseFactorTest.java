package com.example.springtdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommercialUseFactorTest {

    private final OutsideStateFactor outsideStateFactor= new OutsideStateFactor();

    @Test
    @DisplayName("True should response factor 1.1")
    void TrueResponseFactor() {
        //given
        //when
        double responseFactor = outsideStateFactor.outsideStateFactor(true);
        //then
        assertEquals(1.1, responseFactor);
    }

    @Test
    @DisplayName("True should response factor 1.0")
    void FalseResponseFactor() {
        //given
        //when
        double responseFactor = outsideStateFactor.outsideStateFactor(false);
        //then
        assertEquals(1.0, responseFactor);
    }
}