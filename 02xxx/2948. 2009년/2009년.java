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

		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] day = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		
		// 입력한 날짜의 요일 계산
		StringTokenizer st = new StringTokenizer(br.readLine());
		int D = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		
		for(int i=0;i<M-1;i++)
			D += month[i];
		
		bw.write(day[D%7]);
		
		bw.close();
	} // end of main
} // end of Main class