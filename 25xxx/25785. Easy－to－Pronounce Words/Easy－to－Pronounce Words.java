import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 단어 입력
        String word = br.readLine();
        
        // 모음을 숫자로 변경
        word = word.replace("a", "1").replace("e", "1").replace("i", "1").replace("o", "1").replace("u", "1");
        
        // 모음과 자음이 번갈아 오는지 확인
        boolean isEasy=true;
        
        for(int i=0;i<word.length()-1;i++)
        	if(!(('a'<=word.charAt(i)&&word.charAt(i)<='z'&&word.charAt(i+1)=='1')
        			||(word.charAt(i)=='1'&&'a'<=word.charAt(i+1)&&word.charAt(i+1)<='z')))
        		isEasy=false;
        
        // 주어진 단어가 발음하기 쉬운 단어인지 출력
        if(isEasy)
        	bw.write("1");
        else
        	bw.write("0");
        
        bw.close();
    } // end of main
} // end of Main class