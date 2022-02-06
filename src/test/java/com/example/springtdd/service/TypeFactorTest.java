package com.example.springtdd.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeFactorTest {

    TypeFactor typeFactor = new TypeFactor();

    @Test
    void typeFactor_should_return_1_3_value_for_Cabriolet() {
        //given
        String type = "Cabriolet";

        //when
        double factor = typeFactor.typeFactor(type);

        //then
        Assertions.assertEquals(1.3, factor);
    }

    @Test
    void typeFactor_should_return_1_4_value_for_Coupe() {
        //given
        String type = "Coupe";

        //when
        double factor = typeFactor.typeFactor(type);

        //then
        Assertions.assertEquals(1.4, factor);
    }

    @Test
    void typeFactor_should_return_1_5_value_for_Estate() {
        //given
        String type = "Estate";

        //when
        double factor = typeFactor.typeFactor(type);

        //then
        Assertions.assertEquals(1.5, factor);
    }

    @Test
    void typeFactor_should_return_1_6_value_for_Hatchback() {
        //given
        String type = "Hatchback";

        //when
        double factor = typeFactor.typeFactor(type);

        //then
        Assertions.assertEquals(1.6, factor);
    }

    @Test
    void typeFactor_should_return_1_7_value_for_Other() {
        //given
        String type = "Other";

        //when
        double factor = typeFactor.typeFactor(type);

        //then
        Assertions.assertEquals(1.7, factor);
    }
}