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
		int lv = Integer.valueOf(st.nextToken());
		String string = st.nextToken();
		
		// 가희가 획득한 점수 출력
		if(string.equals("miss")) {
			bw.write("0");
		} else if(string.equals("bad")) {
			bw.write(Integer.toString(lv*200));
		} else if(string.equals("cool")) {
			bw.write(Integer.toString(lv*400));
		} else if(string.equals("great")) {
			bw.write(Integer.toString(lv*600));
		} else {
			bw.write(Integer.toString(lv*1000));
		}
		
		bw.close();
	} // end of main()
} // end of Main class