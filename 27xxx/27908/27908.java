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
		int n = Integer.valueOf(st.nextToken());
		int d = Integer.valueOf(st.nextToken());
		
		int end = (n+d-2)/7+2;
		int idx=1, curDay=1;
		for(int i=0;i<=end;i++) {
			for(int j=1;j<=9;j++) {
				if(i==0||i==end) {
					if(j==1||j==9) {
						bw.write('+');
					} else {
						bw.write("---");
					}
				} else if(j==1||j==9) {
					bw.write('|');
				} else {
					if(d<=idx&&idx<d+n) {
						String string = Integer.toString(curDay++);
						for(int k=0;k<3-string.length();k++) {
							bw.write('.');
						}
						bw.write(string);
					} else {
						bw.write("...");
					}
					idx++;
				}
			}
			bw.newLine();
		}

		bw.close();
	} // end of main()
} // end of Main class