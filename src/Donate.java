public class Donate {
    private int sum = 0;
    public Donor donor;
    public Donate(Donor donor) {
        this.donor = donor;
    }
    public int getSum() {
        return sum;
    }
    public void addDollars(int dollars) {
        sum += dollars;
    }
}
