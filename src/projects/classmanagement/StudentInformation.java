package projects.classmanagement;

import java.io.*;
import java.util.Scanner;

public class StudentInformation {

    public static StudentList studentList;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StudentInformation(){
        studentList = new StudentList();
    }

    public void addStudent(String id, String name, String section){
        studentList.insert(new StudentProfile(id, name, section));
    }

    public void displayStudentsList(){
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        System.out.println(String.format("%5s%15s%25s%10s","Index", "ID Number", "Name", "Section"));
        for (int i=0; i<=56; i++)
            System.out.print("*");
        System.out.println();
        for (int i=1; i<=studentList.getSize(); i++){
            System.out.println(String.format("%5d%15s%25s%10s", i, studentList.get(i).getIdNumber(), studentList.get(i).getStudentName(), studentList.get(i).getSection()));
        }

        for (int i=0; i<=56; i++)
            System.out.print("*");
        System.out.println();
    }

    public void displayStudentFullInfo(){
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        System.out.println(String.format("%15s%25s%10s%10s%10s%10s%15s%15s%15s%10s%10s%10s", "ID", "NAME", "SECTION", "QUIZ1", "QUIZ2", "QUIZ3", "ATTENDANCE",
                "PRESENTATION", "ASSIGNMENT", "MIDTERM", "FINAL", "CGPA"));

        for (int i=1; i<158; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i=1; i<=studentList.getSize(); i++){
            System.out.println(String.format("%15s%25s%10s%10.2f%10.2f%10.2f%15.2f%15.2f%15.2f%10.2f%10.2f%10.2f",
                    studentList.get(i).getIdNumber(),
                    studentList.get(i).getStudentName(),
                    studentList.get(i).getSection(),
                    studentList.get(i).getFirstQuiz(),
                    studentList.get(i).getSecondQuiz(),
                    studentList.get(i).getThirdQuiz(),
                    studentList.get(i).getAttendenceMark(),
                    studentList.get(i).getPresentationMark(),
                    studentList.get(i).getAssignmentMarks(),
                    studentList.get(i).getMidtermMark(),
                    studentList.get(i).getFinalMark(),
                    studentList.get(i).getCgpa()));
        }

        for (int i=1; i<158; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public void singleview(int index){
        System.out.println(String.format("%40s", "Student Information"));
        System.out.print(String.format("%13s", ""));
        for (int i=1; i<=40; i++)
            System.out.print("*");
        System.out.println();
        System.out.println(String.format("%25s%25s", "Name:", studentList.get(index).getStudentName()));
        System.out.println(String.format("%25s%25s", "ID:", studentList.get(index).getIdNumber()));
        System.out.println(String.format("%25s%25s", "Section:", studentList.get(index).getSection()));
        System.out.println(String.format("%25s%25.2f", "QUIZ1:", studentList.get(index).getFirstQuiz()));
        System.out.println(String.format("%25s%25.2f", "QUIZ2:", studentList.get(index).getSecondQuiz()));
        System.out.println(String.format("%25s%25.2f", "QUIZ3:", studentList.get(index).getThirdQuiz()));
        System.out.println(String.format("%25s%25.2f", "ATTENDANCE:", studentList.get(index).getAttendenceMark()));
        System.out.println(String.format("%25s%25.2f", "PRESENTATION:", studentList.get(index).getPresentationMark()));
        System.out.println(String.format("%25s%25.2f", "ASSIGNMENT:", studentList.get(index).getAssignmentMarks()));
        System.out.println(String.format("%25s%25.2f", "MIDTERM:", studentList.get(index).getMidtermMark()));
        System.out.println(String.format("%25s%25.2f", "FINAL:", studentList.get(index).getFinalMark()));
        System.out.println(String.format("%25s%25.2f", "CGPA:", studentList.get(index).getCgpa()));
    }

    public void searchStudent(String value){
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        int found = studentList.search(value);

        if (found!=-1){
            singleview(found);
        }else System.out.println("Student Not Found");
    }

    public void deleteStudent() throws IOException {
        if (studentList.isEmpty()){
            System.out.println("There are No Student available");
            return;
        }
        displayStudentsList();
        System.out.print("ENTER AN INDEX NUMBER TO DELETE : ");
        int index = Integer.parseInt(br.readLine());

        if (index >=1 && index <= studentList.getSize()){
            System.out.print("\nAre you sure?(y/n)");
            String check = br.readLine();
            if (check.charAt(0) == 'y')
                studentList.delete(index);
            else System.out.println("\nDelete Canceled");
        }
        else System.out.println("\nInvalid Index");
    }

    public void manualUpdate() throws IOException {
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        displayStudentsList();

        System.out.print("ENTER AN INDEX NUMBER : ");
        int index = Integer.parseInt(br.readLine());
        singleview(index);
        System.out.println("\nTo Edit type 'E', To Cancel type 'C'");
        String check = br.readLine();

        double quiz1, quiz2, quiz3, presentation, midterm, finlMarks;

        if (check.charAt(0) == 'E'){
            System.out.println("Enter the appropriate value, if there is no value type null");
            System.out.print("QUIZ1 : ");
            quiz1 = Double.parseDouble(br.readLine());
            System.out.print("\nQUIZ2 : ");
            quiz2 = Double.parseDouble(br.readLine());
            System.out.print("\nQUIZ3 : ");
            quiz3 = Double.parseDouble(br.readLine());
            System.out.print("\nPRESENTATION : ");
            presentation = Double.parseDouble(br.readLine());
            System.out.print("\nMIDTERM : ");
            midterm = Double.parseDouble(br.readLine());
            System.out.print("\nFINAL : ");
            finlMarks = Double.parseDouble(br.readLine());

            System.out.println("\n\nPress 'S' to save and 'C' to cancel");
            check = br.readLine();

            if (check.charAt(0) == 'S'){
                studentList.get(index).setFirstQuiz(quiz1==0?null:quiz1);
                studentList.get(index).setSecondQuiz(quiz2==0?null:quiz2);
                studentList.get(index).setThirdQuiz(quiz3==0?null:quiz3);
                studentList.get(index).setPresentationMark(presentation==0?null:presentation);
                studentList.get(index).setMidtermMark(midterm==0?null:midterm);
                studentList.get(index).setFinalMark(finlMarks==0?null:finlMarks);

            }
            else {
                System.out.println("DATA NOT SAVED");
            }
        }

    }

    public void updateTopicsMark(){
        if (studentList.isEmpty()){
            System.out.println("There are no student available");
            return;
        }
        System.out.println("\t1.\tQUIZ 1");
        System.out.println("\t2.\tQUIZ 2");
        System.out.println("\t3.\tQUIZ 3");
        System.out.println("\t4.\tPRESENTATION");
        System.out.println("\t5.\tMIDTERM");
        System.out.println("\t6.\tFINAL");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setFirstQuiz(sc.nextDouble());
                }
                break;

            case 2:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setSecondQuiz(sc.nextDouble());
                }
                break;

            case 3:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setThirdQuiz(sc.nextDouble());
                }
                break;

