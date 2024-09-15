import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		
		StringTokenizer Ulim = new StringTokenizer(br.readLine());
		StringTokenizer Startlink = new StringTokenizer(br.readLine());
		
		// 울림 제미니스가 역전패를 했는지 확인
		int Uscore=0, Sscore=0;
		boolean isWinning=false, reverse=false;
		
		for(int i=0;i<18;i++) {
			if(i%2==0) {
				Uscore += Integer.valueOf(Ulim.nextToken());
			} else {
				Sscore += Integer.valueOf(Startlink.nextToken());
			}
			
			if(!isWinning) {
				if(Uscore>Sscore) {
					isWinning=true;
				}
			} else {
				if(Uscore<Sscore) {
					reverse=true;
					break;
				}
			}
		}
		
		bw.write(reverse?"Yes":"No");
		
		bw.close();
	} // end of main()
} // end of Main class