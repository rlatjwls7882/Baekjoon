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
        
        // 에르다 노바 사용 횟수와 오리진 스킬 사용 횟수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 에르다 노바 스킬을 누른 시점 입력
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N;i++)
        	A[i] = Integer.valueOf(st.nextToken());
        
        Arrays.sort(A);
        
        // 에르다 노바 스킬 사용 횟수 계산
        int cooltime=0, cnt=0;
        
        for(int i=0;i<N;i++)
        	if(A[i]>=cooltime) {
        		cooltime = A[i] + 100;
        		cnt++;
        	}
        
        // 에르다 노바 스킬 사용 횟수 출력
        bw.write(cnt+" ");
        
        // 오리진 스킬을 누른 시점 입력
        int[] B = new int[M];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<M;i++)
        	B[i] = Integer.valueOf(st.nextToken());
        
        Arrays.sort(B);
        
        // 오리진 스킬 사용 횟수 계산
        cooltime=0; cnt=0;
        
        for(int i=0;i<M;i++)
        	if(B[i]>=cooltime) {
        		cooltime = B[i] + 360;
        		cnt++;
        	}
        
        // 오리진 스킬 사용 횟수 출력
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class