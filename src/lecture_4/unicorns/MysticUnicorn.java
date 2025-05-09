package lecture_4.unicorns;

public class MysticUnicorn implements Unicorn {
    private int speed;
    private String color;

    public MysticUnicorn() {
        this.speed = 0;
        this.color = "Розовый";
    }

    @Override
    public void gallop() {
        if (speed < MAX_SPEED) {
            speed += 15;
            System.out.println(color + " мистический единорог бежит со скоростью " + speed);
        } else {
            System.out.println(color + " мистический единорог бежит с максимальной скоростью");
        }
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase(FAVORITE_FOOD)) {
            System.out.println(color + " мистический единорог счастлив кушать " + food);
        } else {
            System.out.println(color + " мистический единорог не любит кушать " + food);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Это мистический единорог");
    }
}
