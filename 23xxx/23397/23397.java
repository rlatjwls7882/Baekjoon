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
        
        // 잠을 자는 시간 T, 비행시간 D, 기내식의 수 M 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.valueOf(st.nextToken());
        int D = Integer.valueOf(st.nextToken());
        int M = Integer.valueOf(st.nextToken());
        
        // 기내식을 먹는 시간 입력
        int[] eat = new int[M+2];
        eat[0] = 0; eat[M+1] = D;
        
        for(int i=1;i<M+1;i++)
        	eat[i] = Integer.valueOf(br.readLine());
        
        // 모든 기내식을 먹으면서 잠을 잘 수 있는지 확인
        char good = 'N';
        
        for(int i=0;i<M+1;i++)
        	if(eat[i+1]-eat[i]>=T) {
        		good = 'Y';
        		break;
        	}
        
        bw.write(good);
        bw.close();
    } // end of main
} // end of Main class