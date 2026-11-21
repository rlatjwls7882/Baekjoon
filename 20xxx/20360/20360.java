import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 양의 정수 n을 이진수로 입력
        String n = Integer.toBinaryString(Integer.valueOf(br.readLine()));
        
        // 1이 나오는 위치를 오름차순으로 출력
        for(int i=n.length()-1;i>=0;i--)
        	if(n.charAt(i)=='1')
        		bw.write(n.length()-i-1+" ");
        
        bw.close();
    } // end of main
} // end of Main class