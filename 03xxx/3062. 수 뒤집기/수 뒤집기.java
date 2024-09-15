import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.valueOf(br.readLine());
        while(T--!=0) {
        	
        	// N과 뒤집은 N의 합 계산
        	String N = br.readLine();
        	
        	StringBuilder reversedN = new StringBuilder();
        	for(int i=N.length()-1;i>=0;i--)
        		reversedN.append(N.charAt(i));
        	
        	int sum = Integer.valueOf(N) + Integer.valueOf(reversedN.toString());
        	
        	// 합이 좌우 대칭인지 확인
        	String sumString = String.valueOf(sum);
        	String isPalindrome = "YES\n";

        	for(int i=0;i<N.length()/2;i++)
        		if(sumString.charAt(i)!=sumString.charAt(sumString.length()-1-i)) {
        			isPalindrome = "NO\n";
        			break;
        		}
        	
        	bw.write(isPalindrome);
        }
        	
        bw.close();
    } // end of main
} // end of Main class