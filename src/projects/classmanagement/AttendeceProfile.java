package projects.classmanagement;

import java.util.Date;
import java.util.LinkedList;

public class AttendeceProfile {

    class IndividualAttendence{
        private Date date;
        private Boolean present;

        public IndividualAttendence(Date date, Boolean present){
            this.date = date;
            this.present = present;
        }

        public Boolean getPresent() {
            return present;
        }

        public Date getDate() {
            return date;
        }
    }

    private String studentName;
    private String studentId;
    LinkedList<IndividualAttendence> studentTrack;


    public AttendeceProfile(String studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
        studentTrack = new LinkedList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentTrack(Date date, Boolean present){
        IndividualAttendence attendence = new IndividualAttendence(date, present);
        studentTrack.add(attendence);
    }

    public LinkedList<IndividualAttendence> getStudentTrack(){
        return studentTrack;
    }


}
