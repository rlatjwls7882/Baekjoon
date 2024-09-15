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
        
        // 게임을 하는 사람 수 n, 캐릭터의 최대 레벨 m, 가질 수 있는 흰색 배지의 최대개수 k 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 준비해야하는 배지의 최소 개수 출력 (흰색 : k-1, 빨간색 : m/k)
        if(m>=k)
        	bw.write((k-1+m/k)*n+"");
        else
        	bw.write(m*n+"");
        
        bw.close();
    } // end of main
} // end of Main class