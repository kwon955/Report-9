import java.util.*;

public class Grades {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> grade = new ArrayList<Character>(); //ArrayList<Character>���
		double sum=0;
		int count=0;
		double score[]=new double[6];
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");	//���� �Է��ϱ�
		while(count != 6)
		{
			String st = scanner.next();
			char c = st.charAt(0);
			if((c>='A'&&c<='D') || c=='F')	
			{
				grade.add(c); count++;	
				}
			else continue;
			}
		for(int i=0; i<grade.size(); i++)		// ������ ������ ��ȯ
		{
			if(grade.get(i)=='A') {
				score[i]=4.0;
			}
			else if(grade.get(i) =='B') {
				score[i]=3.0;
			}
			else if(grade.get(i) =='C') {
				score[i]=2.0;
			}
			else if(grade.get(i) =='D') {
				score[i]=1.0;
			}
			else if(grade.get(i)=='F') {
				score[i]=0.0;
			}
			sum += score[i];
			}
		System.out.print(sum/grade.size());	//��ձ��ϱ� �� ���
		scanner.close();
		}
	}


