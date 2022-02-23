import java.sql.SQLOutput;

public class CoffeeMachine{

    private double coffeeTank;
    private double waterTank;
    private double milkTank;

    public CoffeeMachine(int coffeeTank, int waterTank, int milkTank) {
        this.coffeeTank = coffeeTank;
        this.waterTank = waterTank;
        this.milkTank = milkTank;
    }

    public void addWater(int N) {
        this.waterTank = N + this.waterTank;
        this.showTank();
    }
    public void addCoffee(int N) {
        this.coffeeTank = N + this.coffeeTank;
        this.showTank();
    }
    public void addMilk(int N) {
        this.milkTank = N + this.milkTank;
        this.showTank();
    }

    public void createLatte(int N) {
        if (N >= 10) {
            this.waterTank = this.waterTank - N * 0.3;
            this.coffeeTank = this.coffeeTank - N * 0.10;
            this.milkTank = this.milkTank - N * 0.60;
            this.showTank();
        }
        else System.out.println("Малый объем напитка");
    }
    public void createCappuccino(int N) {
        if (N >= 10) {
            this.waterTank = this.waterTank - N * 0.40;
            this.coffeeTank = this.coffeeTank - N * 0.15;
            this.milkTank = this.milkTank - N * 0.45;
            this.showTank();
        }
        else System.out.println("Малый объем напитка");
    }
    public void createLungo(int N) {
        if (N >= 10) {
            this.waterTank = this.waterTank - N * 0.85;
            this.coffeeTank = this.coffeeTank - N * 0.15;
            this.showTank();
        }
        else System.out.println("Малый объем напитка");
    }
    public void createEspresso(int N) {
        if (N >= 10) {
            this.waterTank = this.waterTank - N * 0.70;
            this.coffeeTank = this.coffeeTank - N * 0.30;
            this.showTank();
        }
        else System.out.println("Малый объем напитка");
    }
    public void createRistretto(int N) {
        if (N >= 10) {
            this.waterTank = this.waterTank - N * 0.50;
            this.coffeeTank = this.coffeeTank - N * 0.50;
            this.showTank();
        }
        else System.out.println("Малый объем напитка");
    }

    private void showTank() {
        System.out.println(this.coffeeTank + " " + this.waterTank + " " + this.milkTank);
    }

}

