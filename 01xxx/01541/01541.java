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
        
        // '-'를 기준으로 문자열 자르기
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        String[] strings = new String[st.countTokens()];
        
        for(int i=0;i<strings.length;i++)
        	strings[i] = st.nextToken();
        
        // 합의 최솟값 계산
        int sum=0;
        
        for(int i=0;i<strings.length;i++) {
        	st = new StringTokenizer(strings[i],"+");
        	
        	// 첫번째 문자열('-'가 나오기 전까지)만 더하고 나머지는 뺌
        	if(i==0)
        		while(st.hasMoreTokens())
        			sum += Integer.valueOf(st.nextToken());
        	
        	else
        		while(st.hasMoreTokens())
        			sum -= Integer.valueOf(st.nextToken());
        }
        
        // 합의 최솟값 출력
        bw.write(sum+"");
        bw.close();
    } // end of main
} // end of Main class