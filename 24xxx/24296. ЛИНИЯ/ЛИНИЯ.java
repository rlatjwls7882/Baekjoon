import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 검사가 시작할 때 줄서있는 학생수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 처음에 줄서있는 학생수 출력
        while(N%2==1)
        	N = (N+1)/2;
        
        bw.write(N+"");
        bw.close();
    } // end of main
} // end of Main class