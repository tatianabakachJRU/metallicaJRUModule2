package elective_1.unicorn;

public class RainbowUnicorn  extends BasicUnicorn{
    public RainbowUnicorn(String name) {
        super(name, 70);
    }

    @Override
    public void useMagic() {
        System.out.printf("🌈 %s создает радугу!\n", getName());
    }
}
