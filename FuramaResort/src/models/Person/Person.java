package models.Person;

public class Person {
    private String fullName;
    private String address;
    private String birthDay;
    private String id;
    private String phoneNumber;
    private String email;
    private String genger;

    public Person() {
    }

    public Person(String fullName, String address, String birthDay, String id, String phoneNumber, String email, String genger) {
        this.fullName = fullName;
        this.address = address;
        this.birthDay = birthDay;
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.genger = genger;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenger() {
        return genger;
    }

    public void setGenger(String genger) {
        this.genger = genger;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", id='" + id + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", genger='" + genger + '\'' +
                '}';
    }

    public void showInfo() {
            System.out.println("name=" + getFullName() +
                    ", address=" + getAddress() +
                    ", birthday=" + getBirthDay() +
                    ", id=" + getId() +
                    ", phone=" + getPhoneNumber() +
                    ", email=" +getEmail() +
                    ", gender=" + getGenger() );

    }

}
