import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int maxScore=0, num=0;
		
		for(int i=1;i<=5;i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int score = Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken())+Integer.valueOf(st.nextToken());
			
			if(score>maxScore) {
				maxScore=score;
				num = i;
			}
		}
		
		bw.write(num+" "+maxScore);
		bw.close();
	} // end of main
} // end of main class