import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 키와 몸무게 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	double cm = Double.valueOf(st.nextToken());
        	double kg = Double.valueOf(st.nextToken());
        	double BMI = kg*10000/cm/cm;
        	
        	// cm < 140.1
        	if(cm<140.1)
        		bw.write("6\n");
        	
        	// 140.1 ≤ cm < 146 미만
        	else if(cm<146)
        		bw.write("5\n");
        	
        	// 146 ≤ cm < 159 or cm ≥ 204
        	else if(cm<159||cm>=204)
        		bw.write("4\n");
        	
        	// 159 ≤ cm < 161
        	else if(cm<161) {
        		
        		if(16<=BMI&&BMI<35)
        			bw.write("3\n");
        		
        		else
        			bw.write("4\n");
        	}
        	
        	// 161 ≤ cm < 204
        	else {
        		
        		if(20<=BMI&&BMI<25)
        			bw.write("1\n");
        		
        		else if((18.5<=BMI&&BMI<20)||(25<=BMI&&BMI<30))
        			bw.write("2\n");
        		
        		else if((16<=BMI&&BMI<18.5)||(30<=BMI&&BMI<35))
        			bw.write("3\n");
        		
        		else
        			bw.write("4\n");
        	}
        }
        
        bw.close();
    } // end of main
} // end of Main class
