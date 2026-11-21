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
		int C = Integer.valueOf(st.nextToken());
		int D = Integer.valueOf(st.nextToken());
		int max = 0;
		
		if(Math.min(A, B)*Math.min(C, D)>max)
			max=Math.min(A, B)*Math.min(C, D);

		if(Math.min(A, C)*Math.min(B, D)>max)
			max=Math.min(A, C)*Math.min(B, D);

		if(Math.min(A, D)*Math.min(B, C)>max)
			max=Math.min(A, D)*Math.min(B, C);
		
		bw.write(max+"");
		bw.close();
	} // end of main
} // end of main class