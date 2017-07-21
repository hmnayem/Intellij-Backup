package pkg1.generics;

public class IDAnalasis {

    private String id;

    String [] records = new String[3];

    public IDAnalasis(String id){
        this.id = id;

        records = id.split("-");
    }

    public String getDept(){
        int code = Integer.parseInt(records[1]);

        if(code == 35)
            return "Department of SWE";
        if (code == 15)
            return "Department of CSE";

        return "Department \"Unknown\"";
    }

    public String getBatch(){
        int code = Integer.parseInt(records[0]);
        int b = code%10;

        if(b == 1)
            return "Spring";

        if(b == 2)
            return "Summer";

        if(b == 3)
            return "Fall";

        return "Unknown";
    }

    public String getYear(){
        int code = Integer.parseInt(records[0]);

        code /= 10;

        return "20" + code;
    }

    public String toString(){
        return ("Admited at " + getYear() + "(" + getBatch() + ")" + "\n" + getDept() + "\n");
    }


    public static void main(String[] args){

        IDAnalasis id1 = new IDAnalasis("162-35-1627");
        IDAnalasis id2 = new IDAnalasis("162-35-1660");
        IDAnalasis id3 = new IDAnalasis("162-15-1627");
        IDAnalasis id4 = new IDAnalasis("162-15-1660");
        IDAnalasis id5 = new IDAnalasis("151-30-1713");
        IDAnalasis id6 = new IDAnalasis("143-45-1648");

        System.out.println(id1);
        System.out.println(id2);
        System.out.println(id3);
        System.out.println(id4);
        System.out.println(id5);
        System.out.println(id6);
    }
}
