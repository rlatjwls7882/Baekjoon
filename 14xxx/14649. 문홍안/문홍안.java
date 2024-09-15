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
		
		// 금그네의 재산 P, 비서의 수 N
		double P = Double.valueOf(br.readLine());
		int N = Integer.valueOf(br.readLine());
		
		// 돌의 색이 무슨 색인지 확인
		int[] walk = new int[100];
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int pos = Integer.valueOf(st.nextToken())-1;
			
			if(st.nextToken().equals("R")) {
				pos++;
				while(pos<100) {
					walk[pos++]++;
				}
			} else {
				pos--;
				while(pos>=0) {
					walk[pos--]++;
				}
			}
		}
		
		// 물려받을 재산 계산
		int[] percent = new int[3];
		for(int i=0;i<100;i++) {
			percent[walk[i]%3]++;
		}
		
		for(int i=0;i<3;i++) {
			bw.write(String.format("%.02f", P*percent[i]/100));
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class