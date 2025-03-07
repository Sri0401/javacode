import java.util.Scanner;
 class Person {
    private double weight;
    private double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculatebmi() {
        return weight / (height * height);
    }

    public String Categorybmi(double bmi) {
        if (bmi < 18.5) {
            return "mal-nurished";
        }
        else if (bmi > 18.5 && bmi < 24.5) {
            return "Healthy";
        }
        else if (bmi > 24.5 && bmi < 29.5) {
            return "OverWeight";
        }
        else {
            return "Obese";
        }
    }
}

public class BMIapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you weight (in Kgs): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.print("Invalid input, please enter the correct values.");
            return;
        }

        Person person = new Person(weight, height);
        double bmi = person.calculatebmi();
        String category = person.Categorybmi(bmi);

        System.out.println("Your bmi is " + bmi);
        System.out.println("Your bmi category is " + category);

        scanner.close();
    }
}