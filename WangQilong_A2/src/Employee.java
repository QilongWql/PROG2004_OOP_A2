public class Employee extends Person {
    private String employeeId;
    private String shiftPattern;
    private String emergencyContact;

    public Employee() {
        super();
        this.employeeId = "";
        this.shiftPattern = "";
        this.emergencyContact = "";
    }

    public Employee(String name, Integer age, Gender gender, String phoneNumber, 
                    String employeeId, String shiftPattern, String emergencyContact) {
        super(name, age, gender, phoneNumber);
        setEmployeeId(employeeId);
        setShiftPattern(shiftPattern);
        setEmergencyContact(emergencyContact);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be null or empty!");
        }
        this.employeeId = employeeId.trim();
    }

    public String getShiftPattern() {
        return shiftPattern;
    }

    public void setShiftPattern(String shiftPattern) {
        if (shiftPattern == null || shiftPattern.trim().isEmpty()) {
            throw new IllegalArgumentException("Shift pattern cannot be null or empty!");
        }
        this.shiftPattern = shiftPattern.trim();
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        if (emergencyContact == null || emergencyContact.trim().isEmpty()) {
            throw new IllegalArgumentException("Emergency contact cannot be null or empty!");
        }
        this.emergencyContact = emergencyContact.trim();
    }

    @Override
    public void printDetails() {
        System.out.println("\t" + "EmployeeId: " + this.employeeId);
        System.out.println("\t" + "Name: " + this.getName());
        System.out.println("\t" + "Age: " + this.getAge());
        System.out.println("\t" + "Gender: " + this.getGender());
        System.out.println("\t" + "Phone number: " + this.getPhoneNumber());
        System.out.println("\t" + "Shift pattern: " + this.shiftPattern);
        System.out.println("\t" + "Emergency contact phone number: " + this.emergencyContact);
        System.out.println();
    }
}