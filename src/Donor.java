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
    public ArrayList<Charity> getCharites() {
        return charitiesArrayList;
    }
    @Override
    public String toString() {
        return "name and surname: " + nameSurname;
    }
    @Override
    public boolean equals(Object obj) {
        Donor donate2 = (Donor) obj;
        return this.nameSurname.equals(donate2.nameSurname);
    }
    @Override
    public int hashCode() {
        int result = donatedMoney;
        result = 16 * result;
        return result;
    }
}
