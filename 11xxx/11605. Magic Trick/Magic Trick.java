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

		int n = Integer.valueOf(br.readLine());
		
		Operation[] operations = new Operation[n];
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			operations[i] = new Operation(st.nextToken(), Integer.valueOf(st.nextToken()));
		}
		
		int cnt=0;
		for(int i=1;i<=100;i++) {
			boolean chk=false;
			int val=i;
			for(int j=0;j<n;j++) {
				if(operations[j].opt.equals("ADD")) {
					val += operations[j].val;
				} else if(operations[j].opt.equals("MULTIPLY")) {
					val *= operations[j].val;
				} else if(operations[j].opt.equals("SUBTRACT")) {
					val -= operations[j].val;
					if(val<0) {
						chk=true;
						break;
					}
				} else {
					if(val%operations[j].val!=0) {
						chk=true;
						break;
					}
					val /= operations[j].val;
				}
			}
			if(chk) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class

class Operation {
	String opt;
	int val;
	public Operation(String opt, int val) {
		this.opt=opt;
		this.val=val;
	}
} // end of Operation class