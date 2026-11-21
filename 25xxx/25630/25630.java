import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 길이 N의 소떡소떡 입력
		int N = Integer.valueOf(br.readLine());
		String sotteok = br.readLine();
		
		// 팰린드롬 소떡소떡으로 만들기 위해 마법을 사용하는 횟수 계산
		int magic=0;
		
		for(int i=0;i<N/2;i++)
			if(sotteok.charAt(i)!=sotteok.charAt(N-1-i))
				magic++;
		
		// 마법을 사용하는 횟수 출력
		bw.write(magic+"");
		
		bw.close();
	} // end of main()
} // end of Main class