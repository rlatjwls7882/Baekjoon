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
    	
    	// A(A+1)+1 = N
    	N-=1;
    	
    	// 폭죽 수 계산
    	for(int i=1;;i++)
    		if(i*(i+1)==N) {
    			bw.write(i+"");
    			break;
    		}
    	
    	bw.close();
    } // end of main
} // end of Main class