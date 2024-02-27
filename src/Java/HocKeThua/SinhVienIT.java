package Java.HocKeThua;

public class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String language,int id, String name, double price, double tax) {
        super(id,name,price,tax);
        this.language=language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double PriceTaxIT(){
        return  super.getPriceTax();
    }

    @Override
    public String toString() {
        return "SinhVienIT{" +
                "Language= " + language + " id=  " + super.getId()+ " Name = " + super.getName() +
                " Price = "+ super.getPrice()+ " Tax = " + super.getTax() + " Thue = " + PriceTaxIT()+
                '}';
    }

}
