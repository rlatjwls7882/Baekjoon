import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(bf.readLine());
		
		while(N--!=0) {
			int J = Integer.valueOf(bf.readLine());
			
			if(J==1) { //상자크기가 1인경우
				bw.write("#\n\n");
				continue;
			}
			
			for(int i=0;i<J;i++) //윗변
				bw.write("#"); bw.write("\n");
			
			for(int i=0;i<J-2;i++) {
				bw.write("#"); //왼쪽변
				
				for(int j=0;j<J-2;j++) //상자 속 J
					bw.write("J");
				
				bw.write("#\n"); //오른쪽 변
			} // end of for(int i=0;i<J-2;i++)
			
			for(int i=0;i<J;i++) //아랫 변
				bw.write("#"); bw.write("\n\n");
			
		} // end of while(N--!=0)
		
		
		bw.close();
	} // end of main
} // end of main class