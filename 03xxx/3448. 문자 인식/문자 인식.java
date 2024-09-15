import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		
		while(n-->0) {
			
			// 인식한 문자의 수 R, 전체 문자의 수 A
			int R=0, A=0;
			while(true) {
				String string = br.readLine();
				if(string.equals("")) {
					break;
				}
				
				for(int i=0;i<string.length();i++) {
					if(string.charAt(i)!='#') {
						R++;
					}
					A++;
				}
			}
			
			// 인식률 계산
			double rate = Double.valueOf(String.format("%.1f", R*100./A));
			
			if(rate==(int)rate) {
				bw.write(String.format("Efficiency ratio is %d%%.\n", (int)rate));
			} else {
				bw.write(String.format("Efficiency ratio is %.1f%%.\n", rate));
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class