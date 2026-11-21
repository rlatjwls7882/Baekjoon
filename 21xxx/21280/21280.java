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
        
        // 강의를 하는 주의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 각 주에 예정되있는 강의의 수 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] speech = new int[N];
        
        for(int i=0;i<N;i++)
        	speech[i] = Integer.valueOf(st.nextToken());
        
        // 빈 강의실에서 한 강의의 수와 놓친 강의의 수 계산
        int empty=0, missed=0;
        
        for(int i=1;i<N;i++) {
        	if(speech[i-1]<speech[i])
        		missed += speech[i] - speech[i-1];
        	else
        		empty += speech[i-1] - speech[i];
        }
        
        // 빈 강의실에서 한 강의의 수와 놓친 강의의 수 출력
        bw.write(empty+" "+missed);
        bw.close();
    } // end of main
} // end of Main class