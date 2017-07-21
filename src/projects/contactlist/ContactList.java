package projects.contactlist;

public class ContactList {

    protected static class CNode{
        CNode next;
        ContactInformation data;

        CNode(ContactInformation data){
            this.data = data;
            this.next = null;
        }
    }

    private CNode head;
    private int size;

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(ContactInformation data){
        CNode node = new CNode(data);

        if (isEmpty()){
            head = node;
            size++;
            return;
        }
        else if (data.getName().compareTo(head.data.getName()) < 0){
            node.next = head;
            head = node;
            size++;
            return;
        }

        else {

            CNode after = head.next;
            CNode before = head;

            while (after!=null){
                if (data.getName().compareTo(after.data.getName()) < 0)
                    break;
                before = after;
                after = after.next;
            }
            node.next = before.next;
            before.next = node;
            size++;
        }

    }
    public ContactInformation get(int index){
        ContactInformation info = null;

        if (index < 1 || index > getSize()){
            throw new IndexOutOfBoundsException("Not a valid Index");
        }

        if (index == 1)
            info = head.data;
        else {
            CNode node = head;
            while (index-1>0){
                node = node.next;
                index--;
            }
            info = node.data;
        }

        return info;
    }

    public boolean delete(int index){
        if (isEmpty())
            return false;

        if (index<1 || index>getSize()+1)
            throw new IndexOutOfBoundsException("Invalid index");

        if (index == 1){
            head = head.next;
            size--;
            return true;
        }
        if (index>1 && index<getSize()+1){
            CNode node = head;

            for (int i=1; node!=null && i<index-1; i++){
                node = node.next;
            }
            node.next = node.next.next;
            size--;
            return true;
        }
        return false;
    }

    public int search(String value){
        int index = 1;

        CNode node = head;
        while (node!=null){
            if (node.data.getPhoneNumber().compareTo(value) == 0 || node.data.getName().compareTo(value) == 0){
                return index;
            }
            else {
                node = node.next;
                index++;
            }
        }
        return -1;

    }
}
