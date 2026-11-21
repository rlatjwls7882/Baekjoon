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
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		int plus = A+B;
		int minus = A-B;
		int mult = A*B;
		String opt="";
		int res=0;
		
		if(plus==minus||minus==mult||plus==mult) {
			bw.write("NIE");
		} else if(plus>minus&&plus>mult) {
			opt="+";
			res=plus;
		} else if(minus>mult) {
			opt="-";
			res=minus;
		} else {
			opt="*";
			res=mult;
		}
		
		if(!opt.isEmpty()) {
			if(A<0) {
				bw.write("("+A+")"+opt);
			} else {
				bw.write(A+opt);
			}
			if(B<0) {
				bw.write("("+B+")=");
			} else {
				bw.write(B+"=");
			}
			
			if(res<0) {
				bw.write("("+res+")");
			} else {
				bw.write(Integer.toString(res));
			}
		}

		bw.close();
	} // end of main()
} // end of Main class