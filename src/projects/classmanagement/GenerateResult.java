package projects.classmanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateResult {

    private boolean state = false;

    public void setState(){
        this.state = true;
    }
    public boolean getState(){
        return state;
    }

    public void studentResult(String id){

        int index = StudentInformation.studentList.search(id);

        if (index!=-1){
            System.out.println("\t\tStudents Exam Report\n");
            System.out.println(String.format("%15s%25s", "NAME:", StudentInformation.studentList.get(index).getStudentName()));
            System.out.println(String.format("%15s%25s", "ID:", StudentInformation.studentList.get(index).getIdNumber()));
            System.out.println(String.format("%15s%25.2f", "MARKS:", calculateResult(index)));
            System.out.println(String.format("%15s%25.2f", "CGPA:", calculateCGPA(calculateResult(index))));
            System.out.println(String.format("%15s%25s", "GRADE:", getGrade(calculateCGPA(calculateResult(index)))));
        }
        else System.out.println("Student Not Found");
    }

    public double calculateResult(int index){
        double quiz = (StudentInformation.studentList.get(index).getFirstQuiz() +
                StudentInformation.studentList.get(index).getSecondQuiz()+
                StudentInformation.studentList.get(index).getThirdQuiz())/3;

        StudentInformation.studentList.get(index).setQuizMark(quiz);
        double result = quiz+
                StudentInformation.studentList.get(index).getAttendenceMark()+
                StudentInformation.studentList.get(index).getAssignmentMarks()+
                StudentInformation.studentList.get(index).getPresentationMark()+
                StudentInformation.studentList.get(index).getMidtermMark()+
                StudentInformation.studentList.get(index).getFinalMark();

        return result;
    }

    public double calculateCGPA(double result){
        double cgpa;
        if (result>=80)
            cgpa = 4.00;
        else if (result>=75)
            cgpa = 3.75;
        else if (result>=70)
            cgpa = 3.50;
        else if (result>=65)
            cgpa = 3.25;
        else if (result>=60)
            cgpa = 3.00;
        else if (result>=55)
            cgpa = 2.75;
        else if (result>=50)
            cgpa = 2.50;
        else if (result>=45)
            cgpa = 2.25;
        else if (result>=40)
            cgpa = 2.00;
        else cgpa = 0.0;

        return cgpa;
    }

    public String getGrade(double cgpa){

        if (cgpa == 4.00) return "A+";
        if (cgpa == 3.75) return "A";
        if (cgpa == 3.50) return "A-";
        if (cgpa == 3.25) return "B+";
        if (cgpa == 3.00) return "B";
        if (cgpa == 2.75) return "B-";
        if (cgpa == 2.50) return "C+";
        if (cgpa == 2.25) return "C";
        if (cgpa == 2.00) return "D";

        return "F";
    }

    public void setCGPA(){
        for (int i=1; i<=StudentInformation.studentList.getSize(); i++) {
            StudentInformation.studentList.get(i).setCgpa(calculateCGPA(calculateResult(i)));
            StudentInformation.studentList.get(i).setGrade(getGrade(calculateCGPA(calculateResult(i))));
        }
    }


    public void displayFullResult(){

        System.out.println(String.format("%25s%25s%15s%15s", "ID", "Name", "CGPA", "GRADE"));
        for (int i=1; i<=StudentInformation.studentList.getSize(); i++){
            System.out.println(String.format("%25s%25s%15.2f%15s",
                    StudentInformation.studentList.get(i).getIdNumber(),
                    StudentInformation.studentList.get(i).getStudentName(),
                    StudentInformation.studentList.get(i).getCgpa(),
                    StudentInformation.studentList.get(i).getGrade()));

        }
    }

    public void generateATextFile(){
        final String path = "/home/guru/Desktop/results.txt";
        StringBuffer sb = new StringBuffer();
        sb.append(String.format("%15s25s%10.2f%10.2f%10.2f%15.2f%15.2f%15.2f%10.2f%10.2f%10.2f%10.2s",
                "ID", "NAME", "QUIZ1", "QUIZ2", "QUIZ3", "ATTENDANCE", "ASSIGNMENT", "PRESENTATION", "MIDTERM", "FINAL", "CGPA", "GRADE"));
        sb.append("\n");
        for (int i=1; i<=175; i++){
            sb.append("-");
        }
        sb.append("\n");

        for (int i=1; i<=StudentInformation.studentList.getSize(); i++){
            sb.append(String.format("%15s25s%10.2f%10.2f%10.2f%15.2f%15.2f%15.2f%10.2f%10.2f%10.2f%10.2s",
                    StudentInformation.studentList.get(i).getIdNumber(),
                    StudentInformation.studentList.get(i).getStudentName(),
                    StudentInformation.studentList.get(i).getFirstQuiz(),
                    StudentInformation.studentList.get(i).getSecondQuiz(),
                    StudentInformation.studentList.get(i).getThirdQuiz(),
                    StudentInformation.studentList.get(i).getAttendenceMark(),
                    StudentInformation.studentList.get(i).getAssignmentMarks(),
                    StudentInformation.studentList.get(i).getPresentationMark(),
                    StudentInformation.studentList.get(i).getMidtermMark(),
                    StudentInformation.studentList.get(i).getFinalMark(),
                    StudentInformation.studentList.get(i).getCgpa(),
                    StudentInformation.studentList.get(i).getGrade()));

            sb.append("\n");
        }
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
