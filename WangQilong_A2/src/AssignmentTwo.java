import java.util.LinkedList;
import java.util.Queue;

public class AssignmentTwo {
    public static void main(String[] args){
        System.out.println("PartThree");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partThree();
        
        System.out.println("PartFourA");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partFourA();

        System.out.println("PartFourB");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partFourB();

        System.out.println("PartFive");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partFive();

        System.out.println("PartSix");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partSix();

        System.out.println("PartSeven");
        System.out.println("------------------------------------------");
        new AssignmentTwo().partSeven();
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
    }

    public void partFourA(){
        Queue<Visitor> queue2 = new LinkedList<>();
        LinkedList<Visitor> collection2 = new LinkedList<>();
        Employee employee2 = new Employee("Saxon", 32, Person.Gender.MALE, "021654625799", "E094", "Afternoon", "023 1789523474");

        Ride ride2 = new Ride("Cosmic Boom", true, employee2, Ride.ThrillLevel.MILD, "Drop'N'Twist Tower", 1.45, queue2, collection2, 3, 0);

        Visitor visitor1 = new Visitor("Quincy", 30, Person.Gender.FEMALE, "05164851395", 1.72, Visitor.MembershipType.GOLD, "145 Main St");
        Visitor visitor2 = new Visitor("Hannah", 25, Person.Gender.MALE, "05134986278", 1.74, Visitor.MembershipType.SILVER, "498 Elm St");
        Visitor visitor3 = new Visitor("George", 35, Person.Gender.MALE, "03178462389", 1.80, Visitor.MembershipType.BRONZE, "365 Oak St");
        Visitor visitor4 = new Visitor("Liam", 28, Person.Gender.FEMALE, "07168345124", 1.59, Visitor.MembershipType.GOLD, "101 Pine St");
        Visitor visitor5 = new Visitor("Karen", 22, Person.Gender.FEMALE, "03172845613", 1.73, Visitor.MembershipType.BASIC, "202 Birch St");
        Visitor visitor6 = new Visitor("Olivia", 23, Person.Gender.MALE, "08128659784", 1.69, Visitor.MembershipType.BASIC, "456 Jdl St");
        Visitor visitor7 = new Visitor("Noah", 36, Person.Gender.MALE, "02142546159", 1.83, Visitor.MembershipType.SILVER, "456 Elm St");
        Visitor visitor13 = new Visitor("Mia", 23, Person.Gender.FEMALE, "02186245631", 1.63, Visitor.MembershipType.SILVER, "498 Nsdk St");

        // Add 7 Visitors to the collection.
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
        Queue<Visitor> queue3 = new LinkedList<>();
        LinkedList<Visitor> collection3 = new LinkedList<>();
        Employee employee3 = new Employee("Zephyr", 29, Person.Gender.MALE, "021654625795", "E090", "Morning", "023 1789523470");

        Ride ride3 = new Ride("Ferris Wheel", true, employee3, Ride.ThrillLevel.MODERATE, "Sky Wheel", 0.8, queue3, collection3, 6, 0);

        Visitor visitor1 = new Visitor("Eaula", 42, Person.Gender.MALE, "05138765432", 1.87, Visitor.MembershipType.BASIC, "720 Elm St");
        Visitor visitor2 = new Visitor("Cscar", 24, Person.Gender.FEMALE, "03176543219", 1.66, Visitor.MembershipType.BRONZE, "489 Maple St");
        Visitor visitor3 = new Visitor("Buincy", 39, Person.Gender.MALE, "05163218764", 1.79, Visitor.MembershipType.GOLD, "135 Oak St");
        Visitor visitor4 = new Visitor("Fina", 26, Person.Gender.FEMALE, "05135432187", 1.71, Visitor.MembershipType.SILVER, "678 Birch St");
        Visitor visitor5 = new Visitor("Gaura", 36, Person.Gender.MALE, "03179876541", 1.84, Visitor.MembershipType.BRONZE, "369 Spruce St");
        Visitor visitor6 = new Visitor("Aeith", 33, Person.Gender.FEMALE, "05167654321", 1.69, Visitor.MembershipType.SILVER, "852 Ash St");
        Visitor visitor7 = new Visitor("Dark", 28, Person.Gender.MALE, "05134321876", 1.77, Visitor.MembershipType.GOLD, "567 Willow St");

        // Add 7 Visitors to the collection.
        ride3.addVisitorToHistory(visitor1);
        ride3.addVisitorToHistory(visitor2);
        ride3.addVisitorToHistory(visitor3);
        ride3.addVisitorToHistory(visitor4);
        ride3.addVisitorToHistory(visitor5);
        ride3.addVisitorToHistory(visitor6);
        ride3.addVisitorToHistory(visitor7);

        // Print all Visitors in the collection.
        ride3.printRideHistory();

        // Sort the collection.
        ride3.sortVisitors();

        // Print all Visitors in the collection again.
        ride3.printRideHistory();
    }

