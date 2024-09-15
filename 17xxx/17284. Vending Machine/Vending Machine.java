import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// 자판기와 정웅이가 가지고 있는 돈 생성
    	int[] vending_machine = {500, 800, 1000};
    	int money = 5000;
    	
    	// 정웅이가 자판기에서 음료를 뽑고 남은 거스름돈 계산
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	while(st.hasMoreTokens())
    		money -= vending_machine[Integer.valueOf(st.nextToken())-1];
    	
    	// 거스름돈 출력
    	bw.write(money+"");
    	bw.close();
    } // end of main
} // end of Main class