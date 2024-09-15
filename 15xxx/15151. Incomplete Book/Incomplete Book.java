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
        
        // 첫 책을 쓰는데 걸리는 일 수, 첫 책을 쓰기 시작한 날부터 죽을 날까지의 일 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.valueOf(st.nextToken());
        int d = Integer.valueOf(st.nextToken());
        
        // 해적이 완성할 수 있는 최대 권 수 계산
        int cnt=0;
        
        for(int i=k;i<=d;i*=2) {
        	cnt++;
        	d -= i;
        }
        
        // 해적이 완성할 수 있는 최대 권 수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class