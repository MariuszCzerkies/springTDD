package com.example.springtdd.service;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class QuoteAmountTest {

    private final AdditionalDriversFactor additionalDriversFactor = new AdditionalDriversFactor();
    private final CommercialUseFactor commercialUseFactor = new CommercialUseFactor();
    private final EngineSizeFactor engineSizeFactor = new EngineSizeFactor();
    private final OutsideStateFactor outsideStateFactor = new OutsideStateFactor();
    private final TypeFactor typeFactor = new TypeFactor();
    private final VehicleValueFactor vehicleValueFactor = new VehicleValueFactor();

    private final QuoteAmount quoteAmount = new QuoteAmount(
       additionalDriversFactor,
       commercialUseFactor,
       engineSizeFactor,
       outsideStateFactor,
       typeFactor,
       vehicleValueFactor
    );

    @Test
    void shouldCorrectFactor() {
        //given
        String type = "Cabriolet";
        int engineSize = 1000;
        int vehicleValue = 1000;
        int additionalDriver = 1;
        boolean commercialUse = true;
        boolean outsideState = true;


        //when
        BigDecimal actual = quoteAmount.calculate(
            type,
            engineSize,
            vehicleValue,
            additionalDriver,
            commercialUse,
            outsideState
        );

        //then
        assertEquals(BigDecimal.valueOf(207.63600000000002), actual);
    }
}