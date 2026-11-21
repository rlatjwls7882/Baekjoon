import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // n개의 테스트 입력
        int n = Integer.valueOf(br.readLine());
        String test = br.readLine();
        
        // 포인트 계산
        int score=0;
        
        for(int i=0;i<n;i+=n/10) {
        	
        	int correct=0;
        	
        	for(int j=i;j<i+n/10;j++)
        		if(test.charAt(j)=='T')
        			correct++;
        		else
        			break;
        	
        	if(correct==n/10)
        		score++;
        }
        
        // 획득한 포인트 출력
        bw.write(score+"");
        
        bw.close();
    } // end of main
} // end of Main class