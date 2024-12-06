public class Visitor extends Person {
    public enum MembershipType {
        Tourist, Member
    }

    private MembershipType membershipType;
    private String homeAddress;

    public Visitor() {
        super();
        this.membershipType = MembershipType.Tourist;
        this.homeAddress = "";
    }

   public Visitor(String name, Integer age, Gender gender, String phoneNumber, 
                    MembershipType membershipType, String homeAddress) {
        super(name, age, gender, phoneNumber);
        setMembershipType(membershipType);
        setHomeAddress(homeAddress);
    }

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
    
    public void printVisitor() {
        System.out.println("Visitor's imformation: ");
        super.printDetails();
        System.out.println("\t" + "Membership type: " + this.membershipType);
        System.out.println("\t" + "Home address: " + this.homeAddress);
        System.out.println();
    } 
}