package projects.todolist;

import java.util.Date;

public class TODO implements Comparable<TODO>{

    private String title;
    private String description;
    private Date date;

    public TODO(String title, String description, Date date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    @Override
    public String toString(){

        String x = getTitle()+"\t"+getDate().toString()+"\n"+getDescription()+"\n";

        return x;
    }

    @Override
    public int compareTo(TODO todo) throws ClassCastException {

        if (!(todo instanceof TODO))
            throw new ClassCastException("A TODO Object required");

        return this.getDate().compareTo(todo.getDate());
    }
}
