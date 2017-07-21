package projects.contactlist;

public class ContactInformation{

    private String name;
    private char initial;
    private String phoneNumber;
    private String relation;

    public ContactInformation(){
        name = null;
        initial = '\0';
        phoneNumber = null;
        relation = null;
    }

    public ContactInformation(String name, String phoneNumber, int relation){
        this.name = name;
        this.initial = name.toUpperCase().charAt(0);
        this.phoneNumber = phoneNumber;

        switch (relation){
            case 1:
                this.relation = "Family";
                break;

            case 2:
                this.relation = "Friend";
                break;

            default:
                this.relation = "Other";
                break;

        }
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getRelation(){
        return relation;
    }

    public char getInitial(){
        return initial;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("\t");
        sb.append(getInitial());
        sb.append("\t\t");
        sb.append(getName());
        sb.append("\t\t");
        sb.append(getPhoneNumber());
        sb.append("\t\t");
        sb.append(getRelation());

        return sb.toString();
    }

}
