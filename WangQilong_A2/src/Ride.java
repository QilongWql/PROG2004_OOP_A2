import java.util.Iterator;
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
    private LinkedList<Visitor> rideHistory;

    public Ride() {
        this.name = "";
        this.isOpen = false;
        this.operator = null;
        this.thrillLevel = ThrillLevel.MILD;
        this.facilityType = "";
        this.heightRestriction = 0.0;

        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    public Ride(String name, boolean isOpen, Employee operator, ThrillLevel thrillLevel, String facilityType, double heightRestriction, Queue<Visitor> Queue, LinkedList<Visitor> History) {
        this.name = name;
        this.isOpen = isOpen;
        this.operator = operator;
        this.thrillLevel = thrillLevel;
        this.facilityType = facilityType;
        this.heightRestriction = heightRestriction;
        this.waitingQueue = Queue;
        this.rideHistory = History;
    }

    // Add visitors to the queue
    @Override
    public void addVisitorToQueue(Visitor visitor){
        if (visitor != null) {
            waitingQueue.offer(visitor);
            System.out.println("Visitor added to the queue successfully!");
        } 
        else {
            System.out.println("Failed to add visitor: Visitor object is null!");
        }
    }

    // Remove the visitor from the queue
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor != null && waitingQueue.remove(visitor)) {
            System.out.println("Visitor removed from the queue successfully!");
        } 
        else {
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
        } 
        else {
            System.out.println("The waiting queue is empty!");
        }
    }

    // Add the visitor to the history
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        boolean isadd = rideHistory.add(visitor); // 尝试添加游客到LinkedList中
        if (isadd) {
            System.out.println("Success: Visitor added to ride history!");
        } 
        else {
            System.out.println("Failure: Visitor could not be added to ride history!");
        }
    }
    
    // Check whether the visitor is in the history
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean isfound = rideHistory.contains(visitor);
        if (isfound) {
            System.out.println("Visitor found in ride history!");
        } 
        else {
            System.out.println("Visitor not found in ride history!");
        }
        return isfound;
    }

    // Number of visitors in the history
    @Override
    public int numberOfVisitors() {
        int iscount = rideHistory.size();
        System.out.println("Number of visitors in ride history: " + iscount);
        return iscount;
    }
 
    // Print details of all visitors who have ridden the ride
    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = rideHistory.iterator();
        if (numberOfVisitors() != 0) {
            System.out.println("Visitor details: ");
        }
        else {
            System.out.println("There is no history!");
        }
        while (iterator.hasNext()) {
            Visitor visitor = iterator.next();
            visitor.printDetails();
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
    
    public LinkedList<Visitor> getRideHistory() {
        return rideHistory;
    }

    public void setRideHistory(LinkedList<Visitor> rideHistory) {
        this.rideHistory = rideHistory;
    }
}