import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 손가락으로 숫자를 세는 방법의 수 계산
        int cnt=0;
        
        for(int i=0;i<=N;i++)
        	if(N-i>=i&&N-i<=5)
        		cnt++;
        
        // 손가락으로 숫자를 세는 방법의 수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class