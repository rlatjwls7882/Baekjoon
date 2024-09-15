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
        
        // 계산 해야 하는 개수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        // 부피의 최대값 계산
        double maxV=0;
        
        while(n-->0){
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	char type = st.nextToken().charAt(0);
        	
        	// 부피 계산
        	double V=0;
        	
        	// 원뿔 : (1/3)πr²h
        	if(type=='C')
        		V = Math.PI/3*Math.pow(Double.valueOf(st.nextToken()), 2)
                *Double.valueOf(st.nextToken());
        	
        	// 원기둥 : πr²h
        	else if(type=='L')
        		V = Math.PI*Math.pow(Double.valueOf(st.nextToken()), 2)
                *Double.valueOf(st.nextToken());
        	
        	// 구 : (4/3)πr³
        	else
        		V = Math.PI*4/3*Math.pow(Double.valueOf(st.nextToken()), 3);
        	
        	if(maxV<V)
        		maxV = V;
        }
        
        // 부피의 최댓값 출력
        bw.write(String.format("%.3f", (int)(maxV*1000)/1000.));
        bw.close();
    } // end of main
} // end of Main class