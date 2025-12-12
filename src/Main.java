public class Main {
    public static void main(String[] args) {
        Donor donor1 = new Donor("Ivan Ivan");
        Donor donor2 = new Donor("Maria Vodka");
        Donor donor3 = new Donor("Alixie Pixi");

        Charity charity1 = new Charity("Kids");
        Charity charity2 = new Charity("Animals");
        Charity charity3 = new Charity("Old people");

        Donate donate1 = new Donate(donor1);
        donate1.addDollars(5000);
        Donate donate2 = new Donate(donor2);
        donate2.addDollars(3000);
        Donate donate3 = new Donate(donor3);
        donate3.addDollars(10000);

        charity1.addMoney(donate1);
        charity2.addMoney(donate2);
        charity3.addMoney(donate3);

        System.out.println("Donor 1: " + donor1.getDonor());
        System.out.println("Donor 2: " + donor2.getDonor());
        System.out.println("Donor 3: " + donor3.getDonor());

        System.out.println("\n");
        System.out.println("Charity 1: " + charity1.title);
        System.out.println("Charity 2: " + charity2.title);
        System.out.println("Charity 3: " + charity3.title);

        System.out.println("\n");
        System.out.println("Donates compare:");
        System.out.println("donate1 > donate2? " + (donate1.getSum() > donate2.getSum()));
    }
}