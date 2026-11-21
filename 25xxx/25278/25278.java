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
        
        // 화성에 가할 변화의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n번의 변화 가하기
        int temp=-30, oxygen=0, ocean=0;
        
        while(n-->0) {
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String change = st.nextToken();
        	
            // 온도
        	if(change.equals("temperature"))
        		temp += Integer.valueOf(st.nextToken());
            
            // 산소
        	else if(change.equals("oxygen"))
        		oxygen += Integer.valueOf(st.nextToken());
            
            // 해양
        	else
        		ocean += Integer.valueOf(st.nextToken());
        }
        
        // 살 수 있는 행성인지 확인
        if(ocean>=9&&oxygen>=14&&temp>=8)
        	bw.write("liveable");
        else
        	bw.write("not liveable");
        
        bw.close();
    } // end of main
} // end of Main class