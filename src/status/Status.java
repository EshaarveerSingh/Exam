
package status;

import java.util.Scanner;

/**  
 * @author eshaarveerSingh
 */
public class Status {


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
