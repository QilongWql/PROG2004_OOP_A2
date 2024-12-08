import java.util.LinkedList;
import java.util.Queue;

public class AssignmentTwo {
    public static void main(String[] args){
        // Employee employee1 = new Employee(
        //     "WangQilong",
        //     21, 
        //     Person.Gender.MALE,
        //     "1565233566646464654654564",
        //     "001",
        //     "full-time",
        //     "15131129006"
        // );
        // employee1.printDetails();
        // Employee employee = new Employee();
 
        // employee.setAge(12);
        // employee.setName("fdsf");
        // employee.setGender(Person.Gender.MALE);
        // employee.setPhoneNumber("156456322");
        // employee.setEmployeeId("E001");
        // employee.setShiftPattern("Full-time");
        // employee.setEmergencyContact("1234567890");
        // employee.printDetails();

        new AssignmentTwo().partThree();
    }

    public void partThree(){
        Queue<Visitor> queue1 = new LinkedList<>();
        LinkedList<Visitor> collection1 = new LinkedList<>();
        Queue<Visitor> queue2 = new LinkedList<>();
        LinkedList<Visitor> collection2 = new LinkedList<>();
        Ride ride = new Ride("Roller Coaster", true, new Employee(), Ride.ThrillLevel.MILD, "Coaster", 1.4, queue1, collection1, 2, 0);
 
        Visitor visitor1 = new Visitor("Alice", 30, Person.Gender.FEMALE, "1234567890", 1.4, Visitor.MembershipType.GOLD, "123 Main St");
        Visitor visitor2 = new Visitor("Bob", 25, Person.Gender.MALE, "0987654321", 1.3, Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor3 = new Visitor("Charlie", 35, Person.Gender.MALE, "5551234567", 1.8, Visitor.MembershipType.BRONZE, "789 Oak St");
        Visitor visitor4 = new Visitor("Diana", 28, Person.Gender.FEMALE, "5559876543", 1.7, Visitor.MembershipType.GOLD, "101 Pine St");
        Visitor visitor5 = new Visitor("Eve", 22, Person.Gender.FEMALE, "5553216549", 2.1, Visitor.MembershipType.BASIC, "202 Birch St");
 
        Visitor visitor6 = new Visitor("Bob2", 28, Person.Gender.MALE, "0987654321", 1.3, Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor7 = new Visitor("Bob1", 36, Person.Gender.MALE, "0987654321", 1.3, Visitor.MembershipType.SILVER, "456 Elm St");
        
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);

        // Visitor removedVisitor = visitor5;
        // ride.removeVisitorFromQueue(removedVisitor);
        // System.out.println("Removed visitor: " + removedVisitor);


        ride.printRideHistory();

        ride.printQueue();
        
        ride.runOneCycle();

        ride.numberOfVisitors();

        ride.printRideHistory();

        ride.sortVisitors();

        ride.printRideHistory();

        ride.printQueue();
        //Ride ride2 = new Ride("Roller Coaster", true, new Employee(), Ride.ThrillLevel.MILD, "Coaster", 1.4, queue2, collection2, 2, 0);
 
        // ride2.addVisitorToHistory(visitor5);
        // ride2.addVisitorToHistory(visitor2);
        // ride2.addVisitorToHistory(visitor1);
        // ride2.addVisitorToHistory(visitor4);
        // ride2.addVisitorToHistory(visitor3);
        // ride2.addVisitorToHistory(visitor7);
        // ride2.addVisitorToHistory(visitor6);
 
        //ride2.checkVisitorFromHistory(visitor1);

        // ride2.numberOfVisitors();

        // ride2.printRideHistory();

        // ride2.sortVisitors();

        // ride2.printRideHistory();
    }
    public void partFourA(){
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}