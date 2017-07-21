package projects.classmanagement;

import java.util.Map;

public class StudentProfile {

    private String idNumber;
    private String studentName;
    private String section;
    private Double firstQuiz;
    private Double secondQuiz;
    private Double thirdQuiz;
    private Double quizMark;
    private Double attendenceMark;
    private Double presentationMark;
    private Double assignmentMarks;
    private Double midtermMark;
    private Double finalMark;
    private Double cgpa;
    private String grade;


    public StudentProfile(String idNumber, String studentName, String section){
        this.idNumber = idNumber;
        this.studentName = studentName;
        this.section = section;
        firstQuiz = null;
        secondQuiz = null;
        thirdQuiz = null;
        quizMark = null;
        attendenceMark = null;
        presentationMark = null;
        assignmentMarks = null;
        midtermMark = null;
        finalMark = null;
        cgpa = null;
        grade = null;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Double getFirstQuiz() {
        return firstQuiz;
    }

    public void setFirstQuiz(Double firstQuiz) {
        this.firstQuiz = firstQuiz;
    }

    public Double getSecondQuiz() {
        return secondQuiz;
    }

    public void setSecondQuiz(Double secondQuiz) {
        this.secondQuiz = secondQuiz;
    }

    public Double getThirdQuiz() {
        return thirdQuiz;
    }

    public void setThirdQuiz(Double thirdQuiz) {
        this.thirdQuiz = thirdQuiz;
    }

    public Double getQuizMark() {
        return quizMark;
    }

    public void setQuizMark(Double quizMark) {
        this.quizMark = quizMark;
    }

    public Double getAttendenceMark() {
        return attendenceMark;
    }

    public void setAttendenceMark(Double attendenceMark) {
        this.attendenceMark = attendenceMark;
    }

    public Double getPresentationMark() {
        return presentationMark;
    }

    public void setPresentationMark(Double presentationMark) {
        this.presentationMark = presentationMark;
    }

    public Double getAssignmentMarks() {
        return assignmentMarks;
    }

    public void setAssignmentMarks(Double assignmentMarks) {
        this.assignmentMarks = assignmentMarks;
    }

    public Double getMidtermMark() {
        return midtermMark;
    }

    public void setMidtermMark(Double midtermMark) {
        this.midtermMark = midtermMark;
    }

    public Double getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(Double finalMark) {
        this.finalMark = finalMark;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
