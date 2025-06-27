package lecture_17.dynamicproxy;

public class CatServiceImpl implements CatService{

    @Override
    public void introduceCat(String name) {
        System.out.println("Оказание услуг для кота " + name);
    }
}
