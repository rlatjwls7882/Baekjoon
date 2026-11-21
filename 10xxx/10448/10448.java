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
        	
        	int K = Integer.valueOf(br.readLine());
        	
        	// 3개의 삼각수의 합으로 표현될 수 있는지 계산
        	Boolean iscorrect=false;
        	
        	end:
        	for(int i=1;i*(i+1)/2<K;i++)
        		for(int j=1;j*(j+1)/2<K;j++)
        			for(int k=1;k*(k+1)/2<K;k++)
        				if((i*(i+1)+j*(j+1)+k*(k+1))/2==K) {
        					iscorrect=true;
        					break end;
        				}
        				
        	// 3개의 삼각수의 합으로 표현될 수 있는지 출력
        	if(iscorrect)
        		bw.write("1\n");
        	else
        		bw.write("0\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class