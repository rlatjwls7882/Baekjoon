import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		// 1 : 1
		// 2 : 5+1
		// 3 : 13+5+1
		// 4 : 25(13+4*3)+13+5+1
		
		int n = Integer.valueOf(br.readLine());
		
		// n개로 만들 수 있는 가장 높은 안정적인 피라미드의 높이 계산
		int h=1;
		while(true) {
			n -= 4*h*(h-1)/2+1;
			
			if(n==0) {
				bw.write(Integer.toString(h));
				break;
			} else if(n<0) {
				bw.write(Integer.toString(h-1));
				break;
			}
			h++;
		}
		
		bw.close();
	} // end of main()
} // end of Main class