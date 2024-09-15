import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 구멍의 개수 입력
        int h = Integer.valueOf(br.readLine());
        
        // 구멍의 개수가 0개인 경우
        if(h==0)
        	bw.write("1");
        
        // 구멍의 개수가 1개인 경우
        else if(h==1)
        	bw.write("0");
        
        // 구멍의 개수가 2개 이상인 경우
        else {
			
        	// 홀수인 경우 4 출력
        	if(h%2==1) {
        		bw.write("4");
        		h--;
        	}
        	
        	// (h/2)개의 8 출력
        	for(;h>0;h-=2)
        		bw.write("8");
		}
        
        bw.close();
    } // end of main
} // end of Main class