import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 생일의 수 n 입력
        int n = Integer.valueOf(br.readLine());
        
        while(n-->0) {
        	
        	// 나이 계산
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	LocalDate age = LocalDate.of(2007, 2, 27);
        	
        	age = age.minusYears(Integer.valueOf(st.nextToken()));
        	age = age.minusMonths(Integer.valueOf(st.nextToken())-1);
        	age = age.minusDays(Integer.valueOf(st.nextToken())-1);
        	
        	// 18세 이상인 경우 투표 가능
        	if(age.getYear()>=18)
        		bw.write("Yes\n");
        	else
        		bw.write("No\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class