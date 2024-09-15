import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫번째 비밀번호와 두번째 비밀번호 입력
        String firstPass = br.readLine();
        String secondPass = br.readLine();
        
        // 로그인할 수 있는 서로 다른 네 자리 비밀번호의 개수 계산
        int PassNum=1;
        
        for(int i=0;i<4;i++)
        	if(firstPass.charAt(i)!=secondPass.charAt(i))
        		PassNum*=2;
        
        // 로그인할 수 있는 서로 다른 네 자리 비밀번호의 개수 출력
        bw.write(PassNum+"");
        
        bw.close();
    } // end of main
} // end of Main class