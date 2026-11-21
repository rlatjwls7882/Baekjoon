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
        int A = Integer.valueOf(st.nextToken());
        int B = Integer.valueOf(st.nextToken());
        int C = Integer.valueOf(st.nextToken())%2;
        
        // A XOR B를 C번 한 결과(==C%2번 한 결과) 출력
        while(C-->0)
        	A = A^B;
        
        bw.write(A+"");
        
        bw.close();
    } // end of main
} // end of Main class