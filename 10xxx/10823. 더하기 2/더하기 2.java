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
        
        // 문자열 S 입력
        StringBuilder S = new StringBuilder();
        
        while(true) {
        	String tmp="";
        	
        	if((tmp = br.readLine())==null) break;
        	
        	S.append(tmp);
        }
        
        // ',' 를 기준으로 숫자의 합 계산
        StringTokenizer st = new StringTokenizer(S.toString(),",");
        int sum=0;
        
        while(st.hasMoreTokens())
        	sum += Integer.valueOf(st.nextToken());
        
        // 숫자의 합 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class