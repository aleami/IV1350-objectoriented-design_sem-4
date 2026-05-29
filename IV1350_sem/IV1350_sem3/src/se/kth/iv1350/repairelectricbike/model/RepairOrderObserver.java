package se.kth.iv1350.repairelectricbike.model;
/**
 * A listener interface for receiving notifications about updated repair orders.
 * The class that is interested in such notifications implements this interface and
 * register themselves with a {@link RepairOrder}.
 */

public interface RepairOrderObserver {

    /**
     * Invoked when a repair order has been updated.
     *
     * @param repairOrderInfo Information about the updated repair order.
     * */
    void repairOrderUpdated(String repairOrderInfo);
}