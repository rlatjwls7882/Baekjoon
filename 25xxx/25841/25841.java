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
        
        // 정수 start, end, num 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.valueOf(st.nextToken());
        int end = Integer.valueOf(st.nextToken());
        int num = Integer.valueOf(st.nextToken())+'0';
        
        // start~end 사이에서 num이 나타난 횟수 계산
        int cnt=0;
        
        for(;start<=end;start++) {
        	String tmp = String.valueOf(start);
        	
        	for(int i=0;i<tmp.length();i++)
        		if(tmp.charAt(i)==num)
        			cnt++;
        }
        
        // num이 나타난 횟수 출력
        bw.write(cnt+"");
        bw.close();
    } // end of main
} // end of Main class