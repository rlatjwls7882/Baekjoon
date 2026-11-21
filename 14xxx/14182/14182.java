import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
        	// 각 사람의 수익 입력
        	int income = Integer.valueOf(br.readLine());
        	
        	// 수익이 0원인 경우 종료
        	if(income==0) break;
        	
        	// 수익이 1000000원 이하인 경우
        	if(income<=1000000)
        		bw.write(income+"\n");
        	
        	// 수익이 5000000원 이하인 경우
        	else if(income<=5000000)
        		bw.write(income*9/10+"\n");
        	
        	// 수익이 5000000원 초과인 경우
        	else
        		bw.write(income*4/5+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class