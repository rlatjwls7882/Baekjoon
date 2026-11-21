import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String string="";
        
        while((string = br.readLine())!=null) {
        	
        	// 소문자, 대문자, 숫자, 공백의 개수 계산
        	int small=0, big=0, whiteSpace=0, num=0;
        	
        	for(int i=0;i<string.length();i++) {
        		
        		if('a'<=string.charAt(i)&&string.charAt(i)<='z')
        			small++;
        		else if('A'<=string.charAt(i)&&string.charAt(i)<='Z')
        			big++;
        		else if(string.charAt(i)==' ')
        			whiteSpace++;
        		else
        			num++;
        	}
        	
        	// 소문자, 대문자, 숫자, 공백의 개수 출력
        	bw.write(small+" "+big+" "+num+" "+whiteSpace+"\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class