import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		// 1등을 하는 참가자의 번호 확인
		int idx=1, maxS=0, maxC=50, maxL=179; 
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int S = Integer.valueOf(st.nextToken());
			int C = Integer.valueOf(st.nextToken());
			int L = Integer.valueOf(st.nextToken());
			
			if(S>maxS||S==maxS&&C<maxC||S==maxS&&C==maxC&&L<maxL) {
				maxS=S;
				maxC=C;
				maxL=L;
				idx=i;
			}
		}
		
		bw.write(idx+"");
		
		bw.close();
	} // end of main()
} // end of Main class