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
		int l = Integer.valueOf(st.nextToken());
		int r = Integer.valueOf(st.nextToken());
		
		boolean existX=false;
		while(l<=r) {
			boolean chk=true;
			int[] nums = new int[10];
			int tmp=l;
			while(tmp!=0) {
				if(++nums[tmp%10]>1) {
					chk=false;
					break;
				}
				tmp/=10;
			}
			if(chk) {
				bw.write(Integer.toString(l));
				existX=true;
				break;
			}
			l++;
		}
		if(!existX) {
			bw.write("-1");
		}

		bw.close();
	} // end of main()
} // end of Main class