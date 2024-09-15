import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 여행객이 쓰는 돈 계산
        BigDecimal totalMoney=BigDecimal.ZERO;
        
        while(true) {
        	String money = br.readLine();
        	if(money==null) break;
        	
        	totalMoney = totalMoney.add(new BigDecimal(money));
        }
        
        // 여행객이 쓰는 돈 출력
        bw.write(String.format("%.2f", totalMoney));
        bw.close();
    } // end of main
} // end of Main class