package Java.HocKeThua;

public class SinhVienCoKhi extends SinhVien {
        private String skill;

        public SinhVienCoKhi(String skill,int id, String name, double price, double tax) {
                super(id,name,price,tax);
                this.skill = skill;
        }

        public String getSkill() {
                return skill;
        }

        public void setSkill(String skill) {
                this.skill = skill;
        }
        public double PriceTaxCoKhi(){
                return  super.getPriceTax();
        }

        @Override
        public String toString() {
                return "SinhVienCoKhi{" +
                        "skill= " + skill + "id=  " + super.getId()+ "Name = " + super.getName() +
                        "Price = "+ super.getPrice()+ " Tax = " + super.getTax() + "Thue = " + PriceTaxCoKhi()+
                        '}';
        }
}
