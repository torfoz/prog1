public class Property {
  private int municipalityCode;
  private String municipalityName;
  private int lotNumber;
  private int sectionNumber;
  private String name;
  private double area;
  private String owner;

  public Property(int municipalityCode, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String owner) {
    this.municipalityCode = municipalityCode;
    this.municipalityName = municipalityName;
    this.lotNumber = lotNumber;
    this.sectionNumber = sectionNumber;
    this.name = name;
    this.area = area;
    this.owner = owner;
  }

  public int getMunicipalityCode() {
    return municipalityCode;
  }

  public String getMunicipalityName() {
    return municipalityName;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public int getSectionNumber() {
    return sectionNumber;
  }

  public String getName() {
    return name;
  }

  public double getArea() {
    return area;
  }

  public String getOwner() {
    return owner;
  }

  public String toString() {
    return municipalityCode + "-" + lotNumber + "/" + sectionNumber;
  }

}
