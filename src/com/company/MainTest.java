package com.company;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private static Stream<Arguments> analisGranZnachen() {
        return Stream.of(
                Arguments.of(-1,2),
                Arguments.of(0,2),
                Arguments.of(59,2),
                Arguments.of(60,3),
                Arguments.of(77,4),
                Arguments.of(90,5),
                Arguments.of(95,5)
        );
    }

    @ParameterizedTest
    @MethodSource("analisGranZnachen")
    void convertBall(int par,int result_t) {
        Main ex1 = new Main();
        int result = ex1.convertBall(par);
        assertEquals(result_t,result);
    }
}