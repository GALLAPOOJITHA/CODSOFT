package firstclass;
import java.util.*;

public class task2 {

	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner ui=new Scanner(System.in);
		System.out.println("Enter the values");
		m1=ui.nextInt();
		m2=ui.nextInt();
		m3=ui.nextInt();
		int total=m1+m2+m3;
		float Avg=(m1+m2+m3)/3;
		System.out.println(total);
		System.out.println(Avg);
		if (Avg>=85) {
			System.out.println("Grade A");
		}
		else if (Avg<=70 && Avg>=60) {
			System.out.println("Grade B");
		}
		else if (Avg<=50 && Avg>=40) {
			System.out.println("Grade C");
		}
		else if (Avg<=40 && Avg>=30) {
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Grade E");
		}
		

	}

}
