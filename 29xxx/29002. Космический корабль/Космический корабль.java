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
        
        // 적의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n명의 힘과 그 힘의 합 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] enemy = new int[n];
        int sum=0;
        
        for(int i=0;i<n;i++) {
        	enemy[i] = Integer.valueOf(st.nextToken());
        	sum += enemy[i];
        }
        
        // 보스의 위치 계산
        int bossindex=0;
        sum/=2;
        
        for(int i=0;i<n;i++)
        	if(enemy[i]==sum) {
        		bossindex=i;
        		break;
        	}
        
        // 보스를 제외한 적 출력
        for(int i=0;i<n;i++)
        	if(i!=bossindex)
        		bw.write(enemy[i]+" ");
        
        // 보스 출력
        bw.write(sum+"");
        
        bw.close();
    } // end of main
} // end of Main class