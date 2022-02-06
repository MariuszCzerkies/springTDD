package com.example.springtdd.service;


import java.math.BigDecimal;

public class QuoteAmount {

    private final AdditionalDriversFactor additionalDriversFactor;
    private final CommercialUseFactor commercialUseFactor;
    private final EngineSizeFactor engineSizeFactor;
    private final OutsideStateFactor outsideStateFactor;
    private final TypeFactor typeFactor;
    private final VehicleValueFactor vehicleValueFactor;

    public QuoteAmount(
        AdditionalDriversFactor additionalDriversFactor,
        CommercialUseFactor commercialUseFactor,
        EngineSizeFactor engineSizeFactor,
        OutsideStateFactor outsideStateFactor,
        TypeFactor typeFactor,
        VehicleValueFactor vehicleValueFactor
    ) {
        this.additionalDriversFactor = additionalDriversFactor;
        this.commercialUseFactor = commercialUseFactor;
        this.engineSizeFactor = engineSizeFactor;
        this.outsideStateFactor = outsideStateFactor;
        this.typeFactor = typeFactor;
        this.vehicleValueFactor = vehicleValueFactor;
    }

    public BigDecimal calculate(
        String type,
        int engineSize,
        int vehicleValue,
        int additionalDriver,
        boolean commercialUse,
        boolean outsideState
    ) {
        return BigDecimal.valueOf( 100
            * typeFactor.typeFactor(type)
            * engineSizeFactor.engineSizeFactor(engineSize)
            * additionalDriversFactor.additionalDriver(additionalDriver)
            * vehicleValueFactor.vehicleValue(vehicleValue)
            * commercialUseFactor.commercialUseFactor(commercialUse)
            * outsideStateFactor.outsideStateFactor(outsideState)
        );
    }
}
