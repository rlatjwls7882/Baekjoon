import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 사자와 호랑이의 투표수 계산
        int Tiger=0, Lion=0;
        
        for(int i=0;i<9;i++) {
        	if(br.readLine().equals("Tiger"))
        		Tiger++;
        	else
        		Lion++;
        }
        
        // 선출된 다음 왕 출력
        if(Tiger>Lion)
        	bw.write("Tiger");
        else
        	bw.write("Lion");
        
        bw.close();
    } // end of main
} // end of Main class