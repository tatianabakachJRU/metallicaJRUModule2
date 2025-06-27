package lecture_17.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CatServiceProxy implements InvocationHandler {
    private final CatService catService;

    public CatServiceProxy(CatService catService) {
        this.catService = catService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Логика перед вызовом метода");

        Object invoke = method.invoke(catService, args);

        System.out.println("Логика после вызова метода");

        return null;
    }
}
