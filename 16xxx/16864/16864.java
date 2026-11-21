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
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int Pt = (int)(Math.round(Double.valueOf(st.nextToken())*100));
		int P1 = (int)(Math.round(Double.valueOf(st.nextToken())*100));
		int P2 = (int)(Math.round(Double.valueOf(st.nextToken())*100));
		
		boolean chk=false;
		for(int i=0;i*P1<=Pt;i++) {
			if((Pt-i*P1)%P2==0) {
				bw.write(i+" "+(Pt-i*P1)/P2+"\n");
				chk=true;
			}
		}
		
		if(!chk) {
			bw.write("none");
		}
		
		bw.close();
	} // end of main()
} // end of Main class