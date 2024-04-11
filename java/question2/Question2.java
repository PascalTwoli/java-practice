import java.util.Scanner;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        areaCircle(radius);

        int[][] numbers = {{2, 4}, {4, 16}, {6, 36}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ") ;
            }
            System.out.println();
        }
    }

    private static void areaCircle(Scanner scanner) {
        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: "+ areaOfCircle);
    }
}
