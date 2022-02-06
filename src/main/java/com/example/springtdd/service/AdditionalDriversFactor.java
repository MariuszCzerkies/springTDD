package com.example.springtdd.service;

import org.springframework.stereotype.Service;

@Service
public class AdditionalDriversFactor {

    public double additionalDriver(int additional) {
        if (additional <= 2) {
            return 1.1;
        } else {
            return 1.2;
        }
    }
}
