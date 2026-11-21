import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 사탕의 개수 N
		int N = Integer.valueOf(br.readLine());
		
		// 규칙에 맞게 사탕을 분배하는 경우의 수 계산
		int cnt=0;
		
		for(int Nam=1;Nam<=N-5;Nam++)
			for(int Yeong=3;Nam+Yeong<=N-2;Yeong++)
				for(int Teok=2;Nam+Yeong+Teok<=N;Teok+=2)
					if(Nam+Yeong+Teok==N&&Yeong>=Nam+2)
						cnt++;
		
		// 규칙에 맞게 사탕을 분배하는 경우의 수 출력
		bw.write(cnt+"");
		
		bw.close();
	} // end of main()
} // end of Main class