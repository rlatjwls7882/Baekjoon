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
        
        // 세 정수 p, q, s 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p = Integer.valueOf(st.nextToken());
        int q = Integer.valueOf(st.nextToken());
        int s = Integer.valueOf(st.nextToken());
        
        // s초 내에 두 전등이 동시에 깜빡인 적이 있는 경우
        for(int i=p;i<=s;i+=p)
        	if(i%q==0) {
        		bw.write("yes");
        		bw.close();
        		return;
        	}
        
        // s초 내에 두 전등이 동시에 깜빡인 적이 없는 경우
        bw.write("no");
        bw.close();
    } // end of main
} // end of Main class
