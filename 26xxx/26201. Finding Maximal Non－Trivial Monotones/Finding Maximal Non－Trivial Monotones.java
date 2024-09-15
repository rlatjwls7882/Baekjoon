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
		String string = br.readLine();
		
		int cnt=0, cur=1;
		for(int i=0;i<N-1;i++) {
			if(string.charAt(i)=='a'&&string.charAt(i)==string.charAt(i+1)) {
				cur++;
			} else {
				if(cur>1) {
					cnt += cur;
				}
				cur=1;
			}
		}
		if(cur>1) {
			cnt += cur;
		}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class