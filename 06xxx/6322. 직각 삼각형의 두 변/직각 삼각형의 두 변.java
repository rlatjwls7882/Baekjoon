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
    	DecimalFormat format = new DecimalFormat("0.000");
    	
    	for(int i=1;;i++) {
    		String string = bf.readLine();
    		
    		// 0 0 0 입력시 종료
    		if(string.equals("0 0 0")) break;
    		
    		// a b c 입력
    		StringTokenizer st = new StringTokenizer(string);
    		double a = Double.valueOf(st.nextToken());
    		double b = Double.valueOf(st.nextToken());
    		double c = Double.valueOf(st.nextToken());
    		
    		// 출력
    		bw.write("Triangle #"+i+"\n");
    		
    		// a가 알수 없는 변일때
    		if(a==-1) {
    			if(b>=c)
    				bw.write("Impossible.\n\n");
    			else
    				bw.write("a = "+format.format(Math.sqrt(c*c-b*b))+"\n\n");
    		}
    		
    		// b가 알수 없는 변일때
    		else if(b==-1) {
    			if(a>=c)
    				bw.write("Impossible.\n\n");
    			else
    				bw.write("b = "+format.format(Math.sqrt(c*c-a*a))+"\n\n");
    		}
    		
    		// c가 알수 없는 변일때
    		else
    			bw.write("c = "+format.format(Math.sqrt(a*a+b*b))+"\n\n");
    	}
    	
    	bw.close();
    } // end of main
} // end of Main class