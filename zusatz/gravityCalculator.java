package zusatz;

public class gravityCalculator {
    public static void main(String [] args) {
        double gravity = 9.81;
        double initialVelocity = 4.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = .5 * gravity * fallingTime * fallingTime;
        finalPosition = finalPosition + initialVelocity * fallingTime;
        finalPosition = finalPosition + initialPosition;
        System.out.println("An object's position after " + fallingTime + " seconds is " + finalPosition + " meters.");


    }
}
