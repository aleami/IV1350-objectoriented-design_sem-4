package se.kth.iv1350.repairelectricbike.model.dto;

import java.time.LocalDate;

/**
 * Contains repair order information and is used to transfer data between layers.
 */
public class RepairOrderDTO {

    private final int id;
    private final LocalDate date;
    private final String problemDesc;
    private final String state;

    /**
     * Creates a new RepairOrderDTO.
     *
     * @param id Identifier of the repair order.
     * @param date The date when the repair order was created.
     * @param problemDesc The description of the problem.
     * @param state The current state of the repair order.
     */
    public RepairOrderDTO(int id, LocalDate date, String problemDesc, String state) {
        this.id = id;
        this.date = date;
        this.problemDesc = problemDesc;
        this.state = state;
    }

    /**
     * @return Identifier of the repair order.
     */
    public int getId() {
        return id;
    }

    /**
     * @return The date when the repair order was created.
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @return The description of the problem.
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
}
