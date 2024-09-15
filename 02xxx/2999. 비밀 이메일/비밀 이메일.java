import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 상근이가 받은 메시지 입력
        String message = br.readLine();
        
        // R<=C, R*C==message.length()인 R의 최댓값 계산
        int R=0;
        
        for(int i=1;i<=message.length()/2;i++)
        	if(i>message.length()/i)
        		break;
        	else if(message.length()%i==0)
        		R=i;
        
        // 받은 메시지를 해독한 결과 출력
        for(int i=0;i<message.length();i++)
        	bw.write(message.charAt(i*R%message.length()+i*R/message.length()));

        bw.close();
    } // end of main
} // end of Main class