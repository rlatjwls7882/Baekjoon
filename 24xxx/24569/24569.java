import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        // 팀의 선수의 수 입력
        int N = Integer.valueOf(br.readLine());
        
        // 별이 40개가 넘는 선수의 수 계산
        int player=0;
        
        for(int i=0;i<N;i++)
        	if(Integer.valueOf(br.readLine())*5-Integer.valueOf(br.readLine())*3>40)
        		player++;
        
        // 별이 40개가 넘는 선수의 수와 골드 팀인지 출력
        bw.write(player+"");
        
        if(player==N)
        	bw.write("+");
        
        bw.close();
    } // end of main
} // end of Main class