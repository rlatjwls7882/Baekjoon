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
        
        // 잔디 씨의 가격 C, 잔디를 깔아야 하는 횟수 L 입력
        double C = Double.valueOf(br.readLine());
        int L = Integer.valueOf(br.readLine());

        // 잔디를 깔아야하는 총 면적 계산
        double area=0;
        
        while(L--!=0) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	area += Double.valueOf(st.nextToken())*Double.valueOf(st.nextToken());
        }
        
        // 모든 잔디를 깔기 위해 드는 비용 출력
        bw.write(C*area+"");
        bw.close();
    } // end of main
} // end of Main class