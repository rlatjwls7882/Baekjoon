import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int numCases=1;;numCases++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			String opt = st.nextToken();
			int b = Integer.valueOf(st.nextToken());
			if(opt.equals("E")) break;
			
			// a opt b가 성립하는지 확인
			String outcome="";
			if(opt.equals(">")) {
				if(a>b) outcome="true";
				else outcome="false";
			} else if(opt.equals(">=")) {
				if(a>=b) outcome="true";
				else outcome="false";
			} else if(opt.equals("<")) {
				if(a<b) outcome="true";
				else outcome="false";
			} else if(opt.equals("<=")) {
				if(a<=b) outcome="true";
				else outcome="false";
			} else if(opt.equals("==")) {
				if(a==b) outcome="true";
				else outcome="false";
			} else {
				if(a!=b) outcome="true";
				else outcome="false";
			}
			
			bw.write(String.format("Case %d: %s\n", numCases, outcome));
		}
		
		bw.close();
	} // end of main
} // end of Main class