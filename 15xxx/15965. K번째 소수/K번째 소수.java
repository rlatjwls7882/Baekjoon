import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        boolean[] NotSosu = new boolean[10000000];
        
        for(int i=2;i*i<=10000000;i++)
        	if(!NotSosu[i])
        		for(int j=i*i;j<10000000;j+=i)
        			NotSosu[j]=true;
        
        // K번째 소수 출력
        int K = Integer.valueOf(br.readLine());
        
        for(int i=2;;i++) {
        	if(!NotSosu[i]) K--;
        	if(K==0) {
        		bw.write(i+"");
        		break;
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class