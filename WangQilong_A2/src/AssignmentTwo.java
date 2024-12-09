import java.util.LinkedList;
import java.util.Queue;

public class AssignmentTwo {
    public static void main(String[] args){
        System.out.println("PartThree");
        System.out.println("-----------------------------------------");
        new AssignmentTwo().partThree();
        
        System.out.println("PartFourA");
        System.out.println("-----------------------------------------");
        new AssignmentTwo().partFourA();
    }

    public void partThree(){
        Queue<Visitor> queue1 = new LinkedList<>();
        LinkedList<Visitor> collection1 = new LinkedList<>();
        Employee employee1 = new Employee("Samuel", 21, Person.Gender.FEMALE, "021654625792", "E087", "Morning", "023 1789523467");

        Ride ride1 = new Ride("Roller Coaster", true, employee1, Ride.ThrillLevel.MAX, "Coaster", 1.4, queue1, collection1, 4, 0);
 
        Visitor visitor1 = new Visitor("Quincy", 30, Person.Gender.FEMALE, "05164851395", 1.72, Visitor.MembershipType.GOLD, "123 Main St");
        Visitor visitor2 = new Visitor("Alice", 25, Person.Gender.MALE, "05134986278", 1.74, Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor3 = new Visitor("George", 35, Person.Gender.MALE, "03178462389", 1.80, Visitor.MembershipType.BRONZE, "789 Oak St");
        Visitor visitor4 = new Visitor("Diana", 28, Person.Gender.FEMALE, "07168345124", 1.59, Visitor.MembershipType.GOLD, "101 Pine St");
        Visitor visitor5 = new Visitor("Karen", 22, Person.Gender.FEMALE, "03172845613", 1.73, Visitor.MembershipType.BASIC, "202 Birch St");
        Visitor visitor6 = new Visitor("Olivia", 13, Person.Gender.MALE, "08128659784", 1.39, Visitor.MembershipType.BASIC, "456 Elm St");
        Visitor visitor7 = new Visitor("Noah", 36, Person.Gender.MALE, "02142546159", 1.83, Visitor.MembershipType.SILVER, "456 Elm St");
        
        // Add 7 Visitor to the Queue.
        ride1.addVisitorToQueue(visitor1);
        ride1.addVisitorToQueue(visitor2);
        ride1.addVisitorToQueue(visitor3);
        ride1.addVisitorToQueue(visitor4);
        ride1.addVisitorToQueue(visitor5);
        ride1.addVisitorToQueue(visitor6);// This visitor height below the ride minimum height limit will not be able to be joined successfully.
        ride1.addVisitorToQueue(visitor7);

        // Remove the 5th Visitor from the Queue.
        Visitor removedVisitor = visitor5;
        ride1.removeVisitorFromQueue(removedVisitor);
        System.out.println("Removed visitor: " + removedVisitor.getName());

        // Print all Visitors in the Queue.
        ride1.printQueue();

        
        // ride.runOneCycle();


        // ride.sortVisitors();

        // ride.printRideHistory();

        // ride.printQueue();
        
        // ride.importRideHistory("WangQilong_A2\\src\\Collection.csv");

        // ride.printRideHistory();
        // ride.exportRideHistory("WangQilong_A2\\src\\Collection.csv");
        //Ride ride2 = new Ride("Roller Coaster", true, new Employee(), Ride.ThrillLevel.MILD, "Coaster", 1.4, queue2, collection2, 2, 0);

        // ride2.sortVisitors();

        // ride2.printRideHistory();
    }
    public void partFourA(){
        Queue<Visitor> queue2 = new LinkedList<>();
        LinkedList<Visitor> collection2 = new LinkedList<>();
        Employee employee2 = new Employee();

        Ride ride2 = new Ride("Cosmic Boom", true, employee2, Ride.ThrillLevel.MILD, "Drop'N'Twist Tower", 1.45, queue2, collection2, 3, 0);

        Visitor visitor1 = new Visitor("Quincy", 30, Person.Gender.FEMALE, "05164851395", 1.72, Visitor.MembershipType.GOLD, "145 Main St");
        Visitor visitor2 = new Visitor("Hannah", 25, Person.Gender.MALE, "05134986278", 1.74, Visitor.MembershipType.SILVER, "498 Elm St");
        Visitor visitor3 = new Visitor("George", 35, Person.Gender.MALE, "03178462389", 1.80, Visitor.MembershipType.BRONZE, "365 Oak St");
        Visitor visitor4 = new Visitor("Liam", 28, Person.Gender.FEMALE, "07168345124", 1.59, Visitor.MembershipType.GOLD, "101 Pine St");
        Visitor visitor5 = new Visitor("Karen", 22, Person.Gender.FEMALE, "03172845613", 1.73, Visitor.MembershipType.BASIC, "202 Birch St");
        Visitor visitor6 = new Visitor("Olivia", 23, Person.Gender.MALE, "08128659784", 1.69, Visitor.MembershipType.BASIC, "456 Jdl St");
        Visitor visitor7 = new Visitor("Noah", 36, Person.Gender.MALE, "02142546159", 1.83, Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor13 = new Visitor("Mia", 23, Person.Gender.FEMALE, "02186245631", 1.63, Visitor.MembershipType.SILVER, "498 Nsdk St");

        // Add 7 Visitor to the collection.
        ride2.addVisitorToHistory(visitor1);
        ride2.addVisitorToHistory(visitor2);
        ride2.addVisitorToHistory(visitor3);
        ride2.addVisitorToHistory(visitor4);
        ride2.addVisitorToHistory(visitor5);
        ride2.addVisitorToHistory(visitor6);
        ride2.addVisitorToHistory(visitor7);

        // Check if the 4th and the 13th Visitor is in the collection.
        ride2.checkVisitorFromHistory(visitor4);
        ride2.checkVisitorFromHistory(visitor13);// It was not added to the collection so it will not be looked up.

        // Print the number of Visitors in the collection.
        ride2.numberOfVisitors();

        // Print all Visitors in the collection.
        ride2.printRideHistory();
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