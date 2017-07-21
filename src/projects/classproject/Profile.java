package projects.classproject;

public class Profile implements Comparable<Profile>{

    private String id;
    private String name;
    private String section;
    private Double quiz1;
    private Double quiz2;
    private Double quiz3;
    private Double attendence;
    private Double presentation;
    private Double assignment;
    private Double midterm;
    private Double finalMarks;
    private Double CGPA;
    private String grade;

    public Profile(String id, String name, String section) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.quiz1 = null;
        this.quiz2 = null;
        this.quiz3 = null;
        this.attendence = null;
        this.presentation = null;
        this.assignment = null;
        this.midterm = null;
        this.finalMarks = null;
        this.CGPA = null;
        this.grade = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Double getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(Double quiz1) {
        this.quiz1 = quiz1;
    }

    public Double getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(Double quiz2) {
        this.quiz2 = quiz2;
    }

    public Double getQuiz3() {
        return quiz3;
    }

    public void setQuiz3(Double quiz3) {
        this.quiz3 = quiz3;
    }

    public Double getAttendence() {
        return attendence;
    }

    public void setAttendence(Double attendence) {
        this.attendence = attendence;
    }

    public Double getPresentation() {
        return presentation;
    }

    public void setPresentation(Double presentation) {
        this.presentation = presentation;
    }

    public Double getAssignment() {
        return assignment;
    }

    public void setAssignment(Double assignment) {
        this.assignment = assignment;
    }

    public Double getMidterm() {
        return midterm;
    }

    public void setMidterm(Double midterm) {
        this.midterm = midterm;
    }

    public Double getFinalMarks() {
        return finalMarks;
    }

    public void setFinalMarks(Double finalMarks) {
        this.finalMarks = finalMarks;
    }

    public Double getCGPA() {
        return CGPA;
    }

    public void setCGPA(Double CGPA) {
        this.CGPA = CGPA;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Profile o) throws ClassCastException {

        if (!(o instanceof Profile))
            throw new ClassCastException("A Student Profile Object Expected");

        return this.getId().compareTo(o.getId());
    }

    @Override
    public String toString(){
        return getId()+"\t" + getName() + "\t" + getSection();
    }

}
