import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	// C1 입력
    	int Cn = Integer.valueOf(bf.readLine());
    	
    	for(long i=1;;i++) {
    		
    		// 처음으로 Cn이 1이 되는 시점 출력
    		if(Cn==1) {
    			bw.write(i+"");
    			break;
    		}
    		
    		//점화식 계산
    		if(Cn%2==0) Cn/=2;
    		else Cn=Cn*3+1;
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class