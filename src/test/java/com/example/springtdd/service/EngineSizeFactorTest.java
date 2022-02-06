package com.example.springtdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class EngineSizeFactorTest {

/*    The engine size factor is calculated as:
             1000 factor is 1.0
             1600 factor is 1.6
             2000 factor is 2.0
             2500 factor is 2.5
             3000 factor is 3.0
             Other factor is 3.5
*/

    private final EngineSizeFactor engineSizeFactor = new EngineSizeFactor();

    @Test
    @DisplayName("Should return factor 1.0 when engine size is 1000")
    void shouldReturnFactor_WhenEngineSize1000(){
        int engineSize = 1000;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(1.0, factor);
    }

    @Test
    @DisplayName("Should return factor 1.6 when engine size is 1600")
    void shouldReturnFactor_WhenEngineSize1600(){
        int engineSize = 1600;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(1.6, factor);
    }

    @Test
    @DisplayName("Should return factor 2.0 when engine size is 2000")
    void shouldReturnFactor_WhenEngineSize2000(){
        int engineSize = 2000;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(2.0, factor);
    }

    @Test
    @DisplayName("Should return factor 2.5 when engine size is 2500")
    void shouldReturnFactor_WhenEngineSize2500(){
        int engineSize = 2500;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(2.5, factor);
    }

    @Test
    @DisplayName("Should return factor 3.0 when engine size is 3000")
    void shouldReturnFactor_WhenEngineSize3000(){
        int engineSize = 3000;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(3.0, factor);
    }

    @Test
    @DisplayName("Should return factor 3.5 when engine size is 3700")
    void shouldReturnFactor_WhenEngineSize3500(){
        int engineSize = 3700;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(3.5, factor);
    }

    @Test
    @DisplayName("Should return factor 3.5 when engine size is 0")
    void shouldReturnFactor_WhenEngineSizeNotProvided(){
        int engineSize = 0;
        double factor = engineSizeFactor.engineSizeFactor(engineSize);
        Assertions.assertEquals(3.5, factor);
    }




}