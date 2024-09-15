import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	DecimalFormat format = new DecimalFormat("0.00");
    	
    	// 첫번째 온도 입력
    	double firstTemp = Double.valueOf(bf.readLine());
    	
    	while(true) {
    		// 다음 온도 입력
    		double nextTemp = Double.valueOf(bf.readLine());
    		
    		// 입력값으로 999가 들어올때 종료
    		if(nextTemp==999) break;
    		
    		// 온도의 변화 값 출력
    		bw.write(format.format(nextTemp-firstTemp)+"\n");
    		
    		// 다음 비교를 위해 nextTemp의 값을 firstTemp로 대입
    		firstTemp=nextTemp;
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class