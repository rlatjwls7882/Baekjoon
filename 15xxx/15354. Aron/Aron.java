import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 앞에 줄서있는 사람 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 아론이 몇번째 고객인지 계산
        String before = " ";
        int Aron=1;
        
        while(N--!=0) {
        	String now = br.readLine();
        	
        	// 옷색이 다른 경우
        	if(!before.equals(now)) {
        		before=now;
        		Aron++;
        	}
        }
        
        // 아론이 몇번째 고객인지 출력
        bw.write(Aron+"");
        bw.close();
    } // end of main
} // end of Main class