import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 블럭의 개수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 최대로 쌓을 수 있는 층의 수 계산
        int floor=0;
        
        for(int require=1;require*require<=N;require+=2) {
        	floor++;
        	N -= require*require;
        }
        
        // 최대로 쌓을 수 있는 층의 수 출력
        bw.write(floor+"");
        
        bw.close();
    } // end of main
} // end of Main class