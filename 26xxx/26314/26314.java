import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 확인해야하는 이름의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        while(N-->0) {
        	
        	// 모음을 모두 1로 바꾸어 입력
        	String name = br.readLine();
        	String replacename = name.replace("a", "1").replace("e", "1").replace("i", "1").replace("o", "1").replace("u", "1");
        	
        	// 이름에 들어있는 모음의 수 계산
        	int vowel=0;
        	
        	for(int i=0;i<replacename.length();i++) {
        		if(replacename.charAt(i)=='1')
        			vowel++;
        		else
        			vowel--;
        	}
        	
        	// 모음이 자음보다 많은지 출력
        	if(vowel>0)
        		bw.write(name+"\n1\n");
        	else
        		bw.write(name+"\n0\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class