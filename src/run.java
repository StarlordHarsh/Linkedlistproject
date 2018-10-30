public class run {
    public static void main(String[] args)
    {
        List list = new List();
        list.Insert(5);
        list.Insert(15);
        list.InsertAtAny(1, 20);
        list.InsertAtStart(2);
        list.show();

    }

}