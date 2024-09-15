import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	//첫번째 숫자 입력
    	int output = Integer.valueOf(bf.readLine());
    	
    	//2번째 숫자 ~ N번째 숫자 계산
    	while(true) {
    		String opt = bf.readLine();
    		
    		// '=' 기호를 만날 시 종료
    		if(opt.equals("=")) break;
    		
    		// 사칙연산
    		int N = Integer.valueOf(bf.readLine());
    		
    		if(opt.equals("+"))
    			output+=N;
    		
    		else if(opt.equals("-"))
    			output-=N;
    		
    		else if(opt.equals("*"))
    			output*=N;
    		
    		else
    			output/=N;
    	}
    	
    	bw.write(output+"");
    	bw.close();
    } // end of main
} // end of Main class