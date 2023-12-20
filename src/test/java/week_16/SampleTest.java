package test.java.week_16;

import org.junit.jupiter.api.*;


public class SampleTest {
    @BeforeAll
    static void setUp(){
        System.out.println("Setting up shared resources...");
    }

    @BeforeEach
    void init(){
        System.out.println("Starting a new test...");
    }

    @Test
    void testExample(){
        System.out.println("Running testExample...");
        Assertions.assertTrue(3 > 2, "Check if 3 is greater than 2");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Cleaning up after a test...");
    }

    @AfterAll
    static void cleanUp(){
        System.out.println("Cleaning up shared resources...");
    }
}
