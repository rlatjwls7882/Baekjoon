import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			
			// 팀의 수 N
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			// 첫번째 단계에서의 각 팀의 상대적인 등수 입력
			int[] team = new int[N];
			for(int i=0;i<N;i++) {
				team[i] = Integer.valueOf(br.readLine());
			}
			
			// 두번째 단계에서의 각 팀의 상대적인 등수 출력
			for(int i=N-1;i>=0;i--) {
				bw.write(Integer.toString(team[i]));
				bw.newLine();
			}
			bw.write("0\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class