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
    	
    	double[] weightPerPrice = new double[3];
    	
    	for(int i=0;i<3;i++) {
    		
    		// 각 과자의 금액과 무게 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int price = Integer.valueOf(st.nextToken())*10;
    		int weight = Integer.valueOf(st.nextToken())*10;
    		
    		// 각 과자의 가성비 계산
    		if(price>=5000)
    			weightPerPrice[i] = (double)weight/(price-500);
    		else
    			weightPerPrice[i] = (double)weight/price;
    	}
    	
    	// 가장 가성비가 높은 과자의 이름 출력
    	if(weightPerPrice[0]>weightPerPrice[1]&&weightPerPrice[0]>weightPerPrice[2])
    		bw.write("S");
    	else if(weightPerPrice[1]>weightPerPrice[2])
    		bw.write("N");
    	else
    		bw.write("U");
    	
    	bw.close();
    } // end of main
} // end of Main class