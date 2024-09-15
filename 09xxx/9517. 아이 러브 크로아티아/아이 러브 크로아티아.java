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

    	int K = Integer.valueOf(bf.readLine());
    	int N = Integer.valueOf(bf.readLine());
        
        //3분 30초 타이머
    	int timer = 210;
    	
    	while(N--!=0) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int T = Integer.valueOf(st.nextToken());
    		String Z = st.nextToken();
    		
    		timer-=T;
    		
            // 타이머가 다될 경우 종료
    		if(timer<=0) break;

            // 문제를 해결할때 다른 사람에게 폭탄을 넘김
    		if(Z.equals("T")) K++;
    	}
    	
    	while(K>8) K-=8;
    	
    	bw.write(K+"");
    	bw.close();
    } // end of main
} // end of Main class