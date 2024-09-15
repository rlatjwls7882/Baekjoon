import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 테스트 케이스의 수 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T--!=0) {
        	
        	// 13자리 숫자 입력
        	long numbers = Long.valueOf(br.readLine());
        	
        	// ID Key 값 계산
        	long ID_Key = numbers%1000*10;
        	
        	while(numbers!=0) {
        		ID_Key += numbers%10;
        		numbers/=10;
        	}
        	
        	if(ID_Key<1000)
        		ID_Key += 1000;
        	
        	// ID Key 값의 4자리 출력
        	bw.write(String.format("%04d\n", ID_Key%10000));
        }
        
        bw.close();
    } // end of main
} // end of Main class