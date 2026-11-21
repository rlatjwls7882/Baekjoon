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
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.valueOf(st.nextToken());
        String K = st.nextToken();
        
        // K가 포함되어 있는 시간의 수 계산
        int cnt=0;
        for(int i=0;i<=5959+N*10000;i++) {
        	if(i%100==60) i+=40;
        	if(i%10000==6000) i+=4000;
        	
        	if(String.format("%06d", i).indexOf(K)!=-1)
        		cnt++;
        }
        bw.write(cnt+"");
        
        bw.close();
    } // end of main
} // end of Main class