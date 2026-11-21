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

		// N까지의 소수 판별
		int N = Integer.valueOf(br.readLine());
		boolean[] notPrime = new boolean[N+1];
		
		for(int i=2;i*i<=N;i++) {
			if(!notPrime[i]) {
				for(int j=i*i;j<=N;j+=i) {
					notPrime[j]=true;
				}
			}
		}
		
		// 소수의 누적합 계산
		ArrayList<Integer> PrimeNum = new ArrayList<>();
		PrimeNum.add(0);
		
		for(int i=2;i<=N;i++) {
			if(!notPrime[i]) {
				PrimeNum.add(i+PrimeNum.get(PrimeNum.size()-1));
			}
		}
		
		// N을 연속된 소수의 합으로 나타내는 경우의 수 계산
		int cnt=0, left=0, right=1;
		while(right<PrimeNum.size()) {
			int sum = PrimeNum.get(right)-PrimeNum.get(left);
			if(sum<=N) {
				if(sum==N) {
					cnt++;
				}
				right++;
			} else {
				left++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class