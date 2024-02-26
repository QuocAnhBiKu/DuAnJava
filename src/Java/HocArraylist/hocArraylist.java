package Java.HocArraylist;

import java.util.ArrayList;

public class hocArraylist {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Quoc");
        list1.add("Quoc1");
        list1.add("Quoc2");


        System.out.println(list1.toString()+"   "+ list1.size() +" "+
                list1.get(2));
    }
}
