public class Visitor extends Person {
    public enum MembershipType {
        BASIC, BRONZE, SILVER, GOLD
    }

    private double height;
    private MembershipType membershipType;
    private String homeAddress;

    public Visitor() {
        super();
        this.height = 0.00;
        this.membershipType = MembershipType.BASIC;
        this.homeAddress = "";
    }

   public Visitor(String name, Integer age, Gender gender, String phoneNumber, 
                    double height, MembershipType membershipType, String homeAddress) {
        super(name, age, gender, phoneNumber);
        setHeight(height);
        setMembershipType(membershipType);
        setHomeAddress(homeAddress);
    }

    // Method for printing specific information.
    @Override
    public void printDetails() {
        System.out.println("\t" + "Name: " + this.getName());
        System.out.println("\t" + "Age: " + this.getAge());
        System.out.println("\t" + "Gender: " + this.getGender());
        System.out.println("\t" + "Phone number: " + this.getPhoneNumber());
        System.out.println("\t" + "Height: " + this.height);
        System.out.println("\t" + "Membership type: " + this.membershipType);
        System.out.println("\t" + "Home address: " + this.homeAddress);
        System.out.println();
    }

    // Part Six
    public String toCSV() {
        return getName() + "," + getAge() + "," +getGender() + "," + getPhoneNumber() + "," + height + "," + membershipType + "," + homeAddress;
    }

    // Part Seven
    public static Visitor fromCSV(String csvLine) throws IllegalArgumentException {
        
        String[] fields = csvLine.split(",");
 
        if (fields.length != 7) {
            throw new IllegalArgumentException("Invalid CSV line: expected 7 fields, but got " + fields.length);
        }

        String name = fields[0];
        int age = Integer.parseInt(fields[1]);
        Gender gender = Gender.valueOf(fields[2].toUpperCase());
        String phoneNumber = fields[3];
        double height = Double.parseDouble(fields[4]);
        MembershipType membershipType = MembershipType.valueOf(fields[5].toUpperCase());
        String homeAddress = fields[6];
 
        return new Visitor(name, age, gender, phoneNumber, height, membershipType, homeAddress);
    }

    // Setter() and Getter() methods.
    public MembershipType getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(MembershipType membershipType) {
        this.membershipType = membershipType;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public double getHeight() {
        return height;
    }
    public void  setHeight(double height) {
        if (height <= 0 || height >= 2.2) {
            throw new IllegalArgumentException("There's something wrong of your height! Please check!");
        }
        this.height = height;
    }
}