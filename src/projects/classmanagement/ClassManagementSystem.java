package projects.classmanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ClassManagementSystem {
    StudentInformation studentInformation;
    GenerateResult generateResult;

    public ClassManagementSystem(){
        studentInformation = new StudentInformation();
        generateResult = new GenerateResult();
    }

    public static void main(String...args) throws IOException {

        ClassManagementSystem classManagementSystem = new ClassManagementSystem();
        AttendenceInformation attendenceInformation=null;
        AssignmentManagement assignmentManagement=null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        boolean mainmenu = true;
        boolean submenu;
        int menuNumber, studentMenuNumber, attendenceMenuNumber, assignmentMenuNumber, markMenuNumber, resultMenuNumber;
        do {
            mainDisplay();
            menuNumber = Integer.parseInt(br.readLine());

            switch (menuNumber){

                case 1:
                    submenu = true;
                    do {
                        studentDisplay();
                        studentMenuNumber = Integer.parseInt(br.readLine());

                        switch (studentMenuNumber){

                            case 1:
                                System.out.print("\tENTER STUDENT ID : ");
                                String id = br.readLine();
                                System.out.print("\n\tENTER STUDENT NAME : ");
                                String name = br.readLine();
                                System.out.print("\n\tENTER STUDENT SECTION : ");
                                String sec = br.readLine();
                                System.out.println();
                                classManagementSystem.studentInformation.addStudent(id,name,sec);
                                System.out.println("\tSUCCESSFULLY ADDED...");
                                break;

                            case 2:
                                classManagementSystem.studentInformation.deleteStudent();
                                break;

                            case 3:
                                System.out.print("\tENTER STUDENT ID : ");
                                String names = sc.next();
                                classManagementSystem.studentInformation.searchStudent(names);
                                break;

                            case 4:
                                classManagementSystem.studentInformation.displayStudentsList();
                                break;

                            case 5:
                                classManagementSystem.studentInformation.displayStudentFullInfo();
                                break;

                            case 6:
                                attendenceInformation = new AttendenceInformation();
                                assignmentManagement = new AssignmentManagement();
                                System.out.println("\tSuccessfully Shared Your Data To Other System...");
                                break;

                            case 7:
                                submenu = false;
                                break;

                            default:
                                System.out.println("INVALID SELECTION");
                        }

                    }while (submenu);

                    break;
                case 2:
                    submenu = true;

                    do {
                        attendenceDisplay();
                        attendenceMenuNumber = Integer.parseInt(br.readLine());

                        switch (attendenceMenuNumber){

                            case 1:
                                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                Date date = Calendar.getInstance().getTime();
                                System.out.println("\t\tTODAYS ATTENDENCE\t\tDATE: " + dateFormat.format(date));
                                attendenceInformation.makeAttendence();
                                break;

                            case 2:
                                System.out.println("\tThere are Total " + attendenceInformation.getTotalClass() + " have done");
                                break;

                            case 3:
                                System.out.println("\tPlease Enter Student ID to track his/her attendance report");
                                String ids = br.readLine();
                                attendenceInformation.displayIndividualInfo(ids);
                                break;

                            case 4:
                                submenu = false;
                                break;

                            default:
                                System.out.println("INVALID SELECTION");
                        }

                    }while (submenu);

                    break;
                case 3:

                    submenu = true;

                    do {
                        assignmentDisplay();
                        assignmentMenuNumber = Integer.parseInt(br.readLine());

                        switch (assignmentMenuNumber){

                            case 1:
                                System.out.print("\tEnter Title : ");
                                String title = br.readLine();
                                System.out.print("\tEnter Description : ");
                                String des = br.readLine();
                                System.out.print("\tEnter Last Date(dd/mm/yyyy) : ");
                                String date = br.readLine();

                                assignmentManagement.setAssignment(title,des,date);

                                break;

                            case 2:
                                assignmentManagement.viewAssignment();
                                break;

                            case 3:
                                System.out.print("Enter Student ID : ");
                                String idf = br.readLine();
                                SimpleDateFormat simpleDateFormat =new SimpleDateFormat("dd/MM/yyyy");
                                Date date1 = Calendar.getInstance().getTime();

                                assignmentManagement.markDone(idf);
                                System.out.println("Assigment submitted by " + idf + " added on " + simpleDateFormat.format(date1) + " successfully");
                                break;

                            case 4:
                                classManagementSystem.studentInformation.displayStudentsList();
                                System.out.print("\n\tEnter Student Index : ");
                                int ind = Integer.parseInt(br.readLine());
                                System.out.print("\n\tEnter Mark : ");
                                double mark = Double.parseDouble(br.readLine());
                                assignmentManagement.assignmentMark(ind, mark);
                                System.out.println("\n\tMark Added Successfully");
                                break;

                            case 5:
                                assignmentManagement.assignmentMarkToAll();
                                break;

                            case 6:
                                assignmentManagement.viewSubmitted();
                                break;

                            case 7:
                                assignmentManagement.viewUnsubmitted();
                                break;

                            case 8:
                                assignmentManagement.viewLateSubmitted();
                                break;

                            case 9:
                                submenu = false;
                                break;

                            default:
                                System.out.println("INVALID SELECTION");
                                break;

                        }

                    }while (submenu);
                    break;
                case 4:
                    submenu = true;

                    do {
                        markDisplay();
                        markMenuNumber = Integer.parseInt(br.readLine());

                        switch (markMenuNumber){

                            case 1:
                                classManagementSystem.studentInformation.manualUpdate();
                                break;

                            case 2:
                                classManagementSystem.studentInformation.updateTopicsMark();
                                break;

                            case 3:
                                submenu = false;
                                break;

                            default:
                                System.out.println("INVALID SELECTION");
                                break;
                        }

                    }while (submenu);
                    break;
                case 5:
                    submenu = true;
                    do {
                        resultDisplay();
                        resultMenuNumber = Integer.parseInt(br.readLine());

                        switch (resultMenuNumber){

                            case 1:
                                if (classManagementSystem.generateResult.getState()){
                                    System.out.print("Enter Students ID : ");
                                    String id = br.readLine();
                                    classManagementSystem.generateResult.studentResult(id);
                                }else System.out.println("Result Not Published");
                                break;

                            case 2:
                                if (classManagementSystem.generateResult.getState()){
                                    classManagementSystem.generateResult.displayFullResult();
                                }else System.out.println("Result Not Published");
                                break;

                            case 3:
                                if (classManagementSystem.generateResult.getState()){
                                    classManagementSystem.studentInformation.makeAfile();
                                    System.out.println("File Successfully Created");
                                }
                                else System.out.println("Result Not Published");
                                break;

                            case 4:
                                classManagementSystem.generateResult.setCGPA();
                                classManagementSystem.generateResult.setState();

                                System.out.println("Result Published");
                                break;

                            case 5:
                                submenu = false;
                                break;

                            default:
                                System.out.println("INVALID SELECTION");

                        }

                    }while (submenu);
                    break;
                case 6:
                    mainmenu = false;
                    break;
                default:
                    System.out.println("INVALID SELECTION");
                    break;
            }

        }while (mainmenu);

    }

    public static void mainDisplay(){
        System.out.println("\n\tWelcome to STUDENT MANAGEMENT SYSTEM\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tSTUDENTS");
        System.out.println("\t\t2.\tATTENDANCE");
        System.out.println("\t\t3.\tASSIGNMENT");
        System.out.println("\t\t4.\tMARKS");
        System.out.println("\t\t5.\tRESULT");
        System.out.println("\t\t6.\tEXIT");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

    public static void studentDisplay(){
        System.out.println("\n\tSTUDENTS INFORMATION\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tADD STUDENT");
        System.out.println("\t\t2.\tDELETE STUDENT");
        System.out.println("\t\t3.\tSEARCH STUDENT");
        System.out.println("\t\t4.\tVIEW STUDENT LIST");
        System.out.println("\t\t5.\tVIEW FULL INFORMATION");
        System.out.println("\t\t6.\tSHARE YOUR DATA");
        System.out.println("\t\t7.\tBACK TO MAIN MENU");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

    public static void attendenceDisplay(){
        System.out.println("\n\tATTENDANCE INFORMATION\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tTAKE ATTENDANCE");
        System.out.println("\t\t2.\tTOTAL CLASS");
        System.out.println("\t\t3.\tTRACK STUDENTS");
        System.out.println("\t\t4.\tBACK TO MAIN MENU");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

    public static void assignmentDisplay(){
        System.out.println("\n\tASSIGNMENT INFORMATION\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tNEW ASSIGNMENT");
        System.out.println("\t\t2.\tVIEW ASSIGNMENT");
        System.out.println("\t\t3.\tMARK DONE");
        System.out.println("\t\t4.\tINDIVIDUAL MARKING");
        System.out.println("\t\t5.\tALL MARKING");
        System.out.println("\t\t6.\tVIEW SUBMITTED");
        System.out.println("\t\t7.\tVIEW UN SUBMITTED");
        System.out.println("\t\t8.\tVIEW LATE SUBMITTED");
        System.out.println("\t\t9.\tBACK TO MAIN MENU");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

    public static void markDisplay(){
        System.out.println("\n\tUPDATE STUDENTS MARK\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tMANUAL UPDATE");
        System.out.println("\t\t2.\tALL UPDATE");
        System.out.println("\t\t3.\tBACK TO MAIN MENU");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

    public static void resultDisplay(){
        System.out.println("\n\tCHECK STUDENTS RESULT\n");
        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }

        System.out.println("\n\t\t1.\tCHECK RESULT");
        System.out.println("\t\t2.\tVIEW FULL RESULT");
        System.out.println("\t\t3.\tMAKE A FILE");
        System.out.println("\t\t4.\tPUBLISH RESULT");
        System.out.println("\t\t5.\tBACK TO MAIN MENU");

        System.out.print("\t");
        for (int i=1; i<=30; i++){
            System.out.print("*");
        }
        System.out.print("\n\tENTER YOUR CHOICE : ");
    }

}
