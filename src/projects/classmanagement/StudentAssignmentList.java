package projects.classmanagement;

public class StudentAssignmentList {

    class ANode{
        ANode next;
        AssignmentProfile data;

        public ANode(AssignmentProfile data){
            this.data = data;
            this.next = null;
        }
    }

    private ANode head;
    private int size;

    public StudentAssignmentList(){
        head = null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insert(AssignmentProfile data){
        ANode node = new ANode(data);

        if (isEmpty()){
            head = node;
            size++;
            return;
        }
        else if (data.getStudentId().compareTo(head.data.getStudentId())<0){
            node.next = head;
            head = node;
            size++;
            return;
        }
        else {
            ANode after = head.next;
            ANode before = head;

            while (after!=null){
                if (data.getStudentId().compareTo(after.data.getStudentId())<0)
                    break;

                before = after;
                after = after.next;
            }
            node.next = before.next;
            before.next = node;
            size++;
        }
    }

    public int search(String value){
        int index = 1;

        ANode node = head;
        while (node!=null){
            if (node.data.getStudentId().compareTo(value) == 0 || node.data.getStudentName().compareTo(value) == 0){
                return index;
            }
            else {
                node = node.next;
                index++;
            }
        }
        return -1;

    }

    public AssignmentProfile get(int index){

        if (index>getSize())
            return null;

        ANode node = head;

        while (index-1 != 0){
            node = node.next;
            index--;
        }

        return node.data;
    }
}























