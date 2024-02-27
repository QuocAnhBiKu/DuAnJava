package Java.HocKeThua;

public class MainSV {
    public static void main(String[] args) {
        SinhVienIT it1 = new SinhVienIT("Java",123,"Quocanh",
                2000,3);
        SinhVienCoKhi ck1 = new SinhVienCoKhi("Nhiet Tinh",124,"Quocanh",
                2000,3);

        System.out.println("SInh vien: " + ck1.toString());
        System.out.println("SInh vien: " + it1.toString());
    }
}
