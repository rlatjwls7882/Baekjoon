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
		
		// 사과의 개수 A, 바나나의 개수 B
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		
		// 공평하게 나누어 줄 수 있는 모든 경우(최대공약수의 약수) 계산
		int tmpA=A, tmpB=B;
		while(tmpB!=0) {
			int tmp = tmpA%tmpB;
			tmpA=tmpB;
			tmpB=tmp;
		}
		
		for(int i=1;i<=tmpA;i++)
			if(tmpA%i==0)
				bw.write(String.format("%d %d %d\n", i, A/i, B/i));
		
		
		bw.close();
	} // end of main()
} // end of Main class