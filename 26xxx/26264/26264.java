import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 학생수 N, 메모장에 적힌 답 입력
    	int N = Integer.valueOf(br.readLine());
    	String answer = br.readLine();
    	
    	// 정보보호 분야와 빅데이터 분야가 나온 횟수 계산
    	int sec=0, big=0;
    	
    	for(int i=0;sec+big<N;) {
    		if(answer.charAt(i)=='s') {
    			sec++;
    			i+=8;
    		}
    		
    		else if(answer.charAt(i)=='b') {
    			big++;
    			i+=7;
    		}
    	}
    	
    	// 학생들이 더 관심이 많은 분야 출력
    	if(sec>big)
    		bw.write("security!");
    	else if(big>sec)
    		bw.write("bigdata?");
    	else
    		bw.write("bigdata? security!");
    	
    	bw.close();
    } // end of main
} // end of Main class