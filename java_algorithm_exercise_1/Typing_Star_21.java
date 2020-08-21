//https://www.acmicpc.net/problem/10996
import java.util.*;
public class Typing_Star_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; ++i) {//1¿­¿Í 2¿­À» ÇÑ ¹­À½À¸·Î »ý°¢ÇÏ°í ÀÌ ¹­À½À» ¹Ýº¹ÇÑ´Ù°í ÇÒ ¶§, ÃÑ ¹Ýº¹ È½¼ö
			
			//--nÀÌ È¦¼öÀÏ ¶§--
			if(n%2!=0) {
				//À­ÁÙ
				for(int j=0; j<n/2+1; ++j) {
					System.out.print("* ");
				}
				//ÁÙ¹Ù²Þ
				System.out.println();
				//¾Æ·§ÁÙ
				for(int k=0; k<n/2; ++k) {
					System.out.print(" *");
				}
			}
			//--nÀÌ Â¦¼öÀÏ ¶§--
			if(n%2==0) {
				//À­ÁÙ
				for(int j=0; j<n/2;++j) {
					System.out.print("* ");
				}
				//ÁÙ¹Ù²Þ
				System.out.println();
				//¾Æ·§ÁÙ
				for(int j=0; j<n/2;++j) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}	
	}
}
