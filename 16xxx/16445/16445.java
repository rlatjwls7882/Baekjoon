import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 게임의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 게임에서 차를 획득하는 횟수 계산
        int car=0;
        
        while(N--!=0)
        	if(!br.readLine().equals("1"))
        		car++;
        
        // 게임에서 차를 획득하는 횟수 출력
        bw.write(car+"");
        bw.close();
    } // end of main
} // end of Main class