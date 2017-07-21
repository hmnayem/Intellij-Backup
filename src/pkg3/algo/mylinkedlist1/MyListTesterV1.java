package pkg3.algo.mylinkedlist1;

public class MyListTesterV1 {

    public static void main(String[] args){
        MySInglyLinkedListV1<String> list = new MySInglyLinkedListV1<>();

        list.addFirst("Shegufa");
        list.addFirst("Taranjum");
        list.addFirst("Nayem");
        list.addLast("Shohan");
        list.addLast("Mim");
        list.addFirst("Guru");
        list.addAtIndex("Hasan", 3);
        list.addAtIndex("Nayem", 6);


        System.out.println(list);
        System.out.println(list.isEmpty() + "    Size is : " + list.getSize());
        System.out.println(list.delete("Guru"));
        System.out.println(list);
        System.out.println(list.delete("Mim"));
        System.out.println(list);
    }
}
