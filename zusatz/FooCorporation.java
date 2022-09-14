package MIT.java;

public class FooCorporation {

    public static void main(String[] args) {
        double wage = 8.00;
        int hours = 60;
        double pay = 8.00;

        if (hours < 40) {
            pay = pay + (hours * wage);
        } else if (hours > 40) {
            pay = pay + (40 * wage) + ((hours - 40) * (wage * 1.5));
        } else {
            double maximum = pay + ((40 * wage) + (20 * (wage * 1.5)));
            if (hours == 60) {
                pay = maximum;
            } else if (hours > 60) {
                pay = maximum;
            }
        }
        System.out.println("You worked " + hours + " hours and earned " + pay + " €.");
    }
}
//Foo Corporation needs a program to calculate
//how much to pay their employees.
//1. Pay = hours worked x base pay
//2. Hours over 40 get paid 1.5 the base pay
//3. The base pay must be no less than 8.00 €
//4. The number of hours must be no more than 60