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
		int Changyeong=100, Sangdock=100;
		
		while(N--!=0) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			
			if(A>B)
				Sangdock-=A;
			if(B>A)
				Changyeong-=B;
		}
		
		bw.write(Changyeong+"\n"+Sangdock);
		bw.close();
	} // end of main
} // end of main class