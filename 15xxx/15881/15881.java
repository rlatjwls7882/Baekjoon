import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// n개의 물건 나열
		int n = Integer.valueOf(br.readLine());
		char[] obj = br.readLine().toCharArray();
		
		// 펜-파인애플-애플-펜의 최대 개수 계산
		int cnt=0;
		for(int i=0;i<n-3;i++) {
			if(obj[i]=='p'&&obj[i+1]=='P'&&obj[i+2]=='A'&&obj[i+3]=='p') {
				cnt++;
				i+=3;
			}
		}
		
		bw.write(Integer.toString(cnt));

		bw.close();
	} // end of main()
} // end of Main class