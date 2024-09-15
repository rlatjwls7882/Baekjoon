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
		
		while(true) {
			try {
				StringTokenizer st = new StringTokenizer(br.readLine());
				double N = Double.valueOf(st.nextToken());
				double B = Double.valueOf(st.nextToken());
				double M = Double.valueOf(st.nextToken());
				
				// M원을 넘게 만들기 위해 필요한 년 수 계산
				int year=0;
				while(N<=M) {
					N *= (100+B)/100;
					year++;
				}
				
				bw.write(Integer.toString(year));
				bw.newLine();
				
			} catch (Exception e) {
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class