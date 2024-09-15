import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	DecimalFormat format = new DecimalFormat("0.00");
    	
    	int N = Integer.valueOf(bf.readLine());
    	
    	if(N==0)
    		bw.write("divide by zero");
    	
    	else {
    		// 총점과 기대값 계산
    		double totalScore=0, Ex=0;
    		
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		
    		for(int i=0;i<N;i++) {
    			double tmp = Double.valueOf(st.nextToken());
    			totalScore+=tmp;
    			Ex+=tmp/N;
    		}
    		
    		// 평균값 계산
    		double averageScore=totalScore/N;
    		
    		// 기량을 뽐낼 수 있는 확률 출력
    		if(Ex==0)
    			bw.write("divide by zero");
    		else
    			bw.write(format.format(averageScore/Ex)+"");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class