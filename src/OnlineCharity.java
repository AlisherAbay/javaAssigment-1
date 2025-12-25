public class OnlineCharity extends Charity {
    public String website;

    public OnlineCharity(String title, String website) {
        super(title);
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    @Override
    public String toString() {
        return super.toString() + " Website: " + website;
    }
}
