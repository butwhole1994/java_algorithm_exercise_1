//https://www.acmicpc.net/problem/2523
import java.util.*;
public class Typing_Star_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		for(int j=1; j<=n; ++j) {
			for(int t=0; t<j; ++t) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<n; ++i) {
			for(int j=i; j<n; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
