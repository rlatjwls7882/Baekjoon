import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 첫 단어의 알파벳 종류 확인
        int[] first = new int[26];
        String word = br.readLine();
        
        for(int i=0;i<word.length();i++)
        	first[word.charAt(i)-'a']++;
        
        // 두번째 단어의 알파벳 종류 확인
        int[] second = new int[26];
        word = br.readLine();
        
        for(int i=0;i<word.length();i++)
        	second[word.charAt(i)-'a']++;
        
        // 두 단어가 애너그램이 되도록 제거해야하는 문자의 최소 개수 계산
        int remove=0;
        
        for(int i=0;i<26;i++)
        	remove += Math.abs(first[i]-second[i]);
        
        bw.write(remove+"");
        
        bw.close();
    } // end of main
} // end of Main class