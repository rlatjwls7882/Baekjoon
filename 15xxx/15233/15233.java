import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// A팀과 B팀의 선수의 수, 총 득점 수 G
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int G = Integer.valueOf(st.nextToken());
		
		// A팀의 선수 목록
		HashSet<String> TeamA = new HashSet<String>();
		st = new StringTokenizer(br.readLine());
		while(A-->0)
			TeamA.add(st.nextToken());

		// B팀의 선수 목록
		br.readLine();
		
		// 어느팀이 이겼는지 확인
		st = new StringTokenizer(br.readLine());
		int scoreA=0, scoreB=0;
		
		while(G-->0) {
			if(TeamA.contains(st.nextToken()))
				scoreA++;
			else
				scoreB++;
		}
		
		if(scoreA>scoreB) bw.write("A");
		else if(scoreA<scoreB) bw.write("B");
		else bw.write("TIE");

		bw.close();
	} // end of main
} // end of Main class