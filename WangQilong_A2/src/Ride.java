import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    public enum ThrillLevel {
        MODERATE,
        MILD,
        MAX
    }

    private String rideName;
    private boolean isOpen;
    private Employee operator;
    private ThrillLevel thrillLevel;
    private String facilityType;
    private double heightRestriction;

    private Queue<Visitor> Queue;
    private LinkedList<Visitor> Collection;

    private Integer maxRider;
    private Integer numOfCycles;


    public Ride() {
        this.rideName = "";
        this.isOpen = false;
        this.operator = null;
        this.thrillLevel = ThrillLevel.MILD;
        this.facilityType = "";
        this.heightRestriction = 0.0;

        this.Queue = new LinkedList<>();
        this.Collection = new LinkedList<>();

        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    public Ride(String rideName, boolean isOpen, Employee operator, ThrillLevel thrillLevel, String facilityType, double heightRestriction, Queue<Visitor> Queue, LinkedList<Visitor> Collection, Integer maxRider, Integer numOfCycles) {
        setRideName(rideName);
        setOpen(isOpen);
        setOperator(operator);
        setThrillLevel(thrillLevel);
        setFacilityType(facilityType);
        setHeightRestriction(heightRestriction);
        setWaitingQueue(Queue);
        setRideHistory(Collection);
        setMaxRider(maxRider);
        setNumOfCycles(numOfCycles);
    }

    // The ride runs one lap
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("The ride cannot operate without an operator assigned to it!");
            return;
        }
 
        if (Queue.isEmpty()) {
            System.out.println("There are no waiting tourists in the queue, it cannot run!");
            return;
        }
 
        int ridersTaken = 0;
        while (!Queue.isEmpty() && ridersTaken < maxRider) {
            Visitor visitor = Queue.poll();
            Collection.add(visitor);
            ridersTaken++;
        }
 
        numOfCycles++;
        System.out.println("The amusement facilities have been running for a cycle and are carried together " + ridersTaken + " visitors!");
    }

    // Add visitors to the queue
    @Override
    public void addVisitorToQueue(Visitor visitor){
        if ((visitor != null) && (visitor.getHeight() >= heightRestriction)) {
            Queue.offer(visitor);
            System.out.println("Visitor added to the queue successfully!");
        } 
        else {
            System.out.println("Visitor's height is too low!");
        }
    }

    // Remove the visitor from the queue
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor != null && Queue.remove(visitor)) {
            System.out.println("Visitor removed from the queue successfully!");
        } 
        else {
            System.out.println("Failed to remove visitor: Visitor not found in the queue or Visitor object is null!");
        }
    }

    // Print visitor details
    @Override
    public void printQueue() {
        if (!Queue.isEmpty()) {
            System.out.println("Waiting Queue:");
            for (Visitor visitor : Queue) {
                visitor.printDetails();
            }
        } 
        else {
            System.out.println("The waiting queue is empty!");
        }
    }

    // Add the visitor to the Collection
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        boolean isadd = Collection.add(visitor);
        if (isadd) {
            System.out.println("Success: Visitor added to ride history!");
        } 
        else {
            System.out.println("Failure: Visitor could not be added to ride history!");
        }
    }
    
    // Check whether the visitor is in the Collection
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean isfound = Collection.contains(visitor);
        if (isfound) {
            System.out.println("Visitor found in ride history!");
        } 
        else {
            System.out.println("Visitor not found in ride history!");
        }
        return isfound;
    }

    // Number of visitors in the Collection
    @Override
    public int numberOfVisitors() {
        int iscount = Collection.size();
        System.out.println("Number of visitors in ride history: " + iscount);
        return iscount;
    }
 
    // Print details of all visitors who have ridden the ride
    @Override
    public void printRideHistory() {
        Iterator<Visitor> iterator = Collection.iterator();
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

    // Sort the collection
    public void sortVisitors() {
        Collections.sort(Ride.this.Collection, new VisitorComparator());
    }

    // Setter() and Getter() methods
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public boolean getOpen() {
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
        return Queue;
    }

    public void setWaitingQueue(Queue<Visitor> Queue) {
        this.Queue = Queue;
    }
    
    public LinkedList<Visitor> getRideHistory() {
        return Collection;
    }

    public void setRideHistory(LinkedList<Visitor> Collection) {
        this.Collection = Collection;
    }

    public Integer getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(Integer maxRider) {
        if (maxRider < 1) {
            throw new IllegalArgumentException("Maximum Rider capacity less than one person!");
        }
        this.maxRider = maxRider;
    }

    public Integer getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(Integer numOfCycles) {
        if (numOfCycles != 0) {
            throw new IllegalArgumentException("Please check the number of cycles!");
        }
        this.numOfCycles = numOfCycles;
    }
}