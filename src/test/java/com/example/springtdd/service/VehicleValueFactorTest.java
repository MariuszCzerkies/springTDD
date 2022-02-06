package com.example.springtdd.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)//JUnit5
class VehicleValueFactorTest {

    VehicleValueFactor vehicleValueFactor = new VehicleValueFactor();

    @Test
    @DisplayName("VehicleValue")
    void showResponseVehicleValue() {
        //given
        int valueVehicle = 3;
        double expected = 1.0;

        //when
        double actual = vehicleValueFactor.vehicleValue(valueVehicle);

        //then
        assertEquals(expected, actual);
    }
}