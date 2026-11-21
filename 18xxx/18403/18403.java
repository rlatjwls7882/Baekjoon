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
		
		int T = Integer.valueOf(br.readLine());
		
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ", ");
			ArrayList<Integer> list = new ArrayList<>();
			while(st.hasMoreTokens()) {
				int num = Integer.valueOf(st.nextToken());
				if(num%4==0) {
					list.add(num);
				}
			}
			
			for(int i=0;i<list.size();i++) {
				bw.write(list.get(i)+" ");
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class