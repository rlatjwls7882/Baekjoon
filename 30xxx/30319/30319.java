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
    	
    	// 임시 콘테스트 날짜
    	StringTokenizer st = new StringTokenizer(br.readLine(),"-");
    	LocalDate contest = LocalDate.of(Integer.valueOf(st.nextToken())
                                         , Integer.valueOf(st.nextToken())
                                         , Integer.valueOf(st.nextToken()));
    	
    	// 2023 ICPC 타오위안 지역 콘테스트 날짜
    	LocalDate taoyuan = LocalDate.of(2023, 10, 21);
    	
    	// 대회 날짜가 적절한지 확인
    	bw.write(contest.getDayOfYear()+35<=taoyuan.getDayOfYear()?"GOOD":"TOO LATE");
    	
    	bw.close();
    } // end of main
} // end of Main class