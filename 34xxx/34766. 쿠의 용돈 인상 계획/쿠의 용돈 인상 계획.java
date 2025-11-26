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
		int t = Integer.valueOf(br.readLine());
		
		while(t-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int d = Integer.valueOf(st.nextToken());
			int k = Integer.valueOf(st.nextToken());
			String string = br.readLine();
			
			int idx=0;
			for(int i=0;i<d;i++) {
				if(string.charAt(i)>'1') idx=i;
			}
			for(int i=0;i<idx;i++) bw.write(string.charAt(i));
			
			int cur = string.charAt(idx)-'0';
			int remain=0;
			while(k-->0) {
				cur*=9;
				if(cur==81) {
					remain++;
					cur=8;
				} else if(cur>=10) {
					bw.write(Integer.toString(cur/10));
					cur%=10;
				}
			}
			bw.write(Integer.toString(cur));
			while(remain-->0) bw.write('1');
			for(int i=idx+1;i<d;i++) bw.write(string.charAt(i));
			bw.write("\n");
		}
		
        bw.close();
    } // end of main
} // end of Main