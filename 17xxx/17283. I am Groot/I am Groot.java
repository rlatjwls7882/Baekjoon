import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 중심 줄기의 길이 L, 비율 R
		int L = Integer.valueOf(br.readLine());
		int R = Integer.valueOf(br.readLine());
		
		// 중심 줄기를 제외한 나뭇가지의 총 길이 계산
		int sum=0, stickNum=2;
		
		while(true) {
			L = L*R/100;
			
			if(L<=5) {
				break;
			}
			
			sum += L*stickNum;
			stickNum*=2;
		}
		
		bw.write(Integer.toString(sum));
		
		bw.close();
	} // end of main()
} // end of Main class