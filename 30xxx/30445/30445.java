import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		char[] string = br.readLine().toCharArray();
		
		// 행복한 글자와 우울한 글자의 개수 계산
		int PH=0, PG=0;
		for(int i=0;i<string.length;i++) {
			if(string[i]=='H'||string[i]=='A'||string[i]=='P'||string[i]=='Y') {
				PH++;
			}
			if(string[i]=='S'||string[i]=='A'||string[i]=='D') {
				PG++;
			}
		}
		
		// 행복 지수 계산
		if(PH==0&&PG==0) {
			bw.write("50.00");
		} else {
			bw.write(String.format("%.02f", PH*100./(PH+PG)));
		}
		
		bw.close();
	} // end of main()
} // end of Main class