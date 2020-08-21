//https://www.acmicpc.net/problem/10817
import java.util.*;

public class second_biggest_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		
		for(int i=0; i<3; ++i) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);//배열의 오름차순 정렬
		//내림차순 정렬은 어떻게 하는걸까...?
		sc.close();
		System.out.println(n[n.length-2]);//아무든 젤 뒤에서 두번째가 나오면 된다.
		
		//그냥 n[1]을 출력해도 문제가 없을테지만,
		//이건 두번째로 큰 수가 아니라 3개 중에 중간에 있는 녀석을 가져오는 것이기 때문에 본질적으로 틀렸다고 난 판단했다.

	}

}
