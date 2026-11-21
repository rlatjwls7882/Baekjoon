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
        
        // A, B, C 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.valueOf(st.nextToken());
        double B = Double.valueOf(st.nextToken());
        double C = Double.valueOf(st.nextToken());
        
        // A*B/C 출력
        bw.write(A*B/C+"");
        bw.close();
    } // end of main
} // end of Main class