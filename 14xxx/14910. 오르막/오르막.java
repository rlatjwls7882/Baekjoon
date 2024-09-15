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
        
        // 비내림차순으로 나열되어 있는지 확인
        String isGood = "Good";
        int before = Integer.valueOf(st.nextToken());
        
        while(st.hasMoreTokens()) {
        	int now = Integer.valueOf(st.nextToken());
        	if(before>now) {
        		isGood = "Bad";
        		break;
        	}
        	before=now;
        }
        
        bw.write(isGood);
        
        bw.close();
    } // end of main
} // end of Main class