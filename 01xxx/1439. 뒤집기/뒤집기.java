import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S 입력
        String S = br.readLine();
        
        // 연속된 1의 덩어리와 0의 덩어리의 개수 계산
        int mass1=0, mass0=0;
        
        for(int i=1;i<S.length();i++)
        	if(S.charAt(i-1)=='0'&&S.charAt(i)=='1')
        		mass1++;
        	else if(S.charAt(i-1)=='1'&&S.charAt(i)=='0')
        		mass0++;
        
        if(S.charAt(0)=='0')
        	mass0++;
        else
        	mass1++;
        
        // 모두 같은 숫자로 만드는 최소 횟수 출력
        bw.write((mass1<mass0?mass1:mass0)+"");
        
        bw.close();
    } // end of main
} // end of Main class