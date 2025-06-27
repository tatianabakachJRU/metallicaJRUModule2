package lecture_17.dynamicproxy;

import java.lang.reflect.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        CatServiceImpl catService = new CatServiceImpl();

        CatService proxy = (CatService) Proxy.newProxyInstance(
                CatService.class.getClassLoader(),
                new Class<?>[] {CatService.class},
                new CatServiceProxy(catService)
        );

        proxy.introduceCat("Tom");
    }
}
