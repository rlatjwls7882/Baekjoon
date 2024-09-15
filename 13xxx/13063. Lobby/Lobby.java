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
        
        while(true) {
        	
        	// 총 의원수, 보수정당 의원수, 혁신정당 의원수 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int n = Integer.valueOf(st.nextToken());
        	int k = Integer.valueOf(st.nextToken());
        	int d = Integer.valueOf(st.nextToken());
        	
        	// 총 의원이 0명인 경우 종료
        	if(n==0) break;
        	
        	// 법안을 통과시킬 수 없는 경우
        	int require = n/2-k+1;
        	
        	if(require>n-k-d)
        		bw.write("-1\n");
        	
        	// 법안을 통과시킬 수 있는 경우
        	else if(require<0)
        		bw.write("0\n");
        	
        	else
        		bw.write(n/2-k+1+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class