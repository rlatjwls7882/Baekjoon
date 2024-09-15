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
        
        // 층 수 n, 각 층마다 집의 수 m, 벌금 a 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());
        int a = Integer.valueOf(st.nextToken());
        
        // 모든 집에 있는 고양이의 수 입력
        st = new StringTokenizer(br.readLine());
        int[] cat = new int[n*m];
        
        for(int i=0;i<n*m;i++)
        	cat[i] = Integer.valueOf(st.nextToken());
        
        // 벌금 계산
        int fine=0;
        
        for(int i=0;i<(n-1)*m;i++)
        	if(cat[i]*2<cat[i+m])
        		fine+=a;
        
        // 벌금 출력
        bw.write(fine+"");
        
        bw.close();
    } // end of main
} // end of Main class