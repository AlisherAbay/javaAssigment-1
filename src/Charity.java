import java.util.ArrayList;

public class Charity {
    public String title;
    public ArrayList<Donate> donateArrayList = new ArrayList<>();
    public int allMoney = 0;
    public Charity(String title) {
        this.title = title;
    }
    public void addMoney(Donate donate) {
        donateArrayList.add(donate);
        allMoney += donate.getSum();
    }
}
