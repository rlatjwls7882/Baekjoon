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
		StringTokenizer st;
		
		int T = Integer.valueOf(bf.readLine());
		
		while(T--!=0) {
			st = new StringTokenizer(bf.readLine());
			
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			
			for(int i=0;i<y;i++) {
				
				for(int j=0;j<x;j++)
					bw.write("X");
				
				bw.write("\n");
			} //end of for i
			
			bw.write("\n");
			
		} //end of while T
		
		bw.close();
	} // end of main
} // end of main class