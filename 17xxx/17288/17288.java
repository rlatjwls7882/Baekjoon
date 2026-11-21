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
		
		// 연속된 세 숫자가 등장한 횟수 계산
		int cnt=0;
		for(int i=0;i+2<string.length();) {
			if(string.charAt(i)+1==string.charAt(i+1)&&string.charAt(i)+2==string.charAt(i+2)) {
				if(i+3>=string.length()||string.charAt(i)+3!=string.charAt(i+3)) {
					cnt++;
					i+=3;
				} else {
					while(i+1<string.length()&&string.charAt(i)+1==string.charAt(i+1)) {
						i++;
					}
				}
			} else {
				i++;
			}
		}
		
		bw.write(Integer.toString(cnt));
		
		bw.close();
	} // end of main()
} // end of Main class