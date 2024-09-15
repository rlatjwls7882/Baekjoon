import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 그릇의 모양 입력
        String dishes = br.readLine();
        
        // 그릇의 높이 계산
        int h=0;
        char beforeShape=',';
        
        for(int i=0;i<dishes.length();i++) {
        	if(dishes.charAt(i)=='('&&beforeShape=='(')
        		h+=5;
        	else if(dishes.charAt(i)=='(')
        		h+=10;
        	else if(dishes.charAt(i)==')'&&beforeShape==')')
        		h+=5;
        	else
        		h+=10;
        	
        	beforeShape = dishes.charAt(i);
        }
        
        // 그릇의 높이 출력
        bw.write(h+"");
        
        bw.close();
    } // end of main
} // end of Main class