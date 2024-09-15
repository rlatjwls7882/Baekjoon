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
        
        // 요일을 검색할 날짜 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        LocalDate date = LocalDate.of(2007, Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
        
        // 검색한 날짜의 요일 출력
        bw.write(date.getDayOfWeek().toString().substring(0,3)+"");
        bw.close();
    } // end of main
} // end of Main class