    public void partFive(){
        Queue<Visitor> queue4 = new LinkedList<>();
        LinkedList<Visitor> collection4 = new LinkedList<>();
        Employee employee4 = new Employee("Julietta", 21, Person.Gender.FEMALE, "021654625792", "E087", "Morning", "023 1789523467");

        Ride ride4 = new Ride("Splash Battle", true, employee4, Ride.ThrillLevel.MODERATE, "Aqua Splash", 1.2, queue4, collection4, 6, 0);

        Visitor visitor1 = new Visitor("Saxon", 36, Person.Gender.MALE, "05163258741", 1.89, Visitor.MembershipType.BASIC, "357 Maple St");
        Visitor visitor2 = new Visitor("Delphine", 23, Person.Gender.FEMALE, "03174862395", 1.66, Visitor.MembershipType.GOLD, "846 Birch St");
        Visitor visitor3 = new Visitor("Thorne", 28, Person.Gender.MALE, "05136985247", 1.78, Visitor.MembershipType.SILVER, "569 Spruce St");
        Visitor visitor4 = new Visitor("Finnian", 34, Person.Gender.MALE, "03198526374", 1.79, Visitor.MembershipType.BRONZE, "653 Willow St");
        Visitor visitor5 = new Visitor("Garrison", 28, Person.Gender.MALE, "05173698524", 1.91, Visitor.MembershipType.BASIC, "987 Ash St");
        Visitor visitor6 = new Visitor("Briar", 24, Person.Gender.FEMALE, "03165237894", 1.61, Visitor.MembershipType.GOLD, "369 Cedar St");
        
        Visitor visitor7 = new Visitor("Harlan", 31, Person.Gender.MALE, "05154983627", 1.75, Visitor.MembershipType.SILVER, "548 Poplar St");
        Visitor visitor8 = new Visitor("Ivor", 26, Person.Gender.MALE, "03136528749", 1.87, Visitor.MembershipType.BRONZE, "782 Fir St");
        Visitor visitor9 = new Visitor("Jarl", 33, Person.Gender.MALE, "05147896325", 1.73, Visitor.MembershipType.BASIC, "235 Hemlock St");
        Visitor visitor10 = new Visitor("Kean", 29, Person.Gender.MALE, "03154789632", 1.81, Visitor.MembershipType.GOLD, "478 Yew St");
        Visitor visitor11 = new Visitor("Laird", 25, Person.Gender.MALE, "05198365274", 1.71, Visitor.MembershipType.SILVER, "635 Elder St");
        Visitor visitor12 = new Visitor("Quinn", 30, Person.Gender.MALE, "03185478963", 1.69, Visitor.MembershipType.BRONZE, "951 Pine St");
        
        // Add 12 Visitors to the Queue.
        ride4.addVisitorToQueue(visitor1);
        ride4.addVisitorToQueue(visitor2);
        ride4.addVisitorToQueue(visitor3);
        ride4.addVisitorToQueue(visitor4);
        ride4.addVisitorToQueue(visitor5);
        ride4.addVisitorToQueue(visitor6);

        ride4.addVisitorToQueue(visitor7);
        ride4.addVisitorToQueue(visitor8);
        ride4.addVisitorToQueue(visitor9);
        ride4.addVisitorToQueue(visitor10);
        ride4.addVisitorToQueue(visitor11);
        ride4.addVisitorToQueue(visitor12);

        // Print all Visitors in the queue.
        ride4.printQueue();

        // Run one cycle.
        ride4.runOneCycle();

        // Print all Visitors in the queue after one cycle is run.
        ride4.printQueue();
        
        // Print all Visitors in the collection.
        ride4.printRideHistory();
    }

