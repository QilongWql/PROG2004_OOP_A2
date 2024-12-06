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
        employee1.printEmployee();
        Employee employee = new Employee();
 
        employee.setAge(12);
        employee.setName("fdsf");
        employee.setGender(Person.Gender.MALE);
        employee.setPhoneNumber("156456322");
        employee.setEmployeeId("E001");
        employee.setShiftPattern("全职");
        employee.setEmergencyContact("1234567890");
        employee.printEmployee();
}
}