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
		while(T-->0) {
			int N = Integer.valueOf(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String[] strings = new String[N];
			int pos=-1;
			for(int i=0;i<N;i++) {
				strings[i] = st.nextToken();
				if(strings[i].charAt(0)!='#') {
					pos=i;
				}
			}
			
			for(int i=pos+1;i<N;i++) {
				bw.write(strings[i]+" ");
			}
			
			if(pos!=-1) {
				bw.write(strings[pos]+" ");
				for(int i=0;i<pos;i++) {
					bw.write(strings[i]+" ");
				}
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class