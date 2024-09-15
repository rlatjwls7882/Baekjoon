import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 이니셜의 글자수 n
        int n = Integer.valueOf(br.readLine());
        
        // 이전 사람의 이니셜과 내가 입력하려는 이니셜
        String previous = br.readLine();
        String myInput = br.readLine();
        
        // 조이스틱을 움직이는 최소 횟수 계산
        int move=0;
        
        for(int i=0;i<n;i++) {
        	int front = previous.charAt(i)-myInput.charAt(i); if(front<0) front+=26;
        	int back = myInput.charAt(i)-previous.charAt(i); if(back<0) back+=26;
        	
        	move += front<back?front:back;
        }
        
        bw.write(move+"");
        
        bw.close();
    } // end of main
} // end of Main class