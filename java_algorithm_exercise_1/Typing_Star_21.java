//https://www.acmicpc.net/problem/10996
import java.util.*;
public class Typing_Star_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; ++i) {//1���� 2���� �� �������� �����ϰ� �� ������ �ݺ��Ѵٰ� �� ��, �� �ݺ� Ƚ��
			
			//--n�� Ȧ���� ��--
			if(n%2!=0) {
				//����
				for(int j=0; j<n/2+1; ++j) {
					System.out.print("* ");
				}
				//�ٹٲ�
				System.out.println();
				//�Ʒ���
				for(int k=0; k<n/2; ++k) {
					System.out.print(" *");
				}
			}
			//--n�� ¦���� ��--
			if(n%2==0) {
				//����
				for(int j=0; j<n/2;++j) {
					System.out.print("* ");
				}
				//�ٹٲ�
				System.out.println();
				//�Ʒ���
				for(int j=0; j<n/2;++j) {
					System.out.print(" *");
				}
			}
			System.out.println();
		}	
	}
}
