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
        
        // 등장한 알파벳의 개수 계산
        int[] alphabet = new int[26];
        
        for(int i=0;i<string.length();i++)
        	alphabet[string.charAt(i)-'a']++;
        
        // 홀수개의 문자와 짝수개의 문자의 개수 계산
        int odd=0, even=0;
        
        for(int i=0;i<26;i++) {
        	if(alphabet[i]!=0&&alphabet[i]%2==0)
        		even++;
        	else if(alphabet[i]!=0)
        		odd++;
        }
        
        // odd or even 판단
        if(even>0&&odd>0)
        	bw.write("2");
        else if(even>0)
        	bw.write("0");
        else
        	bw.write("1");
        
        bw.close();
    } // end of main
} // end of Main class