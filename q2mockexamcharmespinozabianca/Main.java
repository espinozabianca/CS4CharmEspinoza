class Main {
  public static void main(String[] args) {
    Stadium s1 = new Stadium("SHB 304", "Pisay", 50);
    Theater t1 = new Theater("SM", "QC", 80, 8);
    IndieBand i1 = new IndieBand("SOS",100, "Manila");
    i1.reserve(t1);
    i1.perform();
    System.out.println(i1.popularity);
  }
}