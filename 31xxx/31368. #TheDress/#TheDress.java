import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		int[] num = new int[3];
		for(int i=0;i<N;i++) {
			String string = br.readLine();
			
			boolean blue=false, black=false;
			boolean gold=false, white=false;
			
			if(string.indexOf("blue")!=-1) {
				blue=true;
			}
			if(string.indexOf("black")!=-1) {
				black=true;
			}
			if(string.indexOf("gold")!=-1) {
				gold=true;
			}
			if(string.indexOf("white")!=-1) {
				white=true;
			}
			
			if(blue&&black) {
				num[0]++;
			} else if(gold&&white) {
				num[1]++;
			} else {
				num[2]++;
			}
		}
		
		bw.write(100.*num[0]/N+"\n");
		bw.write(100.*num[1]/N+"\n");
		bw.write(100.*num[2]/N+"\n");
		
		bw.close();
	} // end of main()
} // end of Main class