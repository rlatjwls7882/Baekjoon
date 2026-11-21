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
        
        // 가로줄, 세로줄, 동아리원의 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        int K = Integer.valueOf(st.nextToken());
        
        // 영화관의 예매현황 입력
        String[] theater = new String[N];
        
        for(int i=0;i<N;i++)
        	theater[i] = br.readLine();
        
        // 동아리원이 앉을 수 있는 자리의 모양 생성
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<K;i++)
        	sb.append(0);
        
        String canSeat = sb.toString();
        
        // 가로로 이어서 앉을 수 있는 경우의 수 계산
        int cnt=0;
        
        for(int i=0;i<N;i++)
        	for(int j=0;j<M-K+1;j++)
        		if(theater[i].substring(j,j+K).equals(canSeat))
        			cnt++;
        
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class