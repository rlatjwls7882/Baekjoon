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

        // 카드의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n개의 카드의 합 계산
        int sum=0, max=0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
        	int tmp = Integer.valueOf(st.nextToken());
        	
        	sum += tmp;
        	if(max<tmp) max=tmp;
        }
        
        // 제일 큰 카드를 제외한 합 출력
        bw.write(sum-max+"");
        bw.close();
    } // end of main
} // end of Main class