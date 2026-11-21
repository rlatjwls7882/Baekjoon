import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		while(true) {
			int R = Integer.valueOf(br.readLine());
			if(R==0) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] M = new int[R];
			int Midx=11, Mscore=0;
			for(int i=0;i<R;i++) {
				M[i] = Integer.valueOf(st.nextToken());
				Mscore += M[i];
				if(Midx==11&&i>=2&&M[i]==M[i-1]&&M[i-1]==M[i-2]) {
					Midx=i;
				}
			}
			
			st = new StringTokenizer(br.readLine());
			int[] L = new int[R];
			int Lidx=11, Lscore=0;
			for(int i=0;i<R;i++) {
				L[i] = Integer.valueOf(st.nextToken());
				Lscore += L[i];
				if(Lidx==11&&i>=2&&L[i]==L[i-1]&&L[i-1]==L[i-2]) {
					Lidx=i;
				}
			}
			
			if(Midx<Lidx) {
				Mscore+=30;
			} else if(Lidx<Midx) {
				Lscore+=30;
			}
			
			if(Mscore>Lscore) {
				bw.write("M\n");
			} else if(Mscore==Lscore) {
				bw.write("T\n");
			} else {
				bw.write("L\n");
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class