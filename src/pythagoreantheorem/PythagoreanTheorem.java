/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagoreantheorem;

// Import java packages
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
import java.util.InputMismatchException;

/**
 *
 * @author Jeffrey.Herold
 */
public class PythagoreanTheorem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Pythagorean Theorem");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        
         //Perform pythagorean theorem until choice is not equal to 'y' or 'Y'
        String choice = "y";
        double sideA;
        double sideB;
        
        
        while (choice.equalsIgnoreCase("y")){
            
            // get user input
            try{
                System.out.print("Enter Side A ");
                sideA = sc.nextDouble();
            }catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Error! Invalid number. Try again.\n");
                System.out.println();
                continue;
            }
            
            try{
                System.out.print("Enter Side B ");
                sideB = sc.nextDouble();
            }catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("Error! Invalid number. Try again.\n");
                System.out.println();
                continue;
            }
            
            // calculate results
            // square side A
            double squareSideA = Math.pow(sideA, 2);
            
            // square side B
            double squareSideB = Math.pow(sideB, 2);
            
            // add side A and B and square root
            double hypotenuse = Math.sqrt(squareSideA + squareSideB);
            
            // format and display results
            NumberFormat number = NumberFormat.getNumberInstance();
            String hypotenuseString = number.format(hypotenuse);
            System.out.println(hypotenuseString);
            
            // see if user wants to continue
            System.out.print("Continue? (y/n):  ");
            choice = sc.next();
            System.out.println();
        }
    }
}
