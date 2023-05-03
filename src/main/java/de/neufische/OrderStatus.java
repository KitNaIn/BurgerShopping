package de.neufische;

public enum OrderStatus {

    RECEIVED("Received"),
    IN_PROGRESS("In Progress"),
    IN_DELIVERY("In Delivery"),
    COMPLETED("Completed"),
    CANCELED("Canceled");


    private final String status;

    OrderStatus(String status) {
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

    @Override
    public String toString() {
        return "OrderStatus{" +
                "status='" + status + '\'' +
                "} " + super.toString();
    }
}
