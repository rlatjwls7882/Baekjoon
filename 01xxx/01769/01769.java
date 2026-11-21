import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 큰 자연수 X 입력
        String X = br.readLine();
        
        // 첫번째 변환 수행
        int num=0, cnt=0;
        
        if(X.length()>1) {
        	for(int i=0;i<X.length();i++)
        		num += X.charAt(i)-'0';
        	cnt++;
        }
        
        else
        	num = Integer.valueOf(X);
        
        // 2번째~n번째 변환 수행
        while(num/10!=0) {
        	
        	int tmp=num;
        	num=0;
        	
        	while(tmp!=0) {
        		num += tmp%10;
        		tmp/=10;
        	}
        	
        	cnt++;
        }
        
        // 변환을 거친 횟수와 3의 배수인지 출력
        bw.write(cnt+"\n"+(num%3==0?"YES":"NO"));
        
        bw.close();
    } // end of main
} // end of Main class