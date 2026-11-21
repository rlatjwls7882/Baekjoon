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
        
        // N, A, B 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken())-1;
        int A = Integer.valueOf(st.nextToken())-1;
        int B = Integer.valueOf(st.nextToken())-1;
        
        // 문자열 입력
        String string = br.readLine();
        
        // 1~A-1번째 문자 출력
        for(int i=0;i<=A-1;i++)
        	bw.write(string.charAt(i));
        
        // A~B번째 문자 거꾸로 출력
        for(int i=B;i>=A;i--)
        	bw.write(string.charAt(i));
        
        // A+1~N번째 문자 출력
        for(int i=B+1;i<=N;i++)
        	bw.write(string.charAt(i));
        
        bw.close();
    } // end of main
} // end of Main class