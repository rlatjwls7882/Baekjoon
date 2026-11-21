import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String a = br.readLine();
		int N = Integer.valueOf(br.readLine());
		
		int cnt=0;
		while(N-->0) {
			String b = br.readLine();
			boolean chk=true;
			for(int i=0;i<5;i++) {
				if(a.charAt(i)!=b.charAt(i)) {
					chk=false;
					break;
				}
			}
			if(chk) {
				cnt++;
			}
		}
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main
} // end of Main class