//https://www.acmicpc.net/problem/10817
import java.util.*;

public class second_biggest_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		
		for(int i=0; i<3; ++i) {
			n[i] = sc.nextInt();
		}
		Arrays.sort(n);//�迭�� �������� ����
		//�������� ������ ��� �ϴ°ɱ�...?
		sc.close();
		System.out.println(n[n.length-2]);//�ƹ��� �� �ڿ��� �ι�°�� ������ �ȴ�.
		
		//�׳� n[1]�� ����ص� ������ ����������,
		//�̰� �ι�°�� ū ���� �ƴ϶� 3�� �߿� �߰��� �ִ� �༮�� �������� ���̱� ������ ���������� Ʋ�ȴٰ� �� �Ǵ��ߴ�.

	}

}
