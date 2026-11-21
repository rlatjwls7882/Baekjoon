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
        
        while(true) {
        	
        	// 일, 월, 년 입력
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int day = Integer.valueOf(st.nextToken());
        	int month = Integer.valueOf(st.nextToken());
        	int year = Integer.valueOf(st.nextToken());
        	
        	// 0 0 0 입력시 종료
        	if(day==0&&month==0&&year==0)
        		break;
        	
        	// 적절한 날짜인지 확인
        	try {
        		LocalDate ld = LocalDate.of(year, month, day);
        		bw.write("Valid\n");
        		
			} catch (Exception e) {
				bw.write("Invalid\n");
			}
        }
        
        bw.close();
    } // end of main
} // end of Main class