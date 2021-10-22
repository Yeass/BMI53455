import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Podaj swoja wage (kg): ");
        double waga = myObj.nextDouble();

        System.out.println("Podaj swoj wzrost (cm): ");
        double wzrost = myObj.nextDouble();

        double bmi = (waga / (Math.pow(wzrost/100, 2)));
        System.out.println("Twoje BMI wynosi: " + bmi);

        System.out.println("Twoje przedzial BMI wynosi: ");
        if (bmi < 16) {
            System.out.println("Wyglodzenie");
        } if (bmi >= 16 && bmi <= 16.99) {
            System.out.println("Wychudzenie");
        } if (bmi >= 17 && bmi <= 18.49) {
            System.out.println("Niedowaga");
        } if (bmi >= 18.50 && bmi <= 22.99) {
            System.out.println("Norma niski przedzial");
        } if (bmi >= 23 && bmi <= 24.99) {
            System.out.println("Norma wysoki przedzial");
        } if (bmi >= 25 && bmi <= 27.49) {
            System.out.println("Nadwaga niski przedzial");
        } if (bmi >= 27.50 && bmi <= 29.99) {
            System.out.println("Nadwaga wysoki przedzial");
        } if (bmi >= 30 && bmi <= 34.9) {
            System.out.println("Otylosc I stopnia");
        } if (bmi >= 35 && bmi <= 39.9) {
            System.out.println("Otylosc II stopnia");
        } if (bmi >= 40) {
            System.out.println("Otylosc III stopnia");
        }
    }
}
