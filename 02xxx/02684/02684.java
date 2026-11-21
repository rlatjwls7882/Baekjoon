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
			String string = br.readLine().replace('T', '0').replace('H', '1');
			
			// 3-동전수열이 몇 번 나타났는지 계산
			int[] arr = new int[8];
			for(int i=0;i<38;i++) {
				arr[Integer.valueOf(string.substring(i, i+3), 2)]++;
			}
			
			for(int i=0;i<8;i++) {
				bw.write(Integer.toString(arr[i]));
				bw.write(' ');
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class