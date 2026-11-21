import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int N = Integer.valueOf(bf.readLine());
    	
    	// 0번째 수와, 1번째 수 예외
    	int Fn1 = 0;
    	int Fn2 = 1;
    	
    	if(N==0)
    		bw.write(Fn1+"");
    	else if(N==1)
    		bw.write(Fn2+"");
    	
    	// 2번째 수 ~ 20번째 수
    	else {
    		N--;
    		
    		while(N--!=0) {
    			int tmp = Fn1+Fn2;
    			Fn1 = Fn2;
    			Fn2 = tmp;
    		}
    		
    		bw.write(Fn2+"");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class