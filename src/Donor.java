import java.util.ArrayList;

public class Donor {
    public String nameSurname;
    public int donatedMoney = 0;
    public ArrayList<Charity> charitiesArrayList = new ArrayList<>();
    public Donor(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public String getDonor() {
        return nameSurname;
    }
    public void addCharity(Charity organisation) {
        charitiesArrayList.add(organisation);
    }
    public void donateMoney(Donate donate) {
        donatedMoney += donate.getSum();
    }
}
