package Lab4;

public class Main {
    public static void main(String[] args) {
        Product pr = new Product();
        Product pr1 = pr.nhapThongTin("Anh",200,3);
        pr.xuatThongTin(pr1);


        System.out.print("So tien thue " + pr.getTaxprice(pr1.getPrice(), pr1.getTax()));
    }
}
