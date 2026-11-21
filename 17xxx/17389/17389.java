import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 길이 N의 OX표 입력
		int N = Integer.valueOf(br.readLine());
		String OX = br.readLine();
		
		// 점수 계산
		int bonus=0, score=0;
		for(int i=0;i<N;i++) {
			if(OX.charAt(i)=='O') {
				score += i+1+bonus;
				bonus++;
			}
			else
				bonus=0;
		}
		
		bw.write(score+"");
		
		bw.close();
	} // end of main
} // end of Main class