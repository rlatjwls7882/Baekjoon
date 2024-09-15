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
		int N = Integer.valueOf(st.nextToken());
		char B = st.nextToken().charAt(0);
		
		int score=0;
		for(int i=0;i<4*N;i++) {
			String card = br.readLine();
			
			if(card.charAt(0)=='A') {
				score+=11;
			} else if(card.charAt(0)=='K') {
				score+=4;
			} else if(card.charAt(0)=='Q') {
				score+=3;
			} else if(card.charAt(1)==B) {
				if(card.charAt(0)=='J') {
					score+=20;
				} else if(card.charAt(0)=='T') {
					score+=10;
				} else if(card.charAt(0)=='9') {
					score+=14;
				}
			} else {
				if(card.charAt(0)=='J') {
					score+=2;
				} else if(card.charAt(0)=='T') {
					score+=10;
				}
			}
		}
		bw.write(Integer.toString(score));
		
		bw.close();
	} // end of main()
} // end of Main class