import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static ArrayList<Integer> sosu;
	static boolean[] notSosu;
	
	public static void main(String[] args) throws IOException {
		
		// 에라토스테네스의 체로 소수 판별
		notSosu = new boolean[1_000_001];
		for(int i=2;i*i<=1_000_000;i++) {
			if(!notSosu[i]) {
				for(int j=i*i;j<=1_000_000;j+=i) {
					notSosu[j]=true;
				}
			}
		}
		
		// 백만 이하의 홀수인 소수 확인
		sosu = new ArrayList<>();
		for(int i=3;i<=1_000_000;i++) {
			if(!notSosu[i]) {
				sosu.add(i);
			}
		}
		
		while(true) {
			int n = Integer.valueOf(br.readLine());
			if(n==0) {
				break;
			}
			
			// n=a+b로 나타낼 수 있는지 확인
			int a = conjecture(n);
			
			if(a==-1) {
				bw.write("Goldbach's conjecture is wrong.\n");
			} else {
				bw.write(String.format("%d = %d + %d\n", n, a, n-a));
			}
		}
		
		bw.close();
	} // end of main()
	
	static int conjecture(int n) {
		
		for(int i=0;;i++) {
			if(sosu.get(i)>=n) {
				return -1;
			} else if(!notSosu[n-sosu.get(i)]) {
				return sosu.get(i);
			}
		}
		
	} // end of conjecture()
} // end of Main class