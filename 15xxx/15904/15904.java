import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 입력
        String string = br.readLine();
        
        // U, C, P, C의 index 계산
        int indexU = string.indexOf("U");
        int indexC1 = string.indexOf("C",indexU);
        int indexP = string.indexOf("P",indexC1);
        int indexC2 = string.indexOf("C",indexP);
        
        // UCPC를 만들 수 있는지 확인
        if(indexU!=-1
        		&&indexU<indexC1
        		&&indexC1<indexP
        		&&indexP<indexC2)
        	bw.write("I love UCPC");
        else
        	bw.write("I hate UCPC");
        
        bw.close();
    } // end of main
} // end of Main class