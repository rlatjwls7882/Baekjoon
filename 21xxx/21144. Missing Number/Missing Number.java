import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		int n = Integer.valueOf(br.readLine());
		String string = br.readLine();
		
		int num=1;
		for(int i=0;num<=n;) {
			if(num<10) {
				if(i<string.length()&&num==string.charAt(i)-'0') {
					i++;
					num++;
				} else {
					bw.write(Integer.toString(num));
					break;
				}
			} else {
				if(i+1<string.length()&&num==Integer.valueOf(string.substring(i, i+2))) {
					i+=2;
					num++;
				} else {
					bw.write(Integer.toString(num));
					break;
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class