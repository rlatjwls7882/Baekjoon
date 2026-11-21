import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열의 길이와 문자열 입력
        int N = Integer.valueOf(br.readLine());
        String string = br.readLine();
        
        // 각 문자가 등장한 횟수 계산
        int[] letter = new int[26];
        
        for(int i=0;i<N;i++)
        	letter[string.charAt(i)-'a']++;
        
        // 가장 많이 등장한 문자 계산
        int max=0;
        
        for(int i=0;i<26;i++)
        	if(max<letter[i]) max=letter[i];
        
        // 가장 많이 등장한 문자 출력
        for(int i=0;i<26;i++)
        	if(max==letter[i])
        		bw.write((char)(i+'a')+" "+letter[i]);
        
        bw.close();
    } // end of main
} // end of Main class