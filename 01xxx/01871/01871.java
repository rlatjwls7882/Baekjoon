import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 번호판의 수 N
		int N = Integer.valueOf(br.readLine());
		
		// 좋은 번호판인지 확인
		while(N-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine(),"-");
			String first = st.nextToken();
			int secondVal = Integer.valueOf(st.nextToken());
			
			int firstVal=0;
			for(int i=0;i<first.length();i++)
				firstVal += (first.charAt(i)-'A')*Math.pow(26, first.length()-i-1);
			
			bw.write(Math.abs(firstVal-secondVal)<=100?"nice\n":"not nice\n");
		}

		bw.close();
	} // end of main
} // end of Main class