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
        
        // 집과 독서실에서 과제를 하는데 필요한 시간
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.valueOf(st.nextToken());
        long M = Long.valueOf(st.nextToken());
        
        // 집<->독서실 이동에 걸리는 시간, 수면시간
        st = new StringTokenizer(br.readLine());
        int T = Integer.valueOf(st.nextToken());
        int S = Integer.valueOf(st.nextToken());
        
        // 집에서 과제를 하는데 걸리는 시간
        long Zip=0;
        if(N%8==0) {
        	Zip = N+(N/8-1)*S;
        } else {
        	Zip = (N/8)*(8+S)+N%8;
        }
        
        // 독서실에서 과제를 하는데 걸리는 시간
        long Dok=0;
        if(M<8) {
        	Dok = T+M;
        } else if(M%8==0) {
        	Dok = (M/8)*(8+T)+(M/8-1)*(T+S);
        } else {
        	Dok = (M/8)*(8+T+S)+(M/8+1)*T+M%8;
        }
        
        if(Zip<Dok) {
        	bw.write("Zip\n"+Zip);
        } else {
        	bw.write("Dok\n"+Dok);
        }
        
        bw.close();
    } // end of main
} // end of Main class