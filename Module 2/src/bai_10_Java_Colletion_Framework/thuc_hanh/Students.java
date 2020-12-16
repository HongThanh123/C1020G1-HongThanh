package bai_10_Java_Colletion_Framework.thuc_hanh;

public class Students implements Comparable<Students> {
    private String name;
    private int age;
    private String address;

    public Students() {
    }

    public Students(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(Students students) {
        return this.getName().compareTo(students.getName());
    }
}
