import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 두 주사위의 면의 수
        int m = Integer.valueOf(br.readLine());
        int n = Integer.valueOf(br.readLine());
        
        // 10을 얻을 수 있는 방법의 수 계산
        int cnt=0;
        
        for(int i=1;i<=m&&i<=9;i++)
        	if(i+n>=10)
        		cnt++;
        
        if(cnt==1)
        	bw.write("There is 1 way to get the sum 10.");
        else
        	bw.write(String.format("There are %d ways to get the sum 10.", cnt));
        
        bw.close();
    } // end of main
} // end of Main class