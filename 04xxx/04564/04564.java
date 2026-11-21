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
			
			int N = Integer.valueOf(br.readLine());
			
			if(N==0) {
				break;
			}
			
			// 숫자 카드놀이가 끝나기 전까지 나온 수 출력
			bw.write(Integer.toString(N));
			
			while(N/10!=0) {
				int next=1;
				
				while(N!=0) {
					next *= N%10;
					N/=10;
				}
				
				N=next;
				bw.write(' ');
				bw.write(Integer.toString(next));
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class