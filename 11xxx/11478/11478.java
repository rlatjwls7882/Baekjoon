import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 문자열 S 입력
        String S = br.readLine();
        
        // S의 서로 다른 부분 문자열 계산
        HashSet<String> splitS = new HashSet<String>(); 
        
        for(int i=0;i<S.length();i++)
        	for(int j=i;j<S.length();j++)
        		splitS.add(S.substring(i,j+1));
        
        // 서로 다른 부분 문자열의 수 출력
        bw.write(splitS.size()+"");
        bw.close();
    } // end of main
} // end of Main class