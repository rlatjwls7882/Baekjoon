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
		
		// 두 사람이 낸것
		StringTokenizer st = new StringTokenizer(br.readLine());
		char ML = st.nextToken().charAt(0);
		char MR = st.nextToken().charAt(0);
		char TL = st.nextToken().charAt(0);
		char TR = st.nextToken().charAt(0);
		
		// 무조건 이기는 사람이 있는지 확인
		if(TL==TR&&(ML=='R'&&TL=='S'||ML=='S'&&TL=='P'||ML=='P'&&TL=='R'||MR=='R'&&TL=='S'||MR=='S'&&TL=='P'||MR=='P'&&TL=='R')) {
			bw.write("MS");
		} else if(ML==MR&&(TL=='R'&&ML=='S'||TL=='S'&&ML=='P'||TL=='P'&&ML=='R'||TR=='R'&&ML=='S'||TR=='S'&&ML=='P'||TR=='P'&&ML=='R')) {
			bw.write("TK");
		} else {
			bw.write("?");
		}
		
		bw.close();
	} // end of main()
} // end of Main class