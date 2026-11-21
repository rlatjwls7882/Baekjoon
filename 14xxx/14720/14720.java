import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bf.readLine();
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int beforeMilk=2, maxNum=0;
		
		while(st.hasMoreTokens()) {
			
			int curMilk = Integer.valueOf(st.nextToken());
			
			if(beforeMilk==2&&curMilk==0) { //딸기
				maxNum++;
				beforeMilk=0;
			}
			
			if(beforeMilk==0&&curMilk==1) { //초코
				maxNum++;
				beforeMilk=1;
			}

			if(beforeMilk==1&&curMilk==2) { //바나나
				maxNum++;
				beforeMilk=2;
			}
		}
		
		bw.write(maxNum+"");
		bw.close();
	} // end of main
} // end of main class