public class Brok {
    private int teller;
    private int nevner;

    public Brok(int teller, int nevner) {
        if (nevner == 0) {
            throw new IllegalArgumentException("Nevner kan ikke være 0.");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    public Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void add(Brok other) {
        this.teller = this.teller * other.nevner + this.nevner * other.teller;
        this.nevner = this.nevner * other.nevner;
    }

    public void subtract(Brok other) {
        this.teller = this.teller * other.nevner - this.nevner * other.teller;
        this.nevner = this.nevner * other.nevner;
    }

    public void multiply(Brok other) {
        this.teller = this.teller * other.nevner;
        this.nevner = this.nevner * other.nevner;
    }

    public void divide(Brok other) {
        if (other.teller == 0) {
            throw new IllegalArgumentException("Kan ikke dele med 0.");
        }
        this.teller = this.teller * other.nevner;
        this.nevner = this.nevner * other.teller;
    }

    public static void main(String[] args) {
        Brok f1 = new Brok(5, 8);
        Brok f2 = new Brok(3, 10);

        f1.add(f2);
        System.out.println(f1.getTeller() + "/" + f1.getNevner());

        f1 = new Brok(3, 4);
        f1.subtract(f2);
        System.out.println(f1.getTeller() + "/" + f1.getNevner());

        f1 = new Brok(3, 4);
        f1.multiply(f2);
        System.out.println(f1.getTeller() + "/" + f1.getNevner());

        f1 = new Brok(3, 4);
        f1.divide(f2);
        System.out.println(f1.getTeller() + "/" + f1.getNevner());

    }
}