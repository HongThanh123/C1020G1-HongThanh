package bai_9_Generic_Queue_Stack.bai_tap;

import java.util.Date;

public class Student implements Comparable<Student> {
    private String name;
    private String gender;
    private int birthDay;

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public Student(String name, String gender, int birthDay) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    @Override
    public int compareTo(Student otherStudent) {
        if(this.birthDay > otherStudent.getBirthDay()){
            return 1;

        }else if (this.birthDay <otherStudent.getBirthDay()){
            return -1;
        }else {
            return 0;
        }

    }
}
