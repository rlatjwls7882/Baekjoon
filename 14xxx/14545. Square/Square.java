import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 케이스의 수 P
        int P = Integer.valueOf(br.readLine());
        
        // 그림에서 찾을 수 있는 정사각형의 수 출력(=1²+2²+...)
        while(P-->0) {
        	long n = Long.valueOf(br.readLine());
        	bw.write(n*(n+1)*(2*n+1)/6+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class