package projects.classmanagement;

import java.util.Date;

public class AssignmentProfile {

    private String studentId;
    private String studentName;
    private Date submissionDate;
    private Boolean state;
    private Boolean lateSubmit;

    public AssignmentProfile(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        this.submissionDate = null;
        this.lateSubmit = false;
        this.state = false;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Boolean getLateSubmit() {
        return lateSubmit;
    }

    public void setLateSubmit(Boolean lateSubmit) {
        this.lateSubmit = lateSubmit;
    }
}
