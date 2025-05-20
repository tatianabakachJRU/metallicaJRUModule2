package lecture_7.switchExpression;

public class SwitchExpressionExample_1 {
    public static void main(String[] args) {

        String product = "Apple";
        String productType;
        productType = switch (product) {
            case "Apple" -> {
                int sum = 2 + 2;
                System.out.println("This is fruit");
                yield "We have " + sum + " apples";
            }
            case "Peach" -> "Fruit";
            case "Raspberry" -> "Berry";
            case null -> "We don't have fruits";
            default -> "other";
        };
        System.out.println(productType);

    }
}
