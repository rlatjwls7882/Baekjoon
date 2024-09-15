import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 정수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // n = o2^p를 만족하는 o와 p를 출력
        for(int p=0;;p++) {
        	
        	double o = n/Math.pow(2, p);
        	
        	if(o%2==1) {
        		bw.write((int)o+" "+p);
        		break;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class