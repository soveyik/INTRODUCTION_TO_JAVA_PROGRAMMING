package ch09_ex10;

import java.util.Scanner;

public class QuadraticEquationTestter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter values for a, b and c");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();
        System.out.println("discriminant is %.2f "+ discriminant);

        if(discriminant > 0){
            System.out.println(" the quadratic equation has two roots\n");
            System.out.println("root1:  "+ quadraticEquation.getRoot1());
            System.out.println("\nroot2 : "+ quadraticEquation.getRoot2());
        }
        else if(discriminant == 0){
            System.out.println("the quadratic equation has one root\n ");
            System.out.println("root is :  "+ quadraticEquation.getRoot1());
            System.out.println();

        }
        else{
            System.out.println("this quadratic equation has not roots...");
        }

    }
}
