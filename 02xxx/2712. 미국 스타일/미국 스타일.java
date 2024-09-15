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
    	DecimalFormat format = new DecimalFormat("0.0000");
    	
    	// 테스트 케이스 T
    	int T = Integer.valueOf(bf.readLine());
    	
    	while(T--!=0) {
    		
    		// 값 A, 단위 unit
    		StringTokenizer st= new StringTokenizer(bf.readLine());
    		double A = Double.valueOf(st.nextToken());
    		String unit = st.nextToken();
    		
    		// 단위 변경 후 출력
    		if(unit.equals("kg"))
    			bw.write(format.format(A*2.2046)+" lb\n");
    		else if(unit.equals("lb"))
    			bw.write(format.format(A*0.4536)+" kg\n");
    		else if(unit.equals("l"))
    			bw.write(format.format(A*0.2642)+" g\n");
    		else
    			bw.write(format.format(A*3.7854)+" l\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class