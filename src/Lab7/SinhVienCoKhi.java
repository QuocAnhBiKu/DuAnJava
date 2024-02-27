package Lab7;

public class SinhVienCoKhi extends SinhVien{
    private String skill;
    private double scoreCNC;
    private double scorePLC;

    public SinhVienCoKhi(int id, String name, double price, double tax,String skill , double scoreCNC , double scorePLC) {
        super(id, name, price, tax);
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
        this.skill = skill;
    }


    @Override
    double getDiem() {
        return (this.scoreCNC + this.scorePLC)/2;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    @Override
    public String toString() {
        return "id=  " + super.getId()+ "/ Name = " + super.getName() +
                "/ Price = "+ super.getPrice()+ "/ Tax = " + super.getTax() + "/ Thue = " + super.getPriceTax()+
                "/ skill='" + skill + '\'' +
                "/ scoreCNC=" + scoreCNC +
                "/ scorePLC=" + scorePLC +
                " /DiemTB = " + getDiem();
    }
}
