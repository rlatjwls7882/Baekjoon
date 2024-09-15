import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		int d = Integer.valueOf(bf.readLine());
    		
    		//t==i(지각시간), s==i*i(수업을 일찍 마쳐주는 시간)
    		int t=0;
    		for(int i=1;i*i+i<=d;i++)
    			t=i;
    		
    		// 최대 지각시간 출력
    		bw.write(t+"\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class