package lecture_4.unicorns;

public class SparkleUnicorn extends MagicCreature implements Unicorn {
    private int speed;
    private String color;

    public SparkleUnicorn() {
        super("Искорка");
        this.speed = 0;
        this.color = DEFAULT_COLOR;
    }

    @Override
    public void gallop() {
        if (speed < MAX_SPEED) {
            speed += 20;
            System.out.println(name + " " + color + " искрящийся единорог бежит со скоростью " + speed);
        } else {
            System.out.println(color + " искрящийся единорог бежит с максимальной скоростью");
        }
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase(FAVORITE_FOOD)) {
            System.out.println(color + " искрящийся единорог счастлив кушать " + food);
        } else {
            System.out.println(color + " искрящийся единорог не любит кушать " + food);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Это искрящийся единорог");
    }

    @Override
    public void performMagic() {
        System.out.println(name + " единорог творит магию!");
    }
}
