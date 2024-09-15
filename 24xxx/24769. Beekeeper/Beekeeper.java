import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		while(true) {
			int N = Integer.valueOf(br.readLine());
			if(N==0) {
				break;
			}
			
			int max=-1;
			char[] maxString = new char[] {};
			
			while(N-->0) {
				char[] string = br.readLine().toCharArray();
				int cnt=0;
				for(int i=0;i<string.length-1;i++) {
					if(string[i]==string[i+1]&&(string[i]=='a'||string[i]=='e'||string[i]=='i'||string[i]=='o'||string[i]=='u'||string[i]=='y')) {
						cnt++;
						i++;
					}
				}
				if(cnt>max) {
					max=cnt;
					maxString=string;
				}
			}
			for(int i=0;i<maxString.length;i++) {
				bw.write(maxString[i]);
			}
			bw.newLine();
		}
		
		bw.close();
	} // end of main()
} // end of Main class