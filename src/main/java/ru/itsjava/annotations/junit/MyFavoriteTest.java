package ru.itsjava.annotations.junit;

public class MyFavoriteTest {

    @BeforeAll
    public void beforeAllMethod(){
        System.out.println("BEFORE ALL");
    }

    @Before
    public void beforeMethod(){
        System.out.println("BEFORE");
    }
    @After
    public void afterMethod(){
        System.out.println("AFTER");
    }

    @AfterAll
    public void afterAllMethod(){
        System.out.println("AFTER ALL");
    }


    @Test
    @DisplayName(testName = "Тест1")
    public void test1(){}


    @Test
    @DisplayName(testName = "Тест2")
    public void test2(){}


    @Test
    @DisplayName(testName = "Тест3")
    public void test3(){
        throw new RuntimeException();
    }


    @Test
    @DisplayName(testName = "Тест4")
    public void test4(){
        throw new RuntimeException();
    }

    public void noTestMethod(){}
}
