import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
        	
        	// 게임의 수 입력
        	String N = br.readLine();
        	
        	// 0 입력시 종료
        	if(N.equals("0")) break;
        	
        	// 게임 승자 입력
        	int John=0, Mary=0;
        	String game = br.readLine();
        	
        	for(int i=0;i<game.length();i++) {
        		if(game.charAt(i)=='0') Mary++;
        		else if(game.charAt(i)=='1') John++;
        	}
        	
        	// 게임 결과 출력
        	bw.write("Mary won "+Mary
        			+" times and John won "+John+" times\n");
        }
        
        bw.close();
    } // end of main
} // end of Main class