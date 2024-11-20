import java.util.Scanner;

public static void main(String[] args) {
  PropertyRegister register = new PropertyRegister();
  register.addProperty(new Property(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen"));
  register.addProperty(new Property(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
  register.addProperty(new Property(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
  register.addProperty(new Property(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
  register.addProperty(new Property(1455, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));
  while (true) {
    System.out.println("\n1. Legg til eiendom");
    System.out.println("2. Skriv ut alle eiendommer");
    System.out.println("3. Søk etter eiendom");
    System.out.println("4. Gjennomsnittlig areal av alle eiendommer");
    System.out.println("5. Fjern eiendom");
    System.out.println("6. Antall eiendommer");
    System.out.println("7. Søk via gårdsnummer");
    System.out.println("8. Avslutt");
    System.out.print("Valg: ");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    sc.nextLine();
    switch (choice) {
      case 1:
        register.addProperty();
        break;
      case 2:
        register.printAllProperties();
        break;
      case 3:
        register.searchProperty();
        break;
      case 4:
        System.out.println("Gjennomsnittlig areal av alle eiendommer: " + register.averageArea());
        break;
      case 5:
        register.removeProperty();
        break;
      case 6:
        System.out.println("Antall eiendommer: " + register.numberOfProperties());
        break;
      case 7:
        register.searchByLotNumber();
        break;
      case 8:
        System.exit(0);
        break;
      default:
        System.out.println("Ugyldig valg");
    }
  }
}
