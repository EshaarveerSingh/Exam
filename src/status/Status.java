/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author eshaarveerSingh
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
  Scanner in = new Scanner(System.in);
        System.out.println("Select the user status code (0-3):\n0. Rejected\n1. Pending\n2. Processing\n3. Approved");
        try {
            int codeIndex = in.nextInt();
            if (codeIndex >= 0 && codeIndex < NewUn.values().length) {
                NewUn status = NewUn.values()[codeIndex];
                new StausUser().statusDetail(status);
            } else {
                System.out.println("Invalid status code. Please enter a number between 0 and 3.");
            }
        } finally {
            in.close();
        }
    }
    
}
