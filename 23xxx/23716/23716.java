import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int T = Integer.valueOf(br.readLine());
		
		for(int i=1;i<=T;i++) {
			String S = br.readLine();
			String F = br.readLine();
			
			int cnt=0;
			for(int j=0;j<S.length();j++) {
				int min=25;
				for(int k=0;k<F.length();k++) {
					int case1 = Math.abs(S.charAt(j)-F.charAt(k));
					int case2 = Math.abs(S.charAt(j)+26-F.charAt(k));
					int case3 = Math.abs(S.charAt(j)-26-F.charAt(k));
					min = Math.min(Math.min(Math.min(case1, case2), case3), min);
				}
				cnt += min;
			}
			bw.write("Case #"+i+": "+cnt+"\n");
		}

		bw.close();
	} // end of main()
} // end of Main class