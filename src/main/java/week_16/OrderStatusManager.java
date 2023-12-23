package main.java.week_16;

public class OrderStatusManager {

    public enum OrderState {
        NEW, PENDING, SHIPPED, DELIVERED, CANCELLED
    }

    public OrderState nextState(OrderState currentState) {
        switch (currentState) {
            case NEW:
                return OrderState.PENDING;
            case PENDING:
                return OrderState.SHIPPED;
            case SHIPPED:
                return OrderState.DELIVERED;
            // Delivered and Cancelled are final states and cannot be transitioned from.
            case DELIVERED:
            case CANCELLED:
            default:
                return currentState;
        }
    }

    public OrderState cancelOrder(OrderState currentState) {
        // Orders can only be cancelled if they are NEW or PENDING.
        if (currentState == OrderState.NEW || currentState == OrderState.PENDING) {
            return OrderState.CANCELLED;
        } else {
        // If the order is SHIPPED or beyond, it cannot be cancelled.
            return currentState;
        }
    }



}
