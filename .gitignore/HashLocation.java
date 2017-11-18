import java.util.*;

public class HashLocation {
   private Scanner scanner = new Scanner(System.in);
   private HashMap<String, Location> dept = new HashMap<String, Location>();
   
   private void read() {
      System.out.println("도시, 경도, 위도를 입력하세요."); // 도시, 경도, 위도 입력하기
      for(int i=0; i<4; i++) {
         System.out.print(">> ");
         String text = scanner.nextLine();
         StringTokenizer st = new StringTokenizer(text, ",");
         String name = st.nextToken().trim();
         String lati = st.nextToken().trim();
         String longi = st.nextToken().trim();
         
         Location location = new Location(name, lati, longi);
         dept.put(name, location); //해시맵에 저장
      }
      System.out.println("---------------------------");
   }
   
   private void printAll() {
      Set<String> key = dept.keySet();
      Iterator<String> it = key.iterator();
      while (it.hasNext()) {
         String name = it.next(); // 이름 알아냄
         Location location = dept.get(name); // 이름을 키로하여 해시맵으로 Location 객체 얻어냄
         System.out.println(location.getName() + " " + location.getLati() + " " + location.getLongi());
      }
      System.out.println("---------------------------");
   }
   
   private void processQuery() {
      while(true) {
         System.out.print("도시 이름 >> ");
         String name = scanner.nextLine(); // 학생 이름 입력
         if(name.equals("그만"))
            return; // 종료
         
         Location location = dept.get(name); // 해시맵에서 이름을 키로 검색
         if(location == null) { // 이름이 해시맵에 없다면
            System.out.println(name + "는 없습니다.");
         }
         else { // 해시맵에서 검색된  Student 객체
            System.out.print(location.getName() + " ");
            System.out.print(location.getLati() + " ");
            System.out.println(location.getLongi() + " ");
         }
      }
   }
   
   public void run() {		// 실행하기
      read();
      printAll();
      processQuery();
   }
   
   public static void main(String[] args) {
      HashLocation l = new HashLocation();
      l.run();
   }
}