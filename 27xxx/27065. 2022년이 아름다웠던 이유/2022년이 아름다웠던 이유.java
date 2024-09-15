import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		// n이 과잉수면서 n을 제외한 n의 모든 약수가 과잉수가 아닌 수 찾기
		while(T-->0) {
			int n = Integer.valueOf(br.readLine());
			if(find(n)) {
				bw.write("Good Bye\n");
			} else {
				bw.write("BOJ 2022\n");
			}
		}
		
		bw.close();
	} // end of main()
	
	static boolean find(int n) {
		
		// 약수의 종류와 약수의 합 계산
		ArrayList<Integer> list = new ArrayList<>();
		int sum=1;
		
		for(int i=2;i*i<=n;i++) {
			if(i*i==n) {
				sum += i;
				list.add(i);
			} else if(n%i==0) {
				sum += i+n/i;
				list.add(i);
				list.add(n/i);
			}
		}
		
		// n이 과잉수인지 확인
		if(sum<=n) {
			return false;
		}
		
		// n의 약수가 부족수나 완전수인지 확인
		for(int i=0;i<list.size();i++) {
			sum=1;
			for(int j=2;j*j<=list.get(i);j++) {
				if(j*j==list.get(i)) {
					sum += j;
				} else if(list.get(i)%j==0) {
					sum += j + list.get(i)/j;
				}
			}
			
			if(sum>list.get(i)) {
				return false;
			}
		}
		
		return true;
	} // end of find()
} // end of Main class