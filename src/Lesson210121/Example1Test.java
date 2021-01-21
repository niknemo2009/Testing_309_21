package Lesson210121;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Example1Test {

    private static Stream<Arguments> analisGranZnachen() {
        return Stream.of(
                Arguments.arguments(-1,2),
                Arguments.arguments(0,2),
                Arguments.arguments(1,2),
                Arguments.arguments(59,2),
                Arguments.arguments(60,3),
                Arguments.arguments(61,3),
                Arguments.arguments(74,3),
                Arguments.arguments(75,4),
                Arguments.arguments(76,4),
                Arguments.arguments(89,4),
                Arguments.arguments(90,5),
                Arguments.arguments(91,5),
                Arguments.arguments(99,5),
                Arguments.arguments(100,5),
                Arguments.arguments(101,5)
        );
    }

    @ParameterizedTest
    @MethodSource("analisGranZnachen")
    void convertBall(int par,int result_t) {
        Example1 ex1=new Example1();
        int result=ex1.convertBall(par);
        assertEquals(result_t,result);
    }
}