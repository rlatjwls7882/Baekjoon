import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 모든 학생의 점수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] scores = new int[50];
		
		for(int i=0;i<50;i++)
			scores[i] = Integer.valueOf(st.nextToken());
		
		// 홍익이의 학점 계산
		int score = Integer.valueOf(br.readLine());
		
		for(int i=0;i<50;i++)
			if(scores[i]==score) {
				if(i<5) bw.write("A+");
				else if(i<15) bw.write("A0");
				else if(i<30) bw.write("B+");
				else if(i<35) bw.write("B0");
				else if(i<45) bw.write("C+");
				else if(i<48) bw.write("C0");
				else bw.write("F");
			}
		
		bw.close();
	} // end of main
} // end of Main class