import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 셀프 넘버가 아닌 수 확인
		int N = 10000;
		boolean[] Notselfnum = new boolean[N+1];
		
		for(int i=1;i<=N;i++)
			if(!Notselfnum[i]) {
				int sum=i;
				
				while(sum<=N) {
					int tmp=sum;
					
					while(tmp!=0) {
						sum += tmp%10;
						tmp/=10;
					}
					
					if(sum<=N)
						Notselfnum[sum]=true;
				}
			}
		
		// 셀프 넘버 출력
		for(int i=1;i<=N;i++)
			if(!Notselfnum[i])
				bw.write(i+"\n");
		
		bw.close();
	} // end of main
} // end of Main class