    public void partSix(){
        Queue<Visitor> queue5 = new LinkedList<>();
        LinkedList<Visitor> collection5 = new LinkedList<>();
        Employee employee5 = new Employee("Mannah", 24, Person.Gender.FEMALE, "021654625800", "E095", "Evening", "023 1789523475");

        Ride ride5 = new Ride("Log Flume", true, employee5, Ride.ThrillLevel.MODERATE, "Rainforest Run", 1.1, queue5, collection5, 5, 0);

        Visitor visitor1 = new Visitor("Saxon", 38, Person.Gender.MALE, "05145876321", 1.86, Visitor.MembershipType.BASIC, "473 Maple St");
        Visitor visitor2 = new Visitor("Delphine", 25, Person.Gender.FEMALE, "03176985234", 1.64, Visitor.MembershipType.GOLD, "836 Birch St");
        Visitor visitor3 = new Visitor("Thorne", 36, Person.Gender.MALE, "05198765432", 1.79, Visitor.MembershipType.SILVER, "563 Spruce St");
        Visitor visitor4 = new Visitor("Uriah", 30, Person.Gender.MALE, "03158765324", 1.81, Visitor.MembershipType.BRONZE, "278 Willow St");
        Visitor visitor5 = new Visitor("Valentin", 27, Person.Gender.MALE, "05134567892", 1.88, Visitor.MembershipType.BASIC, "765 Fir St");
        Visitor visitor6 = new Visitor("Ivor", 27, Person.Gender.MALE, "03145628793", 1.85, Visitor.MembershipType.BRONZE, "582 Fir St");
        Visitor visitor7 = new Visitor("Jarl", 31, Person.Gender.MALE, "05129876543", 1.75, Visitor.MembershipType.BASIC, "741 Hemlock St");
        
        ride5.addVisitorToQueue(visitor1);
        ride5.addVisitorToQueue(visitor2);
        ride5.addVisitorToQueue(visitor3);
        ride5.addVisitorToQueue(visitor4);
        ride5.addVisitorToQueue(visitor5);
        ride5.addVisitorToQueue(visitor6);
        ride5.addVisitorToQueue(visitor7);

        // Run one cycle.
        ride5.runOneCycle();

        // Add 5 Visitors to the Ride.
        ride5.numberOfVisitors();

        // Export the Visitors to a file.
        ride5.exportRideHistory("WangQilong_A2\\src\\Collection.csv");
    }

    public void partSeven(){
        Queue<Visitor> queue6 = new LinkedList<>();
        LinkedList<Visitor> collection6 = new LinkedList<>();
        Employee employee6 = new Employee("Mannah", 24, Person.Gender.FEMALE, "021654625800", "E095", "Evening", "023 1789523475");

        Ride ride6 = new Ride("Log Flume", true, employee6, Ride.ThrillLevel.MODERATE, "Rainforest Run", 1.1, queue6, collection6, 5, 0);
        
        ride6.numberOfVisitors();

        // Import the file created from PartSix.
        ride6.importRideHistory("WangQilong_A2\\src\\Collection.csv");
        
        // Print the number of Visitors.
        ride6.numberOfVisitors();

        // Print all Visitors in the LinkedList.
        ride6.printRideHistory();
    }
}