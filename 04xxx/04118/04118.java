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
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			boolean[] nums = new boolean[50];
			while(N-->0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int i=0;i<6;i++) {
					nums[Integer.valueOf(st.nextToken())]=true;
				}
			}
			
			boolean chk=true;
			for(int i=1;i<=49;i++) {
				if(!nums[i]) {
					chk=false;
					break;
				}
			}
			bw.write(chk?"Yes\n":"No\n");
		}
		
		bw.close();
	} // end of main()
} // end of Main class