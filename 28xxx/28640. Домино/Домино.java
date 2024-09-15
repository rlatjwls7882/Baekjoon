import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String domino1 = br.readLine();
		String domino2 = br.readLine();
		
		// 도미노를 결합할 수 있는지 확인
		int left1 = domino1.indexOf("|");
		int right1 = domino1.length()-(left1+1);
		int left2 = domino2.indexOf("|");
		int right2 = domino2.length()-(left2+1);
		
		if(left1==left2||left1==right2||right1==left2||right1==right2) {
			bw.write("Yes");
		} else {
			bw.write("No");
		}
		
		bw.close();
	} // end of main()
} // end of Main class