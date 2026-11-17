/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem.pkg1;

import java.util.Scanner;

/**
 *
 * @author CORESIS_CPE113
 */
public class Problem1 {

    /**
     * @param total
     * @param count
     * @return 
     */
    
    
    public static double computeAverage(int total, int count) {
        if (count <= 0) { 
            return 0; 
        }
        return (double) total / count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input total: ");
        int total = (int) input.nextDouble();
        
        System.out.println("Input count: ");
        int count = (int) input.nextDouble();
        
        double result = computeAverage(total, count);
        System.out.printf("The result is: %.2f", result); 
        // I used a floting here to limit the result to 2 dicimal places only,
        // whihc wala gitudlo ni Sir and if gitudlo sorry po kay malimtanon lang, 
        // but it was a problem during testing various variables so I asked ai what could I do 
        // and it teached me using other examples not the solution to my code.
    }   
}       
        ///////////////////////////////
        //EXPLAIN - IN YOUR OWN WORDS//
        ///////////////////////////////
        
        //1. Why does the method need the word double (or a cast) in the return?
        // Ans: Base from my own undersatnding, if you use double not int it can calculate nummbers with decimal points
        // because if you only use int 5 / 2 will result to only 2 not 2.5, 
        // an int variable cannot show decimal places if can't the data is lacking.

        //2. What would go wrong without the count <= 0 guard?
        // if the count guard is gone the code would crash because anthing devided by zero it would return undefined.
