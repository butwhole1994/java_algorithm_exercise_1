//https://www.acmicpc.net/problem/10039
import java.io.*;

public class average_point {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int sum = 0;
		
		for(int i=0; i<5; ++i) {
			int a = Integer.parseInt(br.readLine());
			if(a<40) {
				a=40;
			}
			sum += a;
			int point = (sum/5);
			
			bw.write(String.valueOf(point));
			//bw.write(point)�� �ƽ�Ű�ڵ带 ����ؼ� �ȉ��.
			//��Ʈ������ �ٲ��ִϱ� ok����.
			bw.flush();
		}
		
	}
}