            case 4:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setPresentationMark(sc.nextDouble());
                }
                break;

            case 5:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setMidtermMark(sc.nextDouble());
                }
                break;
            case 6:
                for(int i=1; i<=studentList.getSize(); i++){
                    System.out.print("\t" + studentList.get(i).getIdNumber() + " : ");
                    studentList.get(i).setFinalMark(sc.nextDouble());
                }

                break;

            default:
                System.out.println("Invalid Selection");
                break;
        }
    }

    public void makeAfile(){
        final String path = "/home/guru/Desktop/result.txt";
        StringBuffer sb = new StringBuffer();

        sb.append(String.format("%15s%25s%10s%10s%10s%10s%15s%15s%15s%10s%10s%10s%10s", "ID", "NAME", "SECTION", "QUIZ1", "QUIZ2", "QUIZ3", "ATTENDANCE",
                "PRESENTATION", "ASSIGNMENT", "MIDTERM", "FINAL", "CGPA", "GRADE"));
        sb.append("\n");

        for (int i=1; i<168; i++){
            sb.append("*");
        }
        sb.append("\n");

        for (int i=1; i<=studentList.getSize(); i++){
            sb.append(String.format("%15s%25s%10s%10.2f%10.2f%10.2f%15.2f%15.2f%15.2f%10.2f%10.2f%10.2f\n",
                    studentList.get(i).getIdNumber(),
                    studentList.get(i).getStudentName(),
                    studentList.get(i).getSection(),
                    studentList.get(i).getFirstQuiz(),
                    studentList.get(i).getSecondQuiz(),
                    studentList.get(i).getThirdQuiz(),
                    studentList.get(i).getAttendenceMark(),
                    studentList.get(i).getPresentationMark(),
                    studentList.get(i).getAssignmentMarks(),
                    studentList.get(i).getMidtermMark(),
                    studentList.get(i).getFinalMark(),
                    studentList.get(i).getCgpa(),
                    studentList.get(i).getGrade()));
        }

        for (int i=1; i<168; i++){
            sb.append("*");
        }
        sb.append("\n");

        try {
            File file = new File(path);
            BufferedWriter br = new BufferedWriter(new FileWriter(file));
            br.write(sb.toString());
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
