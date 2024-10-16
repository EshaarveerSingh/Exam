/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package status;

/**
 *
 * @author eshaarveerSingh
 */
public enum NewUn {
    REJECTED("Rejected: User has been rejected."),
    PENDING("Pending: User application is pending."),
    PROCESSING("Processing: User application is being processed."),
    APPROVED("Approved: User has been approved.");

    private final String description;

    NewUn(String description) {
        this.description = description;
    }

    public void printStatus() {
        System.out.println(this.description);
    }
}
