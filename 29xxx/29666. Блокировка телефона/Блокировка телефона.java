import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		char[] password = br.readLine().toCharArray();
		Arrays.sort(password);
		
		char[][] passwordList = {
				{'1','2','3'}, {'4','5','6'}, {'7','8','9'}
				, {'1','4','7'}, {'2','5','8'}, {'3','6','9'}, {'0', '5', '8'}};
		
		// 전화기의 잠금을 해제할 수 있는지 확인
		boolean chk=false;
		for(int i=0;i<7;i++) {
			if(Arrays.equals(password, passwordList[i])) {
				chk=true;
				break;
			}
		}
		
		bw.write(chk?"Unlocked":"Locked");
		
		bw.close();
	} // end of main()
} // end of Main class