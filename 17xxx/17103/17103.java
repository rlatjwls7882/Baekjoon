import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 에라토스테네스의 체로 소수 판별
    	int length = 1000000;
    	boolean[] notSosu = new boolean[length+1];
    	notSosu[0]=notSosu[1]=true;
    	
    	for(int i=2;i*i<=length;i++)
    		if(!notSosu[i])
    			for(int j=i*i;j<=length;j+=i)
    				notSosu[j]=true;
    	
    	// 테스트 케이스의 수 T
    	int T = Integer.valueOf(br.readLine());
    	
    	// 골드바흐 파티션의 수 계산
    	while(T-->0) {
    		int N = Integer.valueOf(br.readLine());
    		
    		int Goldbach=0;
    		
    		for(int i=2;i*2<=N;i++)
    			if(!notSosu[i]&&!notSosu[N-i])
    				Goldbach++;
    		
    		bw.write(Goldbach+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class