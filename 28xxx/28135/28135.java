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
        
        // N이 몇번째 수에서 처음 등장하는지 계산
        int cnt=N;
        
        // 마지막 수는 50이 들어가도 추가로 세지 않음
        for(int i=50;i<N;i++)
        	if(String.valueOf(i).indexOf("50")!=-1)
        		cnt++;
        
        // N이 몇번째 수에서 처음 등장하는지 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class