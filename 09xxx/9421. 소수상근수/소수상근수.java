import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// n까지의 소수 계산
		int n = Integer.valueOf(br.readLine());
		boolean[] notSosu = new boolean[n+1];
		
		for(int i=2;i*i<=n;i++) {
			if(!notSosu[i]) {
				for(int j=i*i;j<=n;j+=i) {
					notSosu[j]=true;
				}
			}
		}
		
		// 소수상근수를 오름차순으로 출력
		for(int i=2;i<=n;i++) {
			if(!notSosu[i]) {
				int tmp=i;
				
				while(true) {
					int nextVal=0;
					while(tmp!=0) {
						nextVal += (tmp%10)*(tmp%10);
						tmp/=10;
					}
					tmp = nextVal;
					
					if(tmp==1) { // 상근수 발견
						bw.write(Integer.toString(i));
						bw.newLine();
						break;
					} else if(tmp==4) { // 무한루프
						break;
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class