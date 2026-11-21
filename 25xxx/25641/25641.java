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
		
		// 최대 크기의 균형 잡힌 소떡소떡을 만들기 위해 잘라야 하는 위치 계산
		int index=N-1, so=0, tteok=0;
		
		for(int i=N-1;i>=0;i--) {
			if(sotteok.charAt(i)=='s') so++;
			else tteok++;
			
			if(so==tteok) index=i;
		}
		
		// 만들 수 있는 최대 크기의 균형 잡힌 소떡소떡 출력
		bw.write(sotteok.substring(index));
		
		bw.close();
	} // end of main()
} // end of Main class