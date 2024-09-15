import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 피터의 ATE
		int ATE = Integer.valueOf(br.readLine());
		
		// ATE가 가지고 있는 운이 좋은 번호의 개수 계산
		int cnt=0;
		
		for(int i=1;i<=99;i++)
			for(int j=1;j<=99;j++)
				if(i+j==ATE) {
					cnt++;
					break;
				}
		
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class