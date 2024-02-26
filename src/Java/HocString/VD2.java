package Java.HocString;

import java.util.ArrayList;

public class VD2 {
    public static void main(String[] args) {
        Student st = new Student("Nguyen Van Quoc Anh",1);
        Student st1 = new Student("Truong Quang Hung",2);
        Student st2 = new Student("Tran Thanh Phuc",3);
        Student st3 = new Student("Pham Nguyen Hoang The Nghia",4);
        Student st4 = new Student("Nguyen Le Bao Phuoc",5);

        ArrayList<Student> liststudent = new ArrayList<Student>();

        liststudent.add(st);
        liststudent.add(st1);
        liststudent.add(st2);
        liststudent.add(st3);
        liststudent.add(st4);
        for (int i = 0; i<liststudent.size(); i++){
            if(liststudent.get(i).getName().startsWith("Nguyen")){
                System.out.println("Danh sach ten ho Nguyen la: " + liststudent.get(i));
            }
        }


    }
}
