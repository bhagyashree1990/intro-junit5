package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {
    private Greeting greeting;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("Before Class - Called only once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Inside Before Each");
        greeting=new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloJohn() {
        System.out.println(greeting.helloWorld("John"));
    }

    @Test
    void testHelloSam() {
        System.out.println(greeting.helloWorld("Sam"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");
    }

    @AfterAll
    public static void afterClass(){
        System.out.println("After Class - Called only once");
    }

}