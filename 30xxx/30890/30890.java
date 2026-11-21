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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double X = Double.valueOf(st.nextToken());
		double Y = Double.valueOf(st.nextToken());
		
		// 드럼을 연주해야 하는 순서 출력
		double left=1, right=1;
		
		while(left<=X||right<=Y) {
			if(left<=X&&right<=Y&&left/X==right/Y) {
				bw.write("3");
				left++;
				right++;
			} else if(right>Y||left<=X&&left/X<right/Y) {
				bw.write("1");
				left++;
			} else if(left>X||right<=Y&&left/X>right/Y) {
				bw.write("2");
				right++;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class