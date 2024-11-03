import java.util.Scanner;

public class ArbTaker {
    java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
    private int arbId;
    private int arbYear;
    private int arbMonthlySalary;
    private int taxPercent;

    public ArbTaker(int arbId, int arbYear, int arbMonthlySalary, int taxPercent) {
        this.arbId = arbId;
        this.arbYear = arbYear;
        this.arbMonthlySalary = arbMonthlySalary;
        this.taxPercent = taxPercent;
    }

    public int getArbId() {
        return arbId;
    }

    public int getArbYear() {
        return arbYear;
    }

    public int getArbMonthlySalary() {
        return arbMonthlySalary;
    }

    public int getTaxPercent() {
        return taxPercent;
    }

    public void setArbId(int arbId) {
        this.arbId = arbId;
    }

    public void setArbYear(int arbYear) {
        this.arbYear = arbYear;
    }

    public void setArbMonthlySalary(int arbMonthlySalary) {
        this.arbMonthlySalary = arbMonthlySalary;
    }

    public void setTaxPercent(int taxPercent) {
        this.taxPercent = taxPercent;
    }

    public double monthlyTax() {
        return (double) (arbMonthlySalary * taxPercent) / 100;
    }

    public int yearlySalary() {
        return arbMonthlySalary * 12;
    }

    public double yearlyTaxDeduction() {
        return (monthlyTax() * 11) + (monthlyTax() / 2);
    }

    public String lastNameFirstName(Person person) {
        return person.getLastName() + " " + person.getFirstName();
    }

    public int age(Person person) {
        int year = calendar.get(java.util.Calendar.YEAR);
        return year - person.getBirthYear();
    }

    public int employedYears() {
        int year = calendar.get(java.util.Calendar.YEAR);
        return year - arbYear;
    }

    public boolean employedHowLong(int years) {
        return employedYears() > years;
    }

    public static void main(String[] args) {
        Person person = new Person("Tord", "Fosse", 2001);
        ArbTaker arbTaker = new ArbTaker(1234, 2020, 30000, 25);
        System.out.println(arbTaker.lastNameFirstName(person));
        System.out.println(arbTaker.yearlySalary());
        System.out.println(arbTaker.yearlyTaxDeduction());
        System.out.println(arbTaker.monthlyTax());
        System.out.println(arbTaker.age(person));
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Jobbet i mer en antall år?: ");
                int years = scanner.nextInt();
                System.out.println(arbTaker.employedHowLong(years));
            } catch (Exception e) {
                System.out.println("Svar var ikke et antall år.");
            }

        }
    }
}

