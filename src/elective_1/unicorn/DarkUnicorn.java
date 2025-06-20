package elective_1.unicorn;

public class DarkUnicorn extends BasicUnicorn{
    public DarkUnicorn(String name) {
        super(name, 60);
    }

    @Override
    public void useMagic() {
        System.out.printf("☠ %s использует темную энергию!\n", getName());
    }
}
