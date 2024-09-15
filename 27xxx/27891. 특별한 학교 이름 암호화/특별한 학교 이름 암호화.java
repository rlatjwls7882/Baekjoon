import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		int diff1 = Math.abs(string.charAt(0)-string.charAt(1));
		int diff2 = Math.abs(string.charAt(1)-string.charAt(2));
		
		// 첫번째~세번째 문자의 거리를 확인해서 어떤 학교의 이름인지 확인
		if(diff1==10||diff1==16) {
			bw.write("BHA");
		} else if(diff1==4||diff1==22) {
			bw.write("KIS");
		} else if(diff2==3||diff2==23) {
			bw.write("NLCS");
		} else {
			bw.write("SJA");
		}
		
		bw.close();
	} // end of main()
} // end of Main class