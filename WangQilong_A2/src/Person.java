public class Person {
    public enum Gender {
        MALE, FEMALE, OTHER
    }

    private String name;
    private Integer age;
    private Gender gender;
    private String phoneNumber;

    public Person() {
        this.name = "";
        this.age = null;
        this.gender = Gender.OTHER;
        this.phoneNumber = "";
    }

    public Person(String name, Integer age, Gender gender, String phoneNumber) {
        setName(name);
        setAge(age);
        setGender(gender);
        setPhoneNumber(phoneNumber);
    }

    public void printDetails() {
        System.out.println("\t" + "Name: " + this.name);
        System.out.println("\t" + "Age: " + this.age);
        System.out.println("\t" + "Gender: " + this.gender);
        System.out.println("\t" + "Phone number: " + this.phoneNumber);
    } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name.trim();
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age != null && age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be a non-negative integer!");
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        if (gender != null) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender cannot be null!");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\+?\\d{1,15}")) {
            this.phoneNumber = phoneNumber.replaceAll("\\s+", "");
        } else {
            throw new IllegalArgumentException("Invalid phone number format!");
        }
    }
}