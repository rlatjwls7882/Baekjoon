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
		int maxA=0, maxIdx=1;
		for(int i=1;i<=15;i++) {
			int a = Integer.valueOf(st.nextToken());
			if(maxA<a) {
				maxA=a;
				maxIdx=i;
			}
		}
		if(maxIdx!=15) maxA++;
		bw.write(Integer.toString(maxA));
		
        bw.close();
    } // end of main
} // end of Main