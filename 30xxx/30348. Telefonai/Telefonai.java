import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int t = Integer.valueOf(br.readLine());
		int min = Integer.MAX_VALUE;
		while(t-->0) {
			String string = br.readLine();
			boolean chk=true;
			for(int i=0;i<string.length()-1;i++) {
				if(string.charAt(i)>=string.charAt(i+1)) {
					chk=false;
					break;
				}
			}
			
			if(!chk) {
				chk=true;
				for(int i=1;i<string.length();i++) {
					if(string.charAt(i)!=string.charAt(0)) {
						chk=false;
						break;
					}
				}
			}
			
			if(chk) {
				min = Math.min(min, Integer.valueOf(string));
			}
		}
		
		if(min==Integer.MAX_VALUE) {
			bw.write("NERASTA");
		} else {
			bw.write(min+"");
		}
		
		bw.close();
	} // end of main()
} // end of Main class