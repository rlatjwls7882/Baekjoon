import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 디스크의 반경 r 입력
        int r = Integer.valueOf(br.readLine());
        
        // 가장 가까운 디스크 외부의 점의 위치 출력
        bw.write(r+" 1");
        
        bw.close();
    } // end of main
} // end of Main class