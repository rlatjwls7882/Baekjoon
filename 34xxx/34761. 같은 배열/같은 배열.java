import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	public static void main(String[] args) throws IOException {
		boolean[] exist = new boolean[200_001];
		int n = Integer.valueOf(br.readLine());
		ArrayList<Integer> a = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int val = Integer.valueOf(st.nextToken());
			a.add(val);
			exist[val]=true;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			int val = Integer.valueOf(st.nextToken());
			if(val!=a.get(i)) {
				bw.write("NO");
		        bw.close();
				return;
			}
		}
		
		for(int i=0;i<n;i++) {
			int val = Integer.valueOf(st.nextToken());
			if(!exist[val]) {
				bw.write("NO");
		        bw.close();
				return;
			}
		}
		bw.write("YES");
        bw.close();
    } // end of main
} // end of Main