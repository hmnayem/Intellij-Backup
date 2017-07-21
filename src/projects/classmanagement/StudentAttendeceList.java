package projects.classmanagement;

public class StudentAttendeceList {

    class AMNode{
        AMNode next;
        AttendeceProfile data;

        public AMNode(AttendeceProfile data){
            this.data = data;
            this.next = null;
        }
    }

    private AMNode head;
    private int size;

    public StudentAttendeceList(){
        head = null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(AttendeceProfile data){
        AMNode node = new AMNode(data);

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
            AMNode after = head.next;
            AMNode before = head;

            while (after!=null){
                if (data.getStudentId().compareTo(after.data.getStudentId())<0){
                    break;
                }
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

        AMNode node = head;
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

    public AttendeceProfile get(int index){
        if (index>getSize())
            return null;

        AMNode node = head;

        while (index-1 != 0){
            node = node.next;
            index--;
        }

        return node.data;
    }

}




















