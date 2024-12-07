import java.util.LinkedList;
import java.util.Queue;

public class AssignmentTwo {
    public static void main(String[] args){
        Employee employee1 = new Employee(
            "WangQilong",
            21, 
            Person.Gender.MALE,
            "15652335666",
            "001",
            "full-time",
            "15131129006"
        );
        employee1.printDetails();
        Employee employee = new Employee();
 
        employee.setAge(12);
        employee.setName("fdsf");
        employee.setGender(Person.Gender.MALE);
        employee.setPhoneNumber("156456322");
        employee.setEmployeeId("E001");
        employee.setShiftPattern("Full-time");
        employee.setEmergencyContact("1234567890");
        employee.printDetails();

        new AssignmentTwo().partThree();
    }

    public void partThree(){
        Queue<Visitor> queue1 = new LinkedList<>();
        Queue<Visitor> queue2 = new LinkedList<>();
        Ride ride = new Ride("Roller Coaster", true, new Employee(), Ride.ThrillLevel.MILD, "Coaster", 1.4, queue1);
 
        Visitor visitor1 = new Visitor("Alice", 30, Person.Gender.FEMALE, "1234567890", Visitor.MembershipType.GOLD, "123 Main St");
        Visitor visitor2 = new Visitor("Bob", 25, Person.Gender.MALE, "0987654321", Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor3 = new Visitor("Charlie", 35, Person.Gender.MALE, "5551234567", Visitor.MembershipType.BRONZE, "789 Oak St");
        Visitor visitor4 = new Visitor("Diana", 28, Person.Gender.FEMALE, "5559876543", Visitor.MembershipType.GOLD, "101 Pine St");
        Visitor visitor5 = new Visitor("Eve", 22, Person.Gender.FEMALE, "5553216549", Visitor.MembershipType.BASIC, "202 Birch St");
 
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
 
        Visitor removedVisitor = visitor5;
        ride.removeVisitorFromQueue(removedVisitor);
        System.out.println("Removed visitor: " + removedVisitor);

        ride.printQueue();




        Ride ride2 = new Ride("Roller Coaster", true, new Employee(), Ride.ThrillLevel.MILD, "Coaster", 1.4, queue2);
 
        ride2.addVisitorToQueue(visitor1);
        ride2.addVisitorToQueue(visitor2);
        ride2.addVisitorToQueue(visitor3);
        ride2.addVisitorToQueue(visitor4);
        ride2.addVisitorToQueue(visitor5);
 
        ride2.removeVisitorFromQueue(visitor4);
        System.out.println("Removed visitor: " + "visitor4");

        ride2.printQueue();
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