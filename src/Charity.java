import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
    // greater than
    public List<Donate> moneyGT(int gt) {
        return donateArrayList.stream().filter(x -> x.getSum() > gt).collect(Collectors.toList());
    }
    public List<Donate> getAllDonates(String nameSurname) {
        return donateArrayList.stream().filter(x -> x.donor.nameSurname.equals(nameSurname)).collect(Collectors.toList());
    }
    public List<Donate> sortByMoney() {
        return donateArrayList.stream().sorted(Comparator.comparing(Donate::getSum)).toList();
    }
    @Override
    public String toString() {
        return "Charity: " + title + " All money: " + String.valueOf(allMoney);
    }
    @Override
    public boolean equals(Object obj) {
        Charity donate2 = (Charity) obj;
        return this.title.equals(donate2.title) & this.allMoney == donate2.allMoney;
    }
    @Override
    public int hashCode() {
        int result = allMoney;
        result = 16 * result;
        return result;
    }
}
