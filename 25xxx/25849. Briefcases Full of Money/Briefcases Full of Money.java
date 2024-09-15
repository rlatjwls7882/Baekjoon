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
        
        // 지폐의 액면가
        int[] value = {1, 5, 10, 20, 50, 100};
        
        // 금액이 가장 높은 서류가방의 액면가 찾기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=0, bag=1;
        
        for(int i=0;i<6;i++) {
        	int money = Integer.valueOf(st.nextToken())*value[i];
        	
        	if(max<=money) {
        		max = money;
        		bag = value[i];
        	}
        }
        
        // 금액이 가장 높은 서류가방의 액면가 출력
        bw.write(bag+"");
        
        bw.close();
    } // end of main
} // end of Main class