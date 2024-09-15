import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 좌석의 수 N, N개의 좌석정보 입력
        int N = Integer.valueOf(br.readLine());
        String seat = br.readLine();
        
        // 컵을 컵홀더에 놓을 수 있는 최대 사람의 수 출력
        bw.write(Math.min(N, seat.replace("LL", "S").length()+1)+"");

        bw.close();
    } // end of main
} // end of Main class