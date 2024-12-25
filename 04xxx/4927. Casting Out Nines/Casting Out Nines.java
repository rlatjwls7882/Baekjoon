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
		for(int t=1;;t++) {
			String string = br.readLine();
			if(string.compareTo(".")==0) break;
			
			StringTokenizer st = new StringTokenizer(string, "+*=.");
			int[] cnt = new int[3];
			for(int i=0;i<3;i++) {
				String tmp = st.nextToken();
				for(int j=0;j<tmp.length();j++) {
					cnt[i] += tmp.charAt(j)-'0';
				}
			}
			
			if(string.indexOf("+")!=-1 && (cnt[0]+cnt[1])%9==cnt[2]%9 || string.indexOf("*")!=-1 && (cnt[0]*cnt[1])%9==cnt[2]%9) {
				bw.write(t+". PASS\n");
			} else {
				bw.write(t+". NOT!\n");					
			}
		}
        bw.close();
    } // end of main
} // end of Main