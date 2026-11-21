import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 에라토스테네스의 체로 소수 판별
		boolean[] notSosu = new boolean[10000];
		notSosu[0]=notSosu[1]=true;
		
		for(int i=2;i<10000;i++) {
			if(!notSosu[i]) {
				for(int j=i*i;j<10000;j+=i) {
					notSosu[j]=true;
				}
			}
		}
		
		// 골드바흐 파티션 계산
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			int idx=1;
			for(int i=2;i<=N/2;i++) {
				if(!notSosu[i]&&!notSosu[N-i]) {
					idx=i;
				}
			}
			
			bw.write(String.format("%d %d\n", idx, N-idx));
		}

		bw.close();
	} // end of main()
} // end of Main class