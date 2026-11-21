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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		int n = Integer.valueOf(bf.readLine());
		
		while(n--!=0) {
			int c = Integer.valueOf(bf.readLine());
			
			bw.write(c+" ");
			
			if(c<1000)
				bw.write(c*A+"\n");
			else
				bw.write(1000*A+(c-1000)*B+"\n");
		}
		
		bw.close();
	} // end of main
} // end of main class