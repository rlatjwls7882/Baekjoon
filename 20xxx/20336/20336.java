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
        
        // tmp
        br.readLine();
        
        // 요리의 개수 d 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int d = Integer.valueOf(st.nextToken());
        bw.write(d+"\n");
        
        // d개의 요리 출력
        while(d-->0)
        	bw.write(st.nextToken()+"\n");
        
        bw.close();
    } // end of main
} // end of Main class