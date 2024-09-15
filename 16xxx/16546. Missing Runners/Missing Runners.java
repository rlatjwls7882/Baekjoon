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
        
        // 선수의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 통과한 학생 : 1, 통과하지 못한 학생 : 0
        int[] player = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N-1;i++)
        	player[Integer.valueOf(st.nextToken())-1]++;
        
        // 통과하지 못한 학생 출력
        for(int i=0;i<N;i++)
        	if(player[i]==0) {
        		bw.write(i+1+"");
        		break;
        	}
        
        bw.close();
    } // end of main
} // end of Main class