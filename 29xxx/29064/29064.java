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
        
        // 군인의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 전투 준비가 완료된 군인의 수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int soldier=0;
        
        for(int i=0;i<n;i++)
        	if(st.nextToken().equals("1"))
        		soldier++;
        
        // 무조건적인 승리를 위해 더 준비해야 하는 군인의 수 출력
        bw.write(Math.max(0, (n+1)/2-soldier)+"");
        
        bw.close();
    } // end of main
} // end of Main class