package projects.classmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AttendenceInformation {

    private StudentAttendeceList attendeceList;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AttendenceInformation(){
        attendeceList = new StudentAttendeceList();

        for (int i=1; i<=StudentInformation.studentList.getSize(); i++){
            String id = StudentInformation.studentList.get(i).getIdNumber();
            String name = StudentInformation.studentList.get(i).getStudentName();

            attendeceList.insert(new AttendeceProfile(id, name));
        }
    }

    public void makeAttendence() throws IOException {
        System.out.println(String.format("%25s%25s%15s", "Student ID", "Student Name", "Status"));
        for (int i=1; i<=attendeceList.getSize(); i++){
            Date date = Calendar.getInstance().getTime();
            System.out.print(String.format("%25s%25s%14s", attendeceList.get(i).getStudentId(),
                    attendeceList.get(i).getStudentName(), ""));
            char check = br.readLine().toLowerCase().charAt(0);
            Boolean value = (check=='p' ? true : false);
            attendeceList.get(i).setStudentTrack(date, value);

            System.out.println();
        }

        calculateScore();
    }

    public void displayIndividualInfo(String value){
        int found = attendeceList.search(value);

        if (found!=-1){
            System.out.println(String.format("%25s%30s", "ID", "NAME"));
            System.out.println(String.format("%25s%30s%25s%6d%25s%6d%25s%6s", attendeceList.get(found).getStudentId(),
                    attendeceList.get(found).getStudentName(),
                    "Total Class: ", getTotalClass(), "Total Present: ", getTotalAttend(found), "Total Absent", getTotalAbsent(found)));

            for (int i=1; i<=attendeceList.get(found).getStudentTrack().size(); i++){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String date = dateFormat.format(attendeceList.get(found).getStudentTrack().get(i-1).getDate());
                String present = attendeceList.get(found).getStudentTrack().get(i-1).getPresent()?"Present":"Absent";
                System.out.println(String.format("%25s%30s", date, present));
            }
        }
        else {
            System.out.println("Student Not found");
        }
    }



    public int getTotalClass(){
        return attendeceList.get(1).getStudentTrack().size();
    }

    public int getTotalAttend(int index){
        int attend = 0;
        for (int i=0; i<getTotalClass(); i++){
            if (attendeceList.get(index).getStudentTrack().get(i).getPresent())
                attend++;
        }

        return attend;
    }

    public int getTotalAbsent(int index){
        return getTotalClass()-getTotalAttend(index);
    }

    public void calculateScore(){
        for (int i=1; i<=attendeceList.getSize(); i++){
            double score = (double)(7*getTotalAttend(i))/getTotalClass();
            StudentInformation.studentList.get(i).setAttendenceMark(score);
        }
    }
}
