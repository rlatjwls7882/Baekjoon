import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int N = Integer.valueOf(br.readLine());
		
		String[] name = new String[N];
		for(int i=0;i<N;i++) {
			name[i] = br.readLine();
		}
		
		boolean lie = false;
		for(int i=0;i<N;i++) {
			if(!lie) {
				bw.write("? "+name[i]+"\n");
				bw.flush();
				int ans1 = Integer.valueOf(br.readLine());
				
				bw.write("? "+name[i]+"\n");
				bw.flush();
				int ans2 = Integer.valueOf(br.readLine());
				
				if(ans1!=ans2) {
					lie=true;
				}
			}
			
			bw.write("? "+name[i]+"\n");
			bw.flush();
			int realAns = Integer.valueOf(br.readLine());
			if(realAns==1) {
				bw.write("! "+name[i]);
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class