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
        
        // 삼각형의 밑변의 길이와 높이 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        double W = Double.valueOf(st.nextToken());
        double H = Double.valueOf(st.nextToken());
        
        // 삼각형의 넓이 출력
        bw.write(String.format("%.1f", W*H/2));
        bw.close();
    } // end of main
} // end of Main class