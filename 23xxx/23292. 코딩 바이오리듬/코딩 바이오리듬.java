import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		
		String YYYYMMDD = br.readLine();
		
		int N = Integer.valueOf(br.readLine());
		int maxBiorythm=0;
		String maxDate="";
		while(N-->0) {
			String yyyymmdd = br.readLine();
			int curBiorythm=1;
			
			int tmp=0;
			for(int i=0;i<4;i++) {
				tmp += Math.pow(Math.abs(YYYYMMDD.charAt(i)-yyyymmdd.charAt(i)), 2);
			}
			curBiorythm *= tmp;
			
			tmp=0;
			for(int i=4;i<6;i++) {
				tmp += Math.pow(Math.abs(YYYYMMDD.charAt(i)-yyyymmdd.charAt(i)), 2);
			}
			curBiorythm *= tmp;
			
			tmp=0;
			for(int i=6;i<8;i++) {
				tmp += Math.pow(Math.abs(YYYYMMDD.charAt(i)-yyyymmdd.charAt(i)), 2);
			}
			curBiorythm *= tmp;
			
			if(curBiorythm>maxBiorythm) {
				maxBiorythm=curBiorythm;
				maxDate=yyyymmdd;
			} else if(curBiorythm==maxBiorythm&&maxDate.compareTo(yyyymmdd)>0) {
				maxDate=yyyymmdd;
			}
		}
		bw.write(maxDate);
		
		bw.close();
	} // end of main()
} // end of Main class