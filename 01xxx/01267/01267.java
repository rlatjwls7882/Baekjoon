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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int Yprice=0, Mprice=0;
		
		while(T--!=0) {
			int Y;
			int M = Y = Integer.valueOf(st.nextToken());
			
			while(Y>=0) {
				Y-=30;
				Yprice+=10;
			}
			while(M>=0) {
				M-=60;
				Mprice+=15;
			}
		} // end of while T
		
		if(Yprice<Mprice)
			bw.write("Y "+Yprice);
		else if(Mprice<Yprice)
			bw.write("M "+Mprice);
		else
			bw.write("Y M "+Yprice);
		
		bw.close();
	} // end of main
} // end of main class