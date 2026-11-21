import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 각 조각의 버섯의 양
		int[] mushroom = new int[8];
		for(int i=0;i<8;i++) {
			mushroom[i] = Integer.valueOf(br.readLine());
		}
		
		// 최대 버섯의 양 계산
		int max=0;
		for(int i=0;i<8;i++) {
			max = Math.max(max, mushroom[i]+mushroom[(i+1)%8]+mushroom[(i+2)%8]+mushroom[(i+3)%8]);
		}
		bw.write(Integer.toString(max));
		
		bw.close();
	} // end of main()
} // end of Main class