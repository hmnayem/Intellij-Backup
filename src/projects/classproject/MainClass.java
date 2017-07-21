package projects.classproject;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MainClass {

    Students students;
    final String path = "/home/guru/Desktop/student/info/students.dat";



    public MainClass() {

        students = new Students();
        File file = new File(path);
        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()){
                String id = sc.next();
                String name = sc.next();
                String section = sc.next();
                Double quiz1 = sc.nextDouble();
                Double quiz2 = sc.nextDouble();
                Double quiz3 = sc.nextDouble();
                Double attendence = sc.nextDouble();
                Double presentation = sc.nextDouble();
                Double assignment = sc.nextDouble();
                Double midterm = sc.nextDouble();
                Double finalmarks = sc.nextDouble();
                Double cgpa = sc.nextDouble();
                String grade = sc.next();


            }

        } catch (FileNotFoundException e) {

        }


    }

    public static void main(String[] args){

        MainClass main = new MainClass();


        main.students.addStudent("1660", "Shegufa", "A");
        main.students.addStudent("1627", "Nayem", "A");
        main.students.addStudent("1648", "Jubel", "A");
        main.students.addStudent("1713", "Badhon", "A");
        main.students.addStudent("1653", "Risha", "A");
        main.students.addStudent("1706", "Joy", "A");
        main.students.addStudent("1642", "Esha", "A");

        main.students.search("1660");


        main.students.fullView();
    }

    private String setStudentsInfo(){

        StringBuffer sb = new StringBuffer();

        for (int i=0; i<students.studentList.size(); i++){
            sb.append(students.studentList.get(i).getId());
            sb.append(" ");
            sb.append(students.studentList.get(i).getName());
            sb.append(" ");
            sb.append(students.studentList.get(i).getSection());
            sb.append(" ");
            sb.append(students.studentList.get(i).getQuiz1());
            sb.append(" ");
            sb.append(students.studentList.get(i).getQuiz2());
            sb.append(" ");
            sb.append(students.studentList.get(i).getQuiz3());
            sb.append(" ");
            sb.append(students.studentList.get(i).getAttendence());
            sb.append(" ");
            sb.append(students.studentList.get(i).getPresentation());
            sb.append(" ");
            sb.append(students.studentList.get(i).getAssignment());
            sb.append(" ");
            sb.append(students.studentList.get(i).getMidterm());
            sb.append(" ");
            sb.append(students.studentList.get(i).getFinalMarks());
            sb.append(" ");
            sb.append(students.studentList.get(i).getCGPA());
            sb.append(" ");
            sb.append(students.studentList.get(i).getGrade());
        }

        return sb.toString();
    }
}















