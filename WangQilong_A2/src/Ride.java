import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    public enum ThrillLevel {
        MODERATE,
        MILD,
        MAX
    }

    private String name;
    private boolean isOpen;
    private Employee operator;
    private ThrillLevel thrillLevel;
    private String facilityType;
    private double heightRestriction;
    private Queue<Visitor> waitingQueue;

    public Ride() {
        this.name = "";
        this.isOpen = false;
        this.operator = null;
        this.thrillLevel = ThrillLevel.MILD;
        this.facilityType = "";
        this.heightRestriction = 0.0;

        this.waitingQueue = new LinkedList<>();
    }

    public Ride(String name, boolean isOpen, Employee operator, ThrillLevel thrillLevel, String facilityType, double heightRestriction, Queue<Visitor> Queue) {
        this.name = name;
        this.isOpen = isOpen;
        this.operator = operator;
        this.thrillLevel = thrillLevel;
        this.facilityType = facilityType;
        this.heightRestriction = heightRestriction;
        this.waitingQueue = Queue;
    }

    // Add visitors to the queue
    @Override
    public void addVisitorToQueue(Visitor visitor){
        if (visitor != null) {
            waitingQueue.offer(visitor);
            System.out.println("Visitor added to the queue successfully!");
        } else {
            System.out.println("Failed to add visitor: Visitor object is null!");
        }
    }

    // Remove the visitor from the queue
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor != null && waitingQueue.remove(visitor)) {
            System.out.println("Visitor removed from the queue successfully!");
        } else {
            System.out.println("Failed to remove visitor: Visitor not found in the queue or Visitor object is null!");
        }
    }

    // Print visitor details
    @Override
    public void printQueue() {
        if (!waitingQueue.isEmpty()) {
            System.out.println("Waiting Queue:");
            for (Visitor visitor : waitingQueue) {
                visitor.printDetails();
            }
        } else {
            System.out.println("The waiting queue is empty!");
        }
    }

    // Setter() and Getter() methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public ThrillLevel getThrillLevel() {
        return thrillLevel;
    }

    public void setThrillLevel(ThrillLevel thrillLevel) {
        this.thrillLevel = thrillLevel;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public double getHeightRestriction() {
        return heightRestriction;
    }

    public void setHeightRestriction(double heightRestriction) {
        this.heightRestriction = heightRestriction;
    }
    
    public Queue<Visitor> getWaitingQueue() {
        return waitingQueue;
    }

    public void setWaitingQueue(Queue<Visitor> waitingQueue) {
        this.waitingQueue = waitingQueue;
    }
}