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

		int N = Integer.valueOf(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int score=0, plusSco=1;
		
		while(N--!=0) {
			int iscorrect = Integer.valueOf(st.nextToken());
			
			if(iscorrect==1)
				score+=plusSco++;
			
			else
				plusSco=1;
		}
		
		bw.write(score+"");
		bw.close();
	} // end of main
} // end of main class