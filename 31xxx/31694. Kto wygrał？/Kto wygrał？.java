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
		int[] A = new int[11];
		int Ascore=0;
		for(int i=0;i<18;i++) {
			int score = Integer.valueOf(st.nextToken());
			A[score]++;
			Ascore += score;
		}
		
		st = new StringTokenizer(br.readLine());
		int[] B = new int[11];
		int Bscore=0;
		for(int i=0;i<18;i++) {
			int score = Integer.valueOf(st.nextToken());
			B[score]++;
			Bscore += score;
		}
		
		String winner = "Algosia";
		if(Ascore<Bscore) {
			winner="Bajtek";
		} else if(Ascore==Bscore) {
			boolean chk=true;
			for(int i=10;i>=0;i--) {
				if(A[i]!=B[i]) {
					chk=false;
					if(B[i]>A[i]) {
						winner="Bajtek";
					}
					break;
				}
			}
			if(chk) {
				winner="remis";
			}
		}
		bw.write(winner);
		
		bw.close();
	} // end of main()
} // end of Main class