import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	//테스트 케이스의 개수 T
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int n = Integer.valueOf(st.nextToken());
    		int m = Integer.valueOf(st.nextToken());
    		
    		//정수쌍의 개수 구하기
    		int num=0;
    		
    		for(int b=1;b<n;b++)
    			for(int a=1;a<b;a++)
    				if((a*a+b*b+m)/(a*b)==(a*a+b*b+m)/((double)a*b))
    					num++;
    		
    		//정수쌍의 개수 출력
    		bw.write(num+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class