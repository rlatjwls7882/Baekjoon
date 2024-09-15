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
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " \'\"");
			char BorG = st.nextToken().charAt(0);
			int MomInch = Integer.valueOf(st.nextToken())*12+Integer.valueOf(st.nextToken());
			int DadInch = Integer.valueOf(st.nextToken())*12+Integer.valueOf(st.nextToken());
			
			int resInch = MomInch+DadInch;
			if(BorG=='B') {
				resInch+=5;
			} else {
				resInch-=5;
			}
			boolean shrink=false;
			if(resInch%2==1) {
				shrink=true;
			}
			resInch/=2;
			
			int start = resInch-4 + (shrink?1:0);
			int end = resInch+4;
			
			bw.write("Case #"+i+": "+start/12+"\'"+start%12+"\" to "+end/12+"\'"+end%12+"\"\n");
		}
		
		bw.close();
	} // end of main
} // end of Main class