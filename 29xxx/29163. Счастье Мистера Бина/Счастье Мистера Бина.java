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
		
		int n = Integer.valueOf(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int ishappy=0;
		
		while(n--!=0) {
			int A = Integer.valueOf(st.nextToken());
			
			if(A%2==0)
				ishappy++;
			else
				ishappy--;
		}
		
		if(ishappy>0)
			bw.write("Happy");
		else
			bw.write("Sad");
		
		bw.close();
		
	} // end of main
} // end of main class