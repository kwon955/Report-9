public class Location {			// Location Ŭ���� ����
   private String name;
   private String lati;
   private String longi;
   
   public Location(String name, String lati, String longi) {	//�ʱ�ȭ �ϱ�
      this.name = name;
      this.lati = lati;
      this.longi = longi;
   }
   public void setName(String name) {	// setName() �����ϱ�
      this.name = name;
   }
   public String getName() {	//getName() �����ϱ�
      return name;
   }
   public void setLati(String lati) {
      this.lati = lati;
   }
   public String getLati() {
      return lati;
   }
   public void setLongi(String longi) {
      this.longi = longi;
   }
   public String getLongi() {
      return longi;
   }
}