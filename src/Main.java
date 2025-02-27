//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HumanBMI humanBMI = new HumanBMI(80,1.52);
        System.out.println(humanBMI.determineBMICategory());
    }
}
class HumanBMI {
    private double weight; //Weight Human
    private double height; // Height Human
    private double bodyMassIndex;
    private static final double UNDERWEIGHT = 18.5;
    private static final double NORMAL_WEIGHT = 25.0;
    private static final double OVERWEIGHT = 30.0;

    public HumanBMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.calculateBMI();
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
        this.calculateBMI();
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
        this.calculateBMI();
    }

    private void calculateBMI(){
        this.bodyMassIndex = this.weight / (this.height * this.height);
    }

    public  double getBodyMassIndex() {
        return bodyMassIndex;
    }
    public String determineBMICategory() {
        String  category = "";
        if (bodyMassIndex >= UNDERWEIGHT && bodyMassIndex < NORMAL_WEIGHT) {
            category ="Norm";
        }
        else if (bodyMassIndex >= NORMAL_WEIGHT && bodyMassIndex < OVERWEIGHT) {
            category ="Warning! ";
        }
        else if (bodyMassIndex >= OVERWEIGHT) {
            category ="Fat";
        }
        else if (bodyMassIndex < UNDERWEIGHT) {
            category ="Deficit";
        }
        return category;
    }
}