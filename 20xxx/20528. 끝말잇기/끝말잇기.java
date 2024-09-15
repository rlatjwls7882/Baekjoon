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
		
		int N = Integer.valueOf(br.readLine());
		
		// 모든 팰린드롬 문자열이 같은지 확인
		StringTokenizer st = new StringTokenizer(br.readLine());
		char firstchar = st.nextToken().charAt(0);
		boolean isSame=true;
		
		while(N-->1) {
			if(firstchar!=st.nextToken().charAt(0)) {
				isSame=false;
				break;
			}
		}
		
		// 모든 문자열을 사용하여 끝말잇기를 할 수 있는지 확인
		bw.write(isSame?"1":"0");
		
		bw.close();
	} // end of main()
} // end of Main class