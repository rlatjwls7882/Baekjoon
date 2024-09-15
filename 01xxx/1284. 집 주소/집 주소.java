import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			int N = Integer.valueOf(bf.readLine());
			int sum = 0;
			
			if(N==0) break;
			
			while(N!=0) {
				if(N%10==1) sum+=2;
				else if(N%10==0) sum+=4;
				else sum+=3;
				
				sum++; //앞공백 1cm
				N/=10;
			} // end of while N
			
			sum++; //뒤공백 1cm
			bw.write(sum+"\n");
		} //end of while
		
		bw.close();
	} // end of main
} // end of main class