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
		int C = Integer.valueOf(st.nextToken());
		int E = Integer.valueOf(st.nextToken());
		
		st = new StringTokenizer(bf.readLine());
		int A2 = Integer.valueOf(st.nextToken());
		int C2 = Integer.valueOf(st.nextToken());
		int E2 = Integer.valueOf(st.nextToken());
		
		if(A==A2&&C==C2&&E==E2)
			bw.write("A");
		else if(A2>=A/2.0&&C==C2&&E==E2)
			bw.write("B");
		else if(C==C2&&E==E2)
			bw.write("C");
		else if(C2>=C/2.0&&E==E2)
			bw.write("D");
		else
			bw.write("E");
		
		
		bw.close();
	} // end of main
} // end of main class