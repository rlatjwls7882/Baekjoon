import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 전체 물건과 가격
        String[] items = {
        		"Paper", "Printer", "Planners", "Binders"
        		, "Calendar", "Notebooks", "Ink"
        };
        
        double[] price = {
        		57.99, 120.50, 31.25, 22.50, 10.95
        		, 11.20, 66.95
        };
        
        // 전체 가격 계산
        double totalCost=0;
        
        while(true) {
        	
        	// 구매할 물건 입력
        	String item = br.readLine();
        	
        	// EOI 입력시 종료
        	if(item.equals("EOI"))
        		break;
        	
        	// 입력한 물건의 가격 추가
        	for(int i=0;i<items.length;i++)
        		if(items[i].equals(item))
        			totalCost += price[i];
        }
        
        // 전체 가격 출력
        bw.write(String.format("$%.02f", totalCost)+"");
        bw.close();
    } // end of main
} // end of Main class