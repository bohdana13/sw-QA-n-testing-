


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HumanIMB human = new HumanIMB(80, 1.52);
        System.out.println(human.getResult());
    }
}
class HumanIMB {
    private double weight; //Weight Human
    private double height; // Height Human

    public HumanIMB(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateIMB() {
        return weight / (height * height);
    }
    public String getResult() {
        double imb = calculateIMB();
        if (imb < 18.5) {
            return "Deficit";
        } else if (imb < 25) {
            return "Norm";
        } else if (imb < 30) {
            return "Warning!";
        } else {
            return "Fat";
        }
    }
}