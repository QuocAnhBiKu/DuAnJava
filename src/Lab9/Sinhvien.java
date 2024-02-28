package Lab9;

public class Sinhvien
{
    private String MSSV;
    private String hoten;
    private Double diem;
    private int age;

    public Sinhvien() {
    }

    public Sinhvien(String MSSV, String hoten, Double diem, int age) {
        this.MSSV = MSSV;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Double getDiem() {
        return diem;
    }

    public void setDiem(Double diem) {
        this.diem = diem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "MSSV='" + MSSV + '\'' +
                ", hoten='" + hoten + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
