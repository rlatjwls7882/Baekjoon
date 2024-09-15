import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// n과 n개의 x, y쌍을 입력
    	int n = Integer.valueOf(bf.readLine());
    	int[] x = new int[n];
    	int[] y = new int[n];
    	
    	for(int i=0;i<n;i++) {
    		StringTokenizer st = new StringTokenizer(bf.readLine());
    		x[i] = Integer.valueOf(st.nextToken());
    		y[i] = Integer.valueOf(st.nextToken());
    	}
    	
    	// Sx 계산
    	BigDecimal Sx = BigDecimal.ZERO;
    	for(int i=0;i<n;i++)
    		Sx = Sx.add(new BigDecimal(x[i]));
    	
    	// Sxx 계산
    	BigDecimal Sxx = BigDecimal.ZERO;
    	for(int i=0;i<n;i++)
    		Sxx =  Sxx.add(new BigDecimal(x[i]*x[i]));
    	
    	// Sy 계산
    	BigDecimal Sy = BigDecimal.ZERO;
    	for(int i=0;i<n;i++)
    		Sy = Sy.add(new BigDecimal(y[i]));
    	
    	// Sxy 계산
    	BigDecimal Sxy = BigDecimal.ZERO;
    	for(int i=0;i<n;i++)
    		Sxy = Sxy.add(new BigDecimal(x[i]*y[i]));
    	
    	// a2와 b2의 쌍이 여러개 존재할 경우
    	if(Sx.multiply(Sx).equals(Sxx.multiply(new BigDecimal(n))))
    		bw.write("EZPZ");
    	
    	else {
    		// a2, b2 계산
    		BigDecimal a2 = (Sxy.multiply(new BigDecimal(n)).subtract(Sx.multiply(Sy)))
    				.divide((Sxx.multiply(new BigDecimal(n)).subtract(Sx.multiply(Sx))), 10, BigDecimal.ROUND_HALF_UP);
    		BigDecimal b2 = (Sy.subtract(a2.multiply(Sx))).divide(new BigDecimal(n), 10, BigDecimal.ROUND_HALF_UP);
    		
    		// a2, b2 출력
    		bw.write(a2+" "+b2);
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class