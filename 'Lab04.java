
//Joonhyuk Kim
//9-22-2015
//csm10j
package lab04;
//import classes
import java.util.Scanner;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.lang.Math;

/**
 *
 * @author Lenmiukim
 */
public class Lab04 {
    public static void main(String[] args) throws FileNotFoundException{

     //declare inFile and outFile to be refrence
    Scanner inFile;
    PrintWriter outFile;
    
     //write statements to open file to read in data, and 
     // to output a file.
        inFile = new Scanner(new FileReader("input.txt"));
     //outFile = new PrintWriter("outData.txt");
        outFile = new PrintWriter("output.txt");
        
        
     //declare variables
        double num1, num2, num3, num4, num5;
     //read in values from the text file
        num1 = inFile.nextDouble();
        num2 = inFile.nextDouble();
        num3 = inFile.nextDouble();
        num4 = inFile.nextDouble();
        num5 = inFile.nextDouble();
     //outfile must be in original values in integer form.
        outFile.printf("Input: " + (int)num1 +" " + (int)num2 
                + " " + (int)num3 +" " + (int)num4 + " " +(int)num5 );
        outFile.println();
     //invoking mean() and standardDeviation() methods
        double Mean1;
        
        double standardDeviation;
        double roundDecimal1;
        double roundDecimal2;
     //Use the method to pass the 5 values and return the calculated value 
     //back to main
        Mean1 = computeMean(num1, num2, num3, num4, num5);
     //same as above... pass 5 values, but also pass the computed average, mean.
        standardDeviation = computeStandardDeviation(num1, num2, num3, num4, num5, Mean1);
        
     //rounding the mean and stdDev to 2 decimal places
        
        //the 2 indicates that it will be rounded to 2 decimal places
        int a = 2;
        roundDecimal1 = roundToDecimals(Mean1, a);
        
        roundDecimal2 = roundToDecimals(standardDeviation, a);
        
        //System.out.println("The mean is " + Mean1);
        //System.out.println("The standard deviation is " + standardDeviation);
        
        
     //output the result to the file.
        
        //roundDecimal1 is the rounded form of Mean to 2 decimal places
        outFile.printf("Mean: " + roundDecimal1);
        outFile.println();
        //roundDecimal2 is the rounded form of stdDev to 2 decimal places
        outFile.print("StdDev: " + roundDecimal2);
     //close
        inFile.close();
        outFile.close();
         
    }
    public static double computeMean (double x1, double x2, double x3, double x4, double x5)
    {
        /*Scanner inFile;
        
        Scanner group1 = new Scanner(new FileReader("input.txt"));
        
        double total2;
        int num1 = 0;
        
        while (group1.hasNext())
        {
            total2 += group1.next();
            num1++
        }
        double avg1;
        
        avg1 = total2 / num1;*/
        
        double avg1;
        
        avg1 = (x1 + x2 + x3 + x4 + x5)/5;  
        
        return (avg1);
    }
    public static double computeStandardDeviation(double x1, double x2, double x3, double x4, double x5, double Mean2)
    {
        
    //if the mean is not computed and is not passed     
       // double avg2 = (x1 + x2 + x3 + x4 + x5) / 5;
        
        /*a = Math.pow(2.0, (x1 - avg2));
        b = Math.pow(2.0, (x2 - avg2));
        c = Math.pow(2.0, (x3 - avg2));
        d = Math.pow(2.0, (x4 - avg2));
        e = Math.pow(2.0, (x5 - avg2));*/
        //stdDev1 = Math.sqrt(((a + b + c + d + e)/5));
        
    //if the mean is computed and is passed from main
        double a, b, c, d, e, stdDev1, total1;
        a = Math.pow(2.0, (x1 - Mean2));
        b = Math.pow(2.0, (x2 - Mean2));
        c = Math.pow(2.0, (x3 - Mean2));
        d = Math.pow(2.0, (x4 - Mean2));
        e = Math.pow(2.0, (x5 - Mean2));
        
        total1 = (a + b + c + d + e)/5;
        
        stdDev1 = Math.sqrt(total1);
    //return the value of stdDev to main.
        return (stdDev1);
    }   
    
    public static double roundToDecimals(double d, int c)  
{   
   int temp = (int)(d * Math.pow(10 , c));  
   
   return ((double)temp)/Math.pow(10 , c);  
}
}
