import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		String string = br.readLine();
		
		// 잘려진 조각의 총 개수 계산
		int sumStick=0, curStick=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)=='(') { // 여는 괄호는 막대의 시작이거나 레이저의 시작
				curStick++;
			} else {
				if(string.charAt(i-1)=='(') { // 레이저인 경우 모든 막대를 반으로 쪼개줌
					curStick--;
					sumStick += curStick;
				} else { // 막대의 끝인 경우 끝부분에 남아있는 막대 1개를 더해줌
					sumStick++;
					curStick--;
				}
			}
		}
		
		bw.write(Integer.toString(sumStick));
		
		bw.close();
	} // end of main()
} // end of Main class