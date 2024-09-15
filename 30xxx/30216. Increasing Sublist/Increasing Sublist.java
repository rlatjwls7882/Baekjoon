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
        
        // 목록의 요소의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 증가하는 문자열의 가장 긴 길이 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxLength=1, curLength=0, last=0;
        
        for(int i=0;i<n;i++) {
        	
        	int tmp = Integer.valueOf(st.nextToken());
        	
        	if(tmp>last) curLength++;
        	else curLength=1;
        	
        	if(curLength>maxLength) maxLength=curLength;
        	last = tmp;
        }
        
        // 증가하는 문자열의 가장 긴 길이 출력
        bw.write(maxLength+"");
        
        bw.close();
    } // end of main
} // end of Main class