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
			int n = Integer.valueOf(br.readLine());
			if(n==-1) {
				break;
			}
			
			int minSize=Integer.MAX_VALUE, maxSize=Integer.MIN_VALUE;
			String minName="", maxName="";
			while(n-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int size = Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken())*Integer.valueOf(st.nextToken());
				String name = st.nextToken();
				
				if(size>maxSize) {
					maxSize=size;
					maxName=name;
				}
				if(size<minSize) {
					minSize=size;
					minName=name;
				}
			}
			bw.write(String.format("%s took clay from %s.\n", maxName, minName));
		}
		
		bw.close();
	} // end of main()
} // end of Main class