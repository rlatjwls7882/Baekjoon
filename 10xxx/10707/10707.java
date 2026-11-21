import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.valueOf(bf.readLine());
		int B = Integer.valueOf(bf.readLine());
		int C = Integer.valueOf(bf.readLine());
		int D = Integer.valueOf(bf.readLine());
		int P = Integer.valueOf(bf.readLine());
		int caseX=0, caseY=0;
		
		caseX=P*A;
		caseY=B;
		
		if(C<P)
			caseY+=(P-C)*D;
		
		if(caseX<caseY)
			bw.write(caseX+"");
		else
			bw.write(caseY+"");
		
		bw.close();
	} // end of main
} // end of main class