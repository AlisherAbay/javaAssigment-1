public class OfflineCharity extends Charity {
    public String location;

    public OfflineCharity(String title, String location) {
        super(title);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return super.toString() + " Location: " + location;
    }
}
