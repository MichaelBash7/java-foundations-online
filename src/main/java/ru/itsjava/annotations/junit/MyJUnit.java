package ru.itsjava.annotations.junit;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MyJUnit {
    private final Object objTestClass;
    private int passedTests = 0;
    private int failedTests = 0;
    private final List<Method> beforeAllMethods = new ArrayList<>();
    private final List<Method> beforeMethod = new ArrayList<>();
    private final List<Method> afterMethod = new ArrayList<>();
    private final List<Method> afterAllMethod = new ArrayList<>();
    private final List<Method> testMethods = new ArrayList<>();


    @SneakyThrows
    public void start(){
        fillAllMethodsGroup();

        for (Method method : beforeAllMethods){
            method.invoke(objTestClass);
        }
        for (Method method : testMethods) {
            try {
                for (Method method1 : beforeMethod) {
                    method1.invoke(objTestClass);
                }
                method.invoke(objTestClass);
                System.out.println(method.getAnnotations()[1]);
                System.out.println(method.getName() + " PASSED!");
                passedTests++;
            } catch (InvocationTargetException exception) {
                System.out.println(method.getAnnotations()[1]);
                System.out.println(method.getName() + " FAILED!");
                failedTests++;
            }
            for (Method method2 : afterMethod){
                method2.invoke(objTestClass);
            }
        }
        for (Method method : afterAllMethod){
            method.invoke(objTestClass);
        }

        printResults();
    }


    private void fillAllMethodsGroup () {
        for (Method method : objTestClass.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(BeforeAll.class)) {
                beforeAllMethods.add(method);
            }if (method.isAnnotationPresent(Before.class)) {
                beforeMethod.add(method);
            }if (method.isAnnotationPresent(After.class)) {
                afterMethod.add(method);
            }if (method.isAnnotationPresent(AfterAll.class)) {
                afterAllMethod.add(method);
            } else if (method.isAnnotationPresent(Test.class)) {
                testMethods.add(method);
            }
        }
    }


    private void printResults() {
        System.out.println("==============================================");
        System.out.println("Кол-во пройденных тестов: " + passedTests);
        System.out.println("Кол-во упавших тестов: " + failedTests);
        System.out.println("==============================================");
    }
}
