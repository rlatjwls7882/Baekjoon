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
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int r = Integer.valueOf(st.nextToken());
			int e = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			
			if(r<e-c)
				bw.write("advertise\n");
			else if(r==e-c)
				bw.write("does not matter\n");
			else
				bw.write("do not advertise\n");
		} // end of while N
		
		bw.close();
	} // end of main
} // end of main class