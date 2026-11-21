import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true) {
        	
            // 양의 소수 c 입력
        	double c = Double.valueOf(br.readLine());
        	
        	// 0 입력시 종료
        	if(c==0) break;
        	
        	// c 이상 튀어나오게 쌓기 위해서 필요한 최소 카드의 수 계산
        	int cards=0;
        	double length=0;
        	
        	for(double i=2;c>length;i++) {
        		length += 1/i;
        		cards++;
        	}
        	
        	// c 이상 튀어나오게 쌓기 위해서 필요한 최소 카드의 수 출력
        	bw.write(String.format("%d card(s)\n", cards));
        }
        
        bw.close();
    } // end of main
} // end of Main class