package com.gmail;

import org.junit.jupiter.api.*;

@DisplayName("It is a magic")
public class FirstSimpleTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("@Befoure method");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("        @BeforEach method");
    }
    @AfterEach
    void afterEach(){
        System.out.println("        @AfterEach method");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll method");
    }
    @DisplayName("It is a test AssertTrue")
    @Test
    void firstTest(){
        System.out.println("        It is a test AssertTrue");
        Assertions.assertTrue(10>1);

    }

    @DisplayName("It is a test AssertEquals")
    @Test
    void SecondTest(){
        System.out.println("        It is a test AssertEquals");
        Assertions.assertEquals(10, 10);

    }
}
