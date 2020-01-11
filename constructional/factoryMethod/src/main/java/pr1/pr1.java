package pr1;

import java.util.ArrayList;
import java.util.List;

public class pr1 {
    public static void main(String args[])
    {
       List<a> listA = new ArrayList<a>();
       listA.add(new a());
        listA.add(new b());

        System.out.println(listA);

        List<b> listB = new ArrayList<b>();
        //listB.add(new a());
        listB.add(new b());

        System.out.println(listB);

        List<Object> list = new ArrayList<Object>();
        list.add(new a());
        list.add(new b());

        System.out.println(listA);
    }
}

class a{
    public String toString(){
        return "hello from a";
    }
}

class b extends a {
    public String toString(){
        return "hello from b";
    }
}