package com.soojong.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMain {

    public static void main(String[] args) {
        List<Student> studentList =  new ArrayList<>();
        Student student1 = new Student(327, "Kasun");
        Student student2 = new Student(100, "Dasun");
        Student student3 = new Student(167, "Thisun");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        //Collections.sort(studentList); // Comparable을 사용
        //Collections.sort(studentList, new IdComparator()); // Comparator를 사용
        Collections.sort(studentList, new NameComparator()); // Comparator를 사용

        for (Student student : studentList) {
            System.out.printf("ID = %d , Name = %s \n", student.getId(), student.getName());
        }
    }
}
