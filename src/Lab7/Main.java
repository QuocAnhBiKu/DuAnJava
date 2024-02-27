package Lab7;

public class Main {
    public static void main(String[] args) {
        SinhVien it1 = new SinhVienIT(123,"Anh",2000,5,"Java",8,9);
        SinhVien cokhi1 = new SinhVienCoKhi(124,"Quoc",2000,2,"Nhanh nhen",5,8);

        System.out.println("Danh sach sinh vien IT " + it1.toString());
        System.out.println("Danh sach sinh vien Co Khi " + cokhi1.toString());

    }
}
