import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 상근, 창영, 현진이가 생각하는 정답패턴
		String Sang="ABC";
		String Chang="BABC";
		String Hyeon="CCAABB";
		
		// N개의 문제의 정답 입력
		int N = Integer.valueOf(br.readLine());
		String answer = br.readLine();
		
		// 가장 많은 문제를 맞힌 사람 확인
		int S=0, C=0, H=0;
		for(int i=0;i<N;i++) {
			if(answer.charAt(i)==Sang.charAt(i%3)) S++;
			if(answer.charAt(i)==Chang.charAt(i%4)) C++;
			if(answer.charAt(i)==Hyeon.charAt(i%6)) H++;
		}
		
		int max = Math.max(S, Math.max(C, H));
		bw.write(max+"");
		
		if(max==S) bw.write("\nAdrian");
		if(max==C) bw.write("\nBruno");
		if(max==H) bw.write("\nGoran");
		
		bw.close();
	} // end of main
} // end of Main class