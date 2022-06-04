package ru.ufa;

import static org.junit.Assert.assertTrue;
import static ru.ufa.Main.calculateRingArea;
import static ru.ufa.Main.theCapitalOfGreatBritian;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class AppTest {
    private static long suiteStartTime;
    public static final double PI = 3.14;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running All Tests");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("All Tests completed in time: " + (System.nanoTime() - suiteStartTime));
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Starting new test");
        testStartTime = System.nanoTime();
    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Test complete in time: " + (System.nanoTime() - testStartTime));
    }

    @org.junit.jupiter.api.Test
    public void shouldAnswerWithTrue() {
        assertTrue(theCapitalOfGreatBritian().equals("London"));
    }

//    @org.junit.jupiter.api.Test
//    public void testConcat_validArgument_success() {
//        // given:
//  ...
//
//        // when:
//  ...
//
//        // then:
//        Assertions.***;
//    }

    @ParameterizedTest
    @MethodSource("methodSource")
    public void testParamMethodSourcecalculateRingArea(int a, int b, int expectedResult) {
        int result = calculateRingArea(b, a);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> methodSource() {
        return Stream.of(
                Arguments.of(10, 5, 235),
                Arguments.of(7, 4, 103)
        );
    }
}