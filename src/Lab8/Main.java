package Lab8;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("123","Anh",21,9);
        Person p = new Person();
        System.out.println(st1.toString());
        st1.setGrade();
        System.out.println(st1.toString());

    }
}
