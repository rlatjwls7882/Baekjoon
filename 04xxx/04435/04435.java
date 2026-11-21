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
    	
    	int T = Integer.valueOf(bf.readLine());
    	
    	for(int i=1;i<=T;i++) {
    		// 간달프 점수 입력
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		int good =
    				Integer.valueOf(st.nextToken())+
    				Integer.valueOf(st.nextToken())*2+
    				Integer.valueOf(st.nextToken())*3+
    				Integer.valueOf(st.nextToken())*3+
    				Integer.valueOf(st.nextToken())*4+
    				Integer.valueOf(st.nextToken())*10;
    		
    		// 사우론 점수 입력
    		st = new StringTokenizer(bf.readLine());
    		int evil =
    				Integer.valueOf(st.nextToken())+
    				Integer.valueOf(st.nextToken())*2+
    				Integer.valueOf(st.nextToken())*2+
    				Integer.valueOf(st.nextToken())*2+
    				Integer.valueOf(st.nextToken())*3+
    				Integer.valueOf(st.nextToken())*5+
    				Integer.valueOf(st.nextToken())*10;
    		
    		// 이긴 진영 출력
    		bw.write("Battle "+i+": ");
    		
    		if(good>evil) bw.write("Good triumphs over Evil\n");
    		else if(evil>good) bw.write("Evil eradicates all trace of Good\n");
    		else bw.write("No victor on this battle field\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class