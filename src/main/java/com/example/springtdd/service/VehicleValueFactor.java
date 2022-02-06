package com.example.springtdd.service;

import org.springframework.stereotype.Service;

@Service
public class VehicleValueFactor {

    public double vehicleValue(double vehicle) {
        if (vehicle <= 500) {
            return 1.0;
        } else {
            return 1.2;
        }
    }
}
