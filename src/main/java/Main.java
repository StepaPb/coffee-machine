import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var toshiba = new CoffeeMachine(100, 100, 100);
        var scanner = new Scanner(System.in);
        boolean powerOfMachine = true;
        while (powerOfMachine) {
        String i = scanner.next().toLowerCase();
            switch (i) {
                case "latte":
                    int n = scanner.nextInt();
                    toshiba.createLatte(n);
                    break;
                case "cappuccino":
                    n = scanner.nextInt();
                    toshiba.createCappuccino(n);
                    break;
                case "lungo":
                    n = scanner.nextInt();
                    toshiba.createLungo(n);
                    break;
                case "espresso":
                    n = scanner.nextInt();
                    toshiba.createEspresso(n);
                    break;
                case "ristretto":
                    n = scanner.nextInt();
                    toshiba.createRistretto(n);
                    break;
                case "water":
                    n = scanner.nextInt();
                    toshiba.addWater(n);
                    break;
                case "milk":
                    n = scanner.nextInt();
                    toshiba.addMilk(n);
                    break;
                case "coffee":
                    n = scanner.nextInt();
                    toshiba.addCoffee(n);
                    break;
                case "turn":
                     String y = scanner.next().toLowerCase();
                    if (y.equals("off")) {
                        powerOfMachine = false;
                    }
                    break;
                default:
                    System.out.println("Неверная комманда");
            }

        }

    }
}

