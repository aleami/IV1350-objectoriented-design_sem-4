package se.kth.iv1350.repairelectricbike.model;
import se.kth.iv1350.repairelectricbike.model.dto.RepairOrderInfoDTO;
/**
 * A listener interface for receiving notifications about updated repair orders.
 */

public interface RepairOrderObserver {

    /**
     * Invoked when a repair order has been updated.
     *
     * @param repairOrderInfo Contains information about the updated repair order.
     */
    void repairOrderUpdated(RepairOrderInfoDTO repairOrderInfo);
}