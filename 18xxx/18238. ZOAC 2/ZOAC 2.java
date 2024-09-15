import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String string = br.readLine();
        
        // 문자열을 출력하는데 걸리는 시간 계산
        int index=65, time=0;
        for(int i=0;i<string.length();i++) {
        	time += Math.min(Math.abs(string.charAt(i)-index)
                             , 26-Math.abs(string.charAt(i)-index));
        	index=string.charAt(i);
        }
        
        bw.write(time+"");
        
        bw.close();
    } // end of main
} // end of Main class