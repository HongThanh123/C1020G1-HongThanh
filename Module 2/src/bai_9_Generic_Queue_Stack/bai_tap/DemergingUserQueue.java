package bai_9_Generic_Queue_Stack.bai_tap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DemergingUserQueue {
    public static void main(String[] args) throws ParseException {
        Student student1 = new Student("Thanh","Nu", 1994);
        Student student2 = new Student("Dung","Nam", 1991);
        Student student3 = new Student("Duong","Nam",1993);
        Student student4 = new Student("Cao","Nam",1999);
        Student student5 = new Student("Trang","Nu",1997);
        List<Student> list = new LinkedList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println("Trước khi sắp xếp: ");
        for (Student element : list){
            System.out.println(element);
        }

        System.out.println("Sau khi sắp xếp: ");
        Collections.sort(list);
        for (Student element : list){
            System.out.println(element);
        }

        Queue<Student> nuQueue = new ArrayDeque<>();
        Queue<Student> namQueue = new ArrayDeque<>();

        for (Student element : list){
            if (element.getGender().equals("Nu")){
                nuQueue.add(element);
            }else {
                namQueue.add(element);
            }

        }

//        System.out.println("-----------------");
//        for (Student element : nuQueue){
//            System.out.println(element);
//        }
//        System.out.println("-----------------");
//        for (Student element : namQueue){
//            System.out.println(element);
//        }

        List<Student> newList = new LinkedList<>();

        while (!nuQueue.isEmpty()){
            newList.add(nuQueue.poll());
        }
        while (!namQueue.isEmpty()){
            newList.add(namQueue.poll());
        }
        System.out.println("-----------------");
        for (Student element : newList){
            System.out.println(element);
        }

    }

}
