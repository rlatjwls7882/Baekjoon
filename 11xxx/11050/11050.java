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
        
        // n k 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // nCk 계산
        long C=1;
        
        // n(n-1)(n-2)...(n-k+1)
        for(int i=n;i>n-k;i--)
        	C*=i;
        
        // 1/k(k-1)(k-2)...(1)
        while(k>0)
        	C/=k--;
        
        // nCk 출력
        bw.write(C+"");
        
        bw.close();
    } // end of main
} // end of Main class