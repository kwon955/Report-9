import java.util.*;
public class Rain {
   public static void main(String[] args) {
      Vector<Integer> v = new Vector<Integer>();
      Scanner scanner = new Scanner(System.in); 
      while(true) {
         System.out.print("������ �Է� (0 �Է½� ����) >> ");
         int rain = scanner.nextInt();
		v.add(rain); 
         if(rain == 0) {
            break;}
      Iterator<Integer> it = v.iterator();
      while(it.hasNext()) {
         int n = it.next();
         System.out.print(n + " ");
      }
      int sum = 0;
      it = v.iterator();
      while(it.hasNext()) {
         int n = it.next();
         sum += n;
      }
      int len = v.size();
         int avg = sum/len;
         System.out.println(" \n���� ��� " + avg);
      }
      scanner.close();
   }
}