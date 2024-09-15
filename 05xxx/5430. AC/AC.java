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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			String p = br.readLine();
			int n = Integer.valueOf(br.readLine());
			
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
			for(int i=0;i<n;i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			
			int left=0, right=n-1;
			boolean reversed = false;
			for(int i=0;i<p.length();i++) {
				if(p.charAt(i)=='R') {
					reversed = !reversed;
				} else {
					if(reversed) right--;
					else left++;
				}
			}
			
			if(right<left-1) {
				bw.write("error\n");
			} else {
				bw.write("[");
				if(!reversed) {
					for(int i=left;i<=right;i++) {
						if(i!=left) bw.write(",");
						bw.write(Integer.toString(arr[i]));
					}
				} else {
					for(int i=right;i>=left;i--) {
						if(i!=right) bw.write(",");
						bw.write(Integer.toString(arr[i]));
					}
				}
				bw.write("]\n");					
			}
		}
		
		bw.close();
	} // end of main
} // end of Main class