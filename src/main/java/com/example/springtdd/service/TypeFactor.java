package com.example.springtdd.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TypeFactor {

    public Double typeFactor(String type) {
        switch (type) {
            case "Cabriolet":
                return 1.3;
            case "Coupe":
                return 1.4;
            case "Estate":
                return 1.5;
            case "Hatchback":
                return 1.6;
            default:
                return 1.7;
        }
    }

}
