import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 비밀번호 입력
        char[] password = br.readLine().toCharArray();
        
        // N개의 비밀번호 추측
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	char[] guess = br.readLine().toCharArray();
        	
        	// 비밀번호에 포함되어 있는 수의 개수 출력
        	StringBuilder sb = new StringBuilder().append(password);
        	
        	int num=0;
        	
        	for(int i=0;i<4;i++)
        		if(sb.indexOf(guess[i]+"")!=-1) {
        			num++;
        			sb.deleteCharAt(sb.indexOf(guess[i]+""));
        		}
        	
        	bw.write(num+" ");
        	
        	// 올바른 자리에 있는 수의 개수 출력
        	num=0;
        	
        	for(int i=0;i<4;i++)
        		if(password[i]==guess[i])
        			num++;
        	
        	bw.write(num+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class