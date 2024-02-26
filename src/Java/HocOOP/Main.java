package Java.HocOOP;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Anh");
        student.setAge(21);
        System.out.print("Toi ten la " + student.getName() + " toi " + student.getAge() + "Tuoi");
    }
}
