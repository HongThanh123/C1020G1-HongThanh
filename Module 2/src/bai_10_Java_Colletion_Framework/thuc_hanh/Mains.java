package bai_10_Java_Colletion_Framework.thuc_hanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Mains {
    public static void main(String[] args) {
        Student student1 = new Student("Thanh", 29, "QN");
        Student student2 = new Student("Nam", 26, "HN");
        Student student3 = new Student("Anh", 38, "HT" );
        Student student4 = new Student("Tung", 38, "HT" );

        List<Student> lists = new ArrayList<>();
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);


        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sánh theo tuổi: ");

        for (Student st : lists){
            System.out.println(st.toString());
        }

    }
}
