package projects.classproject;

import java.util.Collections;
import java.util.LinkedList;

public class Students {

    LinkedList<Profile> studentList = new LinkedList<>();

    public void addStudent(String id, String name, String section){
        Profile profile = new Profile(id, name, section);
        studentList.add(profile);
        System.out.println("Student Added Successfully");
        Collections.sort(studentList);
    }

    public void removeStudent(String id){

        int index = searchStudent(id);

        if (index>=0)
        {
            studentList.remove(index);
            System.out.println("Students Delete Successfully");
        }
        else {
            System.out.println("Students not found.");
        }

    }

    // this search method is use to find the index number based on their id number
    // this method will only use in this class
    // outside the class searchStudent method is dead

    private int searchStudent(String id){

        for (int i=0; i<studentList.size(); i++){
            if (studentList.get(i).getId().equals(id))
                return i;
        }
        return -1;
    } // searchStudents method ends here


    // this search method use searchStudents method and
    // display information about students if found

    public void search(String id){

        int index = searchStudent(id);

        if (index >= 0)
        {
            studentView(index);
        }
        else {
            System.out.println("Student Not Found!");
        }
    }

    // this section describe for single student info view
    // student view method goes here
    // all information about a student will be display

    private void studentView(int index){

        System.out.println(String.format("%30s", "Student Information"));
        for (int i=0; i<40; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        System.out.println(String.format("\t\t%-15s%-30s", "NAME", studentList.get(index).getName()));
        System.out.println(String.format("\t\t%-15s%-30s", "ID", studentList.get(index).getId()));
        System.out.println(String.format("\t\t%-15s%-30s", "SECTION", studentList.get(index).getSection()));
        System.out.println(String.format("\t\t%-15s%-30s", "QUIZ 1", studentList.get(index).getQuiz1()));
        System.out.println(String.format("\t\t%-15s%-30s", "QUIZ 2", studentList.get(index).getQuiz2()));
        System.out.println(String.format("\t\t%-15s%-30s", "QUIZ 3", studentList.get(index).getQuiz3()));
        System.out.println(String.format("\t\t%-15s%-30s", "ATTENDANCE", studentList.get(index).getAttendence()));
        System.out.println(String.format("\t\t%-15s%-30s", "PRESENTATION", studentList.get(index).getPresentation()));
        System.out.println(String.format("\t\t%-15s%-30s", "ASSIGNMENT", studentList.get(index).getAssignment()));
        System.out.println(String.format("\t\t%-15s%-30s", "MIDTERM", studentList.get(index).getMidterm()));
        System.out.println(String.format("\t\t%-15s%-30s", "FINAL", studentList.get(index).getFinalMarks()));
        System.out.println(String.format("\t\t%-15s%-30s", "CGPA", studentList.get(index).getCGPA()));
        System.out.println(String.format("\t\t%-15s%-30s", "GRADE", studentList.get(index).getGrade()));

        System.out.println();
        for (int i=0; i<40; i++)
        {
            System.out.print("*");
        }
        System.out.println();

    } // student view ends here


    public void listView() {
        System.out.println(String.format("%30s", "Student Information"));
        for (int i=0; i<40; i++)
        {
            System.out.print("*");
        }

        System.out.println();
        System.out.println(String.format("\t%-10s%-15s%-30s", "Index", "ID", "Name"));
        System.out.println(String.format("\t%-10s%-15s%-30s", "------", "---", "-----"));

        for (int i=0; i<studentList.size(); i++){
            System.out.println(String.format("\t%-10d%-15s%-30s", i+1, studentList.get(i).getId(), studentList.get(i).getName()));
        }

        System.out.println();
        for (int i=0; i<40; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public void fullView(){
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        System.out.println(String.format("%15s%25s%10s%10s%10s%10s%15s%15s%15s%10s%10s%10s%10s", "ID", "NAME", "SECTION", "QUIZ1", "QUIZ2", "QUIZ3", "ATTENDANCE",
                "PRESENTATION", "ASSIGNMENT", "MIDTERM", "FINAL", "CGPA", "GRADE"));

        for (int i=1; i<167; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i=0; i<studentList.size(); i++){
            System.out.println(String.format("%15s%25s%10s%10.2f%10.2f%10.2f%15.2f%15.2f%15.2f%10.2f%10.2f%10.2f%10s",
                    studentList.get(i).getId(),
                    studentList.get(i).getName(),
                    studentList.get(i).getSection(),
                    studentList.get(i).getQuiz1(),
                    studentList.get(i).getQuiz2(),
                    studentList.get(i).getQuiz3(),
                    studentList.get(i).getAttendence(),
                    studentList.get(i).getPresentation(),
                    studentList.get(i).getAssignment(),
                    studentList.get(i).getMidterm(),
                    studentList.get(i).getFinalMarks(),
                    studentList.get(i).getCGPA(),
                    studentList.get(i).getGrade()));
        }

        for (int i=1; i<167; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}






















