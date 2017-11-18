public class Location {			// Location 클래스 생성
   private String name;
   private String lati;
   private String longi;
   
   public Location(String name, String lati, String longi) {	//초기화 하기
      this.name = name;
      this.lati = lati;
      this.longi = longi;
   }
   public void setName(String name) {	// setName() 생성하기
      this.name = name;
   }
   public String getName() {	//getName() 생성하기
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