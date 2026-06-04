package se.kth.iv1350.repairelectricbike.model.dto;
import java.time.LocalDate;
import java.util.List;

/**
 * Contains information about a repair order.
 * Used to transfer repair order data between different layers.
 */

public record RepairOrderInfoDTO(
        int id,
        LocalDate date,
        String problemDesc,
        String state,
        List<String> repairTasks,
        List<String> diagnosticResults) {


    /**
     * Creates a new repair order information object.
     * @param id The repair order ID.
     * @param date The date the repair order was created.
     * @param problemDesc The problem description.
     * @param state The current state of the repair order.
     * @param repairTasks The repair tasks for the repair order.
     * @param diagnosticResults The diagnostic results for the repair order.
     */
    public RepairOrderInfoDTO {
        repairTasks = List.copyOf(repairTasks);
        diagnosticResults = List.copyOf(diagnosticResults);
    }

   /**
     * Returns a string representation of the repair order information.
     * @return A formatted string containing repair order details.
     */
    @Override
    public String toString() {
        return "Repair Order ID: " + id + "\n"
                + "Date: " + date + "\n"
                + "Problem: " + problemDesc + "\n"
                + "State: " + state + "\n"
                + "Repair Tasks: " + repairTasks + "\n"
                + "Diagnostic Results: " + diagnosticResults;
    }
}