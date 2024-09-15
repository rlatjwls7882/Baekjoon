import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			int N = (Integer.valueOf(br.readLine())-1)%28;
			
			// 2진법으로 나타내기
			String bin="";
			if(N<=14) {
				bin = Integer.toBinaryString(N+1);
			} else {
				bin = Integer.toBinaryString(29-N);
			}
			
			// 이진 딸기 출력
			for(int i=0;i<4-bin.length();i++) {
				bw.write("V");
			}
			for(int i=0;i<bin.length();i++) {
				if(bin.charAt(i)=='0') {
					bw.write("V");
				} else {
					bw.write("딸기");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class