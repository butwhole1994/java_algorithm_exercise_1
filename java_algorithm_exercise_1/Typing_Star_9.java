//https://www.acmicpc.net/problem/2446
import java.util.*;
public class Typing_Star_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 2*n-1;//1줄에 들어가는 (숫자+문자)의 갯수
		int b = 0;//별이 늘어나는 반복에서 공백이 나온 횟수 셀거임.
		
		//----별의 갯수가 줄어드는 반복.----
		for(int i=0; i<n; ++i) {//줄마다 별찍기 반복회수
			int t; //별찍기에서도 t를 사용해야 하므로 전역변수로 둔다.
			for(t=0; t<i; ++t ) {//앞공백 찍기 0개에서 1개씩 늘어나는 패턴.
				System.out.print(" ");
			}
			for(int j=0; j<a-(t*2); ++j) {
				//한 줄에 들어가는 공간 중, 공백이 차지하는 공간을 빼고 남은 갯수만큼 별찍기
				//t대신i를 사용할 수도 있었지만, 직관성을 위해서 t를 사용한다.
				System.out.print("*");
			}
				System.out.println();
		} //별 뒤의 공백은 어차피 빈칸이기 때문에 굳이 만들어줄 필요가 없음.
		
		
		
		//----별의 갯수가 늘어나는 반복----
		for(int i=1; i<=n-1; ++i) {//줄마다 별찍기 반복회수
			int t;
			for(t=i; t<=(a-3)/2; ++t) {//앞공백 찍기. (a-3)/2에서 1개씩 줄어드는 패턴.
				System.out.print(" ");
				++b;
			//줄어들때는 무조건 별이 3개 찍혀있기 때문에 비어있는 칸은 a-3이 된다.
			//그렇다면 앞칸의 공백은 (a-3)/2가 된다.
			}
			for(int j=0; j<a-(b*2);++j) { //칸의 개수(a)-공백의 갯수(t*2)
				System.out.print("*");
			}
			b=0;//공백횟수 초기화
			if(i!=n-1) {//마지막 반복때는 줄바꿈 할 필요가 없음
				System.out.println();
			}
			//별 뒤의 공백은 어차피 빈칸이기 때문에 굳이 만들어줄 필요가 없음.
			
		}

	}

}
