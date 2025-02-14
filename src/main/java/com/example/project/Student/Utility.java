package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                Student student1 = list.get(j);
                Student student2 = list.get(j + 1);
                
                if (student1.getLastName().compareTo(student2.getLastName()) > 0) {
                    list.set(j, student2);
                    list.set(j + 1, student1);
                }
                else if (student1.getLastName().equals(student2.getLastName())) {
                    if (student1.getFirstName().compareTo(student2.getFirstName()) > 0) {
                        list.set(j, student2);
                        list.set(j + 1, student1);
                    }
                else if (student1.getFirstName().equals(student2.getFirstName())) {
                    if (student1.getGpa() < student2.getGpa()) {
                        list.set(j, student2);
                        list.set(j + 1, student1);
                        }
                    }
                }
            }
        }
        return list;
    }
    }

