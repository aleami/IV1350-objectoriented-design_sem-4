package se.kth.iv1350.repairelectricbike.model.dto;

import java.time.LocalDate;
import java.util.List;

/**
 * Contains information about a repair order.
 * Used to transfer repair order data between different layers.
 */
public class RepairOrderInfoDTO {
    private final int id;
    private final LocalDate date;
    private final String problemDesc;
    private final String state;
    private final List<String> repairTasks;
    private final List<String> diagnosticResults;

    /**
     * Creates a new repair order information object.
     *
     * @param id The repair order ID.
     * @param date The date the repair order was created.
     * @param problemDesc The problem description.
     * @param state The current state of the repair order.
     * @param repairTasks The repair tasks for the repair order.
     * @param diagnosticResults The diagnostic results for the repair order.
     */
    public RepairOrderInfoDTO(int id, LocalDate date, String problemDesc, String state,
                              List<String> repairTasks, List<String> diagnosticResults) {
        this.id = id;
        this.date = date;
        this.problemDesc = problemDesc;
        this.state = state;
        this.repairTasks = List.copyOf(repairTasks);
        this.diagnosticResults = List.copyOf(diagnosticResults);
    }

    /**
     * @return The repair order ID.
     */
    public int getId() {
        return id;
    }

    /**
     * @return The date the repair order was created.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return The problem description.
     */
    public String getProblemDesc() {
        return problemDesc;
    }

    /**
     * @return The current state of the repair order.
     */
    public String getState() {
        return state;
    }

    /**
     * @return The repair tasks for the repair order.
     */
    public List<String> getRepairTasks() {
        return repairTasks;
    }

    /**
     * @return The diagnostic results for the repair order.
     */
    public List<String> getDiagnosticResults() {
        return diagnosticResults;
    }
}
