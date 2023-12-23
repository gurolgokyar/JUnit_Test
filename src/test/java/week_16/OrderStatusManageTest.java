package test.java.week_16;

import main.java.week_16.OrderStatusManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderStatusManageTest {

    OrderStatusManager manager = new OrderStatusManager();

    @Test
    void testNextStataTransitionFromNewToPending() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.PENDING;
        OrderStatusManager.OrderState actual = manager.nextState(OrderStatusManager.OrderState.NEW);
        assertEquals(expected, actual);
    }

    @Test
    void testNextStataTransitionFromPendingToShipped() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.SHIPPED;
        OrderStatusManager.OrderState actual = manager.nextState(OrderStatusManager.OrderState.PENDING);
        assertEquals(expected, actual);
    }

    @Test
    void testNextStataTransitionFromShippedToDelivered() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.DELIVERED;
        OrderStatusManager.OrderState actual = manager.nextState(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(expected, actual);
    }

    @Test
    void testNextStataTransitionFromDelivered() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.DELIVERED;
        OrderStatusManager.OrderState actual = manager.nextState(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(expected, actual);
    }

    @Test
    void testNextStataTransitionFromCancelled() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.CANCELLED;
        OrderStatusManager.OrderState actual = manager.nextState(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(expected, actual);
    }

    @Test
    void testCancelOrderFromNewState() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.CANCELLED;
        OrderStatusManager.OrderState actual = manager.cancelOrder(OrderStatusManager.OrderState.NEW);
        assertEquals(expected, actual);
    }

    @Test
    void testCancelOrderFromPendingState() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.CANCELLED;
        OrderStatusManager.OrderState actual = manager.cancelOrder(OrderStatusManager.OrderState.PENDING);
        assertEquals(expected, actual);
    }

    @Test
    void testCancelOrderFromShippedState() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.SHIPPED;
        OrderStatusManager.OrderState actual = manager.cancelOrder(OrderStatusManager.OrderState.SHIPPED);
        assertEquals(expected, actual);
    }

    @Test
    void testCancelOrderFromDeliveredState() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.DELIVERED;
        OrderStatusManager.OrderState actual = manager.cancelOrder(OrderStatusManager.OrderState.DELIVERED);
        assertEquals(expected, actual);
    }

    @Test
    void testCancelOrderFromCancelledState() {
        OrderStatusManager.OrderState expected = OrderStatusManager.OrderState.CANCELLED;
        OrderStatusManager.OrderState actual = manager.cancelOrder(OrderStatusManager.OrderState.CANCELLED);
        assertEquals(expected, actual);
    }
}
