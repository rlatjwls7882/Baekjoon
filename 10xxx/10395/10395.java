import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 케이블의 연결 포인트 입력
        String X = br.readLine();
        String Y = br.readLine();
        
        // 두 케이블이 호환되는지 확인
        boolean isCompatible = true;
        
        for(int i=0;i<X.length();i+=2)
        	if(X.charAt(i)==Y.charAt(i)) {
        		isCompatible=false;
        		break;
        	}
        
        // 두 케이블이 호환되는지 출력
        if(isCompatible)
        	bw.write("Y");
        else
        	bw.write("N");
        
        bw.close();
    } // end of main
} // end of Main class