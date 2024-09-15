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
		int L = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());
		
		int cnt=0;
		while(L<=H) {
			int tmp=L;
			
			boolean chk=true;
			boolean[] nums = new boolean[10];
			while(tmp!=0) {
				if(tmp%10==0) {
					chk=false;
					break;
				}
				if(nums[tmp%10]) {
					chk=false;
					break;
				}
				nums[tmp%10]=true;
				if(L%(tmp%10)!=0) {
					chk=false;
					break;
				}
				tmp/=10;
			}
			if(chk) {
				cnt++;
			}
			L++;
		}
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class