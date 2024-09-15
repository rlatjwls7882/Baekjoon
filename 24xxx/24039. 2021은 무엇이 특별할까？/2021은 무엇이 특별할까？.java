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
		
		// 소수 판별
		int length = 103;
		boolean[] notPrime = new boolean[length+1];
		
		for(int i=2;i*i<=length;i++) {
			if(!notPrime[i]) {
				for(int j=i*i;j<=length;j+=i) {
					notPrime[j]=true;
				}
			}
		}
		
		// 소수 목록
		ArrayList<Integer> prime = new ArrayList<>();
		for(int i=2;i<=length;i++) {
			if(!notPrime[i]) {
				prime.add(i);
			}
		}
		
		// N보다 큰 가장 작은 특별한 수 출력
		int N = Integer.valueOf(br.readLine());
		
		for(int i=0;i<prime.size()-1;i++) {
			if(prime.get(i)*prime.get(i+1)>N) {
				bw.write(Integer.toString(prime.get(i)*prime.get(i+1)));
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class