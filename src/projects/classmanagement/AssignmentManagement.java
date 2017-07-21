package projects.classmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AssignmentManagement {

    private Date issueDate;
    private Date lastDate;
    private String title;
    private String description;
    StudentAssignmentList assignmentList;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public AssignmentManagement(){
        assignmentList = new StudentAssignmentList();

        for (int i=1; i<=StudentInformation.studentList.getSize();i++){
            String id = StudentInformation.studentList.get(i).getIdNumber();
            String name = StudentInformation.studentList.get(i).getStudentName();
            assignmentList.insert(new AssignmentProfile(id, name));
        }
    }

    public void setAssignment(String title, String description, String lastDate){
        String strDate = lastDate;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date lastDates = null;
        try {
            lastDates = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.title = title;
        this.description = description;
        this.lastDate = lastDates;

        Date submit = Calendar.getInstance().getTime();
        this.issueDate = submit;

        System.out.println("\nAssignment Successfully Created\n");
        viewAssignment();

    }

    public void viewAssignment(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println(title);
        System.out.println(description);
        System.out.println("\nCreated on : " + simpleDateFormat.format(issueDate) + ". Last Date of Submission : " + simpleDateFormat.format(lastDate));
    }

    public void markDone(String id){
        int found = assignmentList.search(id);
        if(found!=-1){
            Date submissionDate = Calendar.getInstance().getTime();
            assignmentList.get(found).setSubmissionDate(submissionDate);
            assignmentList.get(found).setState(true);
            if (submissionDate.compareTo(lastDate)<0){
                assignmentList.get(found).setLateSubmit(false);
            }
            else {
                assignmentList.get(found).setLateSubmit(true);
            }
        }
    }

    public void assignmentMark(int index, double mark){

        if (assignmentList.get(index).getLateSubmit()){
            StudentInformation.studentList.get(index).setAssignmentMarks((mark-2));
        }
        else StudentInformation.studentList.get(index).setAssignmentMarks(mark);
    }

    public void assignmentMarkToAll() throws IOException {
        System.out.println("\t\tGIVE MARK TO ALL STUDENTS");
        for (int i=1; i<=assignmentList.getSize(); i++){
            System.out.print(String.format("%25s%25s%15s", assignmentList.get(i).getStudentId(), "ENTER MARK:", ""));
            if (assignmentList.get(i).getState()) {
                double mark = Double.parseDouble(br.readLine());
                assignmentMark(i, mark);
            }else System.out.print("UNSUBMITTED");
        }
        System.out.println("\nMARK ADDED SUCCESSFULLY...");
    }

    public void viewSubmitted(){
        boolean st = true;

        for (int i=1; i<=assignmentList.getSize(); i++){
            boolean status = assignmentList.get(i).getState();
            if (status){
                System.out.println(String.format("%15s%25s%35s", assignmentList.get(i).getStudentId(),
                        assignmentList.get(i).getStudentName(),
                        assignmentList.get(i).getSubmissionDate()));

                st = false;
            }
        }
        if (st)
            System.out.println("No one Submitted yet");
    }

    public void viewUnsubmitted() {
        boolean st = true;

        for (int i=1; i<=assignmentList.getSize(); i++){
            boolean status = assignmentList.get(i).getState();
            if (!status){
                System.out.println(String.format("%15s%25s", assignmentList.get(i).getStudentId(),
                        assignmentList.get(i).getStudentName()));

                st = false;
            }
        }
        if (st){
            System.out.println("All students Submit");
        }
    }

    public void viewLateSubmitted() {
        boolean st = true;
        for (int i=1; i<=assignmentList.getSize();i++){
            boolean status = assignmentList.get(i).getLateSubmit();
            if (status){
                System.out.println(String.format("%15s%25s%35s", assignmentList.get(i).getStudentId(),
                        assignmentList.get(i).getStudentName(),
                        assignmentList.get(i).getSubmissionDate()));

                st = false;
            }
        }

        if (st)
            System.out.println("No Late submit");
    }


}
