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
        
        // 두 정수 A, B 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.valueOf(st.nextToken());
        long B = Long.valueOf(st.nextToken());
        
        // A>0, B>0 => (B-A+1)(A+B)/2
        // A<0, B>0 => -A(A-1)/2+B(B+1)/2 = (B-A+1)(A+B)/2
        // A<0, B<0 => (B-A+1)(A+B)/2
        
        // A~B의 합 출력
        if(B>A)
        	bw.write((B-A+1)*(A+B)/2+"");
        else
        	bw.write((A-B+1)*(A+B)/2+"");
        
        bw.close();
    } // end of main
} // end of Main class