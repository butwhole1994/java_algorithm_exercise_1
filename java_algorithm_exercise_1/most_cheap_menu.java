//https://www.acmicpc.net/problem/5543
import java.util.*;
public class most_cheap_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cb = 2001;
		int cd = 2001;
		
		for(int i=0; i<3; ++i) {
			int burger = sc.nextInt();
			if(burger<cb) {
				cb=burger;
			}
		}
		for(int i=0; i<2; ++i) {
			int drink = sc.nextInt();
			if(drink<cd) {
				cd=drink;
			}
		}
		System.out.println(cb+cd-50);

	}

}
