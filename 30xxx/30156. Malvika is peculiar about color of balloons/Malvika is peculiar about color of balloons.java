import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
            // 모든 풍선의 색 입력
        	String S = br.readLine();
        	
        	// 호박색(a) 풍선의 개수 계산
        	int cnt=0;
        	
        	for(int i=0;i<S.length();i++)
        		if(S.charAt(i)=='a')
        			cnt++;
        	
        	// 모든 풍선을 한 색으로 칠하는 최소 횟수 출력
        	bw.write(Math.min(cnt, S.length()-cnt)+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class