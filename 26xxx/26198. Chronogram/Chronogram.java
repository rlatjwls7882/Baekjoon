import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 각 문자에 대한 값 생성
        HashMap<Character, Integer> chronogram = new HashMap<Character, Integer>();
        chronogram.put('I', 1);
        chronogram.put('V', 5);
        chronogram.put('X', 10);
        chronogram.put('L', 50);
        chronogram.put('C', 100);
        chronogram.put('D', 500);
        chronogram.put('M', 1000);
        
        // 테스트 케이스의 수 T 입력
        int T = Integer.valueOf(br.readLine());
        
        while(T-->0) {
        	
        	// 문자열 입력
        	String string = br.readLine();
        	
        	// 연도 계산
        	int year=0;
        	
        	for(int i=0;i<string.length();i++)
        		try { year += chronogram.get(string.charAt(i));}
        		catch (Exception e) {}
        	
        	// 연도 출력
        	bw.write(year+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class