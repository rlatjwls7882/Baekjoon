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
		int ball = 1;
		
		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			if(ball==A)
				ball=B;
			else if(ball==B)
				ball=A;
		}
		
		if(!(ball==1||ball==2||ball==3))
			bw.write("-1");
		else
			bw.write(ball+"");
		
		bw.close();
	} // end of main
} // end of main class