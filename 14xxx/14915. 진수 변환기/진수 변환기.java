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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());
        
        // m의 n진수 계산
        bw.write(Integer.toString(m,n).toUpperCase());
        
        bw.close();
    } // end of main
} // end of Main class