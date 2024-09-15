import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 캐릭터의 레벨 입력
        int level = Integer.valueOf(br.readLine());
        
        // 지훈이가 선택해야 할 성장의 비약 출력
        
        // 200 ~ 239 1개
        if(level>=229)
        	bw.write("4");
        
        // 200 ~ 229 2개
        else if(level>=218)
        	bw.write("3");
        
        // 200 ~ 219 4개
        else if(level>=206)
        	bw.write("2");
        
        // 200 ~ 209 8개
        else
        	bw.write("1");
        
        bw.close();
    } // end of main
} // end of Main class