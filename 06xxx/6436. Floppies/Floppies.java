import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for(int i=1;;i++) {
        	
        	// 문자의 개수 입력
        	int character = Integer.valueOf(br.readLine());
        	
        	// 문자의 개수가 0인 경우 종료
        	if(character==0) break;
        	
        	// 파일을 압축 후 uuencode 진행 (파일의 줄 수 계산)
        	double line = (double)character/248*3;
        	
        	// 필요한 플로피 디스크의 수 출력
        	bw.write(String.format("File #%d\nJohn needs %.0f floppies.\n\n"
                                   , i, Math.ceil(line/30000)));
        }
        
        bw.close();
    } // end of main
} // end of Main class