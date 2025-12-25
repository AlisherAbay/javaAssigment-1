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
    public String getDonorNameSurname() {
        return donor.nameSurname;
    }
    @Override
    public String toString() {
        return donor.toString() + " donated: " + String.valueOf(sum);
    }
    @Override
    public boolean equals(Object obj) {
        Donate donate2 = (Donate) obj;
        return this.sum == donate2.sum & this.donor == donate2.donor;
    }
    @Override
    public int hashCode() {
        int result = sum;
        result = 16 * result;
        return result;
    }
}
