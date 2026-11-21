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
		
		// 1이 될 수 있는 자리의 수 계산
		int numOfOne=0;
		if(string.equals("0")) {
			numOfOne=1;
		}

		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='1') {
				numOfOne++;
			} else if(string.charAt(i)>'1') {
				numOfOne+=string.length()-i;
				break;
			}
		}

		// 구매해야 하는 스티커 팩의 최소 개수 계산
		int min = Math.max(string.length()-1, numOfOne);
		
		bw.write(Integer.toString(min));
		
		bw.close();
	} // end of main()
} // end of Main class