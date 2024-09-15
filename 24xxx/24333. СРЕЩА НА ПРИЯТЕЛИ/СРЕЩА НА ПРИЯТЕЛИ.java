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
        
        // l1 r1 l2 r2 k 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int l1 = Integer.valueOf(st.nextToken());
        int r1 = Integer.valueOf(st.nextToken());
        int l2 = Integer.valueOf(st.nextToken());
        int r2 = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());
        
        // 두 친구가 대화할 수 있는 시간 계산
        int talk=0;
        
        for(int i=Math.max(l1, l2);i<=Math.min(r1, r2);i++)
        	if(i!=k)
        		talk++;
        
        bw.write(talk+"");
        
        bw.close();
    } // end of main
} // end of Main class