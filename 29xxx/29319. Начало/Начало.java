import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 그룹의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 그룹마다 인원수 a입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        
        for(int i=0;i<n;i++)
        	a[i] = Integer.valueOf(st.nextToken());
        
        // 읽어야하는 최소 횟수 계산
        Arrays.sort(a);
        int cnt=0;
        
        for(int i=0;i<n-1;i++)
        	cnt += a[i];
        
        // 읽어야하는 최소 횟수 출력
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class