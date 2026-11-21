import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		int HH = Integer.valueOf(st.nextToken());
		int MM = Integer.valueOf(st.nextToken());
		int N = Integer.valueOf(br.readLine());
		
		// N번째 소리가 울려퍼지는 시간 계산
		while(true) {
			if(MM==0) {
				N -= HH;
			} else if(MM%15==0) {
				N -= 1;
			}
			
			if(N<=0) {
				bw.write(String.format("%02d:%02d", HH, MM));
				break;
			}
			
			MM++;
			if(MM==60) {
				MM=0;
				HH++;
				if(HH==13) {
					HH=1;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class