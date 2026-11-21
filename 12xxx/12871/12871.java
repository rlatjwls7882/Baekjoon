import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();
		String T = br.readLine();
		int Slength = S.length();
		int Tlength = T.length();
		
		// f(S)와 f(T)가 같은지 확인
		boolean isSame=true;

		for(int i=0;i<Slength*Tlength;i++)
			if(T.charAt(i%Tlength)!=S.charAt(i%Slength)) {
				isSame=false;
				break;
			}
		
		bw.write(isSame?"1":"0");
		
		bw.close();
	} // end of main()
} // end of Main class