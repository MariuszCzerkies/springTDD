package com.example.springtdd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)//JUnit5
class AdditionalDriversFactorTest {

    AdditionalDriversFactor additionalDriversFactor = new AdditionalDriversFactor();

    @Test
    @DisplayName("AdditionalDrivers")
    void showResponseAdditionalDriversFactor() {
        //given
        int valueAdditional = 2;
        double expected = 1.1;

        //when
        double actual = additionalDriversFactor.additionalDriver(valueAdditional);

        //then
        assertEquals(expected, actual);
    }
}