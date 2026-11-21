import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			
			// 총 득표수, 최다 득표수, 최다 득표자 확인
			int sum=0, max=0, winner=0;
			for(int i=1;i<=N;i++) {
				int vote = Integer.valueOf(br.readLine());
				
				if(vote>max) {
					max = vote;
					winner = i;
				} else if(vote==max) {
					winner = -1;
				}
				sum += vote;
			}
			
			// 출력
			if(winner==-1) {
				bw.write("no winner\n");
			} else if(max*2>sum) {
				bw.write(String.format("majority winner %d\n", winner));
			} else {
				bw.write(String.format("minority winner %d\n", winner));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class