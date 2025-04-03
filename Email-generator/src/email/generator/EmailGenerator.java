/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package email.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */

    
public class EmailGenerator {

    /**
     * @param args the command line arguments
     */
    
    static BufferedWriter writer;//add buffer to write the email to the file
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
      
            System.out.print("Output filename (e.g. output.txt): ");
            String filename = scanner.next();
           
            
            //this where you going to write the email you want
            // you can change the int for waht you want 
            //the email is starting with a year and three number after the year
            int student = 2021000;
            String email = "@student.example.org";
            
            try{
                while(student  < 2021999){
                    writer = new BufferedWriter(new FileWriter(filename));
                    System.out.println("Generating combinations...");
                    
                    String fullEmail = student +email;
                    writer.write(fullEmail);
                    student++;
                }
            
            
            
            }catch(Exception e){
                System.out.println("err");
            }
                             
        
        
    }
    
}
