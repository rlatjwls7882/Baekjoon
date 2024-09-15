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
        
        // 변의 개수 A, 온도 B
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.valueOf(st.nextToken());
        long B = Integer.valueOf(st.nextToken());
        
        // 최소 결정 개수 계산(공차가 A-2인 등차수열의 합)
        // => (B+1){2+B(A-2)}
        bw.write((B+1)*(2+B*(A-2))/2+"");
        
        bw.close();
    } // end of main
} // end of Main class