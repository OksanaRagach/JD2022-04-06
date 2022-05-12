package by.it.korennaya.jd01_10;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintString {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] methods = stringClass.getDeclaredMethods();
        for (Method method : methods) {
            if ((!Modifier.isStatic(method.getModifiers()))) {
                String name = method.getName();
                System.out.println(name);
            }
        }
    }
}