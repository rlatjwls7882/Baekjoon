import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());
		
		while(N-->0) {
			String string = br.readLine();
			
			// 인생 점수 계산
			int score=0;
			for(int i=0;i<string.length();i++)
				if(string.charAt(i)>=65)
					score += string.charAt(i)-64;
			
			bw.write(score==100?"PERFECT LIFE\n":score+"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class