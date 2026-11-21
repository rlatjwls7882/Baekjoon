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
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			int totalY=0,totalK=0;
			
			for(int i=0;i<9;i++) {	
				StringTokenizer st = new StringTokenizer(bf.readLine());
				totalY += Integer.valueOf(st.nextToken());
				totalK += Integer.valueOf(st.nextToken());
			} // end of for i
			
			if(totalY>totalK)
				bw.write("Yonsei\n");
			else if(totalK>totalY)
				bw.write("Korea\n");
			else
				bw.write("Draw\n");
		} // end of while T
		
		bw.close();
	} // end of main
} // end of main class