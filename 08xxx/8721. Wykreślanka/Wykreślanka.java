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
        
        // 수열에 들어있는 정수의 수 N 입력
        int N = Integer.valueOf(br.readLine());
        
        // 좋은 수열을 만들기 위해 지워야하는 자연수의 개수 계산
        StringTokenizer st = new StringTokenizer(br.readLine());
        int remove=0;
        
        for(int i=1;N>0;i++) {
        	
        	while(N-->0) {
        		int a = Integer.valueOf(st.nextToken());
        		
        		if(a==i)
        			break;
        		else
        			remove++;
        	}
        }
        
        // 좋은 수열을 만들기 위해 지워야하는 자연수의 개수 출력
        bw.write(remove+"");
        bw.close();
    } // end of main
} // end of Main class