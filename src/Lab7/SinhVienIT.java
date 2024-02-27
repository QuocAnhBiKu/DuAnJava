package Lab7;

public class SinhVienIT extends SinhVien {
    private String langguage;
    private double scoreJava ;
    private double scoreHTML;
    public SinhVienIT(int id, String name, double price, double tax,String langguage,double scoreJava,double scoreHTML) {
        super(id, name, price, tax);
        this.langguage =langguage;
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getDiem() {
        return (this.scoreJava *2 + scoreHTML)/3;
    }

    public String getLangguage() {
        return langguage;
    }

    public void setLangguage(String langguage) {
        this.langguage = langguage;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    @Override
    public String toString() {
        return "id=  " + super.getId()+ "/ Name = " + super.getName() +
                "/ Price = "+ super.getPrice()+ "/ Tax = " + super.getTax() + "/ Thue = " + super.getPriceTax()+
                "/ langguage= '" + langguage +
                "/ scoreJava=" + scoreJava +
                "/ scoreHTML=" + scoreHTML +
                " /DiemTB = " + getDiem();
    }
}
