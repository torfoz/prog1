import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PropertyRegister {

  private List<Property> properties;

  public PropertyRegister() {
    properties = new ArrayList<>();
  }

  public void addProperty(Property property) {
    properties.add(property);
  }

  public void printAllProperties() {
    for (Property property : properties) {
      System.out.println(property);
    }
  }


  public void addProperty() {
    Scanner sc = new Scanner(System.in);

    int municipalityCode;
    while (true) {
      try {
        System.out.print("Kommunenummer: ");
        municipalityCode = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    String municipalityName;
    while (true) {
      try {
        System.out.print("Kommunenavn: ");
        municipalityName = sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int lotNumber;
    while (true) {
      try {
        System.out.print("Gårdsnummer: ");
        lotNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int sectionNumber;
    while (true) {
      try {
        System.out.print("Bruksnummer: ");
        sectionNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    String name;
    while (true) {
      try {
        System.out.print("Adresse: ");
        name = sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    double area;
    while (true) {
      try {
        System.out.print("Areal: ");
        area = sc.nextDouble();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    String owner;
    while (true) {
      try {
        System.out.print("Eier: ");
        owner = sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    properties.add(
        new Property(municipalityCode, municipalityName, lotNumber, sectionNumber, name, area,
            owner));
  }

  public void searchProperty() {
    Scanner sc = new Scanner(System.in);
    int municipalityCode;
    while (true) {
      try {
        System.out.print("Kommunenummer: ");
        municipalityCode = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int lotNumber;
    while (true) {
      try {
        System.out.print("Gårdsnummer: ");
        lotNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int sectionNumber;
    while (true) {
      try {
        System.out.print("Bruksnummer: ");
        sectionNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    for (Property property : properties) {
      if (property.getMunicipalityCode() == municipalityCode &&
          property.getLotNumber() == lotNumber &&
          property.getSectionNumber() == sectionNumber) {
        System.out.println(property);
        return;
      }
    }
    System.out.println("Ingen eiendommer funnet");
  }

  public void removeProperty() {
    Scanner sc = new Scanner(System.in);
    int municipalityCode;
    while (true) {
      try {
        System.out.print("Kommunenummer: ");
        municipalityCode = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int lotNumber;
    while (true) {
      try {
        System.out.print("Gårdsnummer: ");
        lotNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    int sectionNumber;
    while (true) {
      try {
        System.out.print("Bruksnummer: ");
        sectionNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }

    for (Property property : properties) {
      if (property.getMunicipalityCode() == municipalityCode &&
          property.getLotNumber() == lotNumber &&
          property.getSectionNumber() == sectionNumber) {
        properties.remove(property);
        return;
      }
    }
    System.out.println("Ingen eiendommer funnet");
  }

  public int numberOfProperties() {
    return properties.size();
  }

  public void searchByLotNumber() {
    Scanner sc = new Scanner(System.in);
    int lotNumber;
    while (true) {
      try {
        System.out.print("Gårdsnummer: ");
        lotNumber = sc.nextInt();
        sc.nextLine();
        break;
      } catch (Exception e) {
        System.out.println("Ugyldig valg");
      }
    }
    for (Property property : properties) {
      if (property.getLotNumber() == lotNumber) {
        System.out.println(property);
      }
    }
  }

  public double averageArea() {
    if (properties.isEmpty()) {
      return 0;
    }
    double totalArea = 0;
    for (Property property : properties) {
      totalArea += property.getArea();
    }
    return totalArea / properties.size();
  }
}