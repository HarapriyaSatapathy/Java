package src.InterviewQuestions;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAgesort {

        static class Student implements Comparable < Student > {

            public String name;
            public int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }


            @Override
            public int compareTo(Student student) {
                return this.age - student.age;
            }
        }

        public static void main(String[] args) {
            Student s1 = new Student("student-1", 89);
            Student s2 = new Student("student-2", 24);
            Student s3 = new Student("student-3", 36);
            List < Student > studentList = Arrays.asList(s1, s2, s3);
            System.out.println("Before sorting");
            System.out.println(studentList);

            Collections.sort(studentList);
            System.out.println("After sorting");
            System.out.println(studentList);
        }

    }

