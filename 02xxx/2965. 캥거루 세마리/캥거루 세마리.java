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
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());
		int C = Integer.valueOf(st.nextToken());
		int Maxnum = 0;
		
		if(B-A<C-B) { //A와B 사이가 B와C 사이보다 작을 경우
			while(C!=A&&C!=B) { //B와C 사이로 A가 뜀
				A=B+1;
				B=A+1;
				Maxnum+=2;
			}
			
			if(A==C) Maxnum-=2;
			if(B==C) Maxnum-=1;
			
			bw.write(Maxnum+"");
		}
		else {
			while(A!=B&&A!=C) {
				C=B-1;
				B=C-1;
				Maxnum+=2;
			}
			
			if(C==A) Maxnum-=2;
			if(B==A) Maxnum-=1;
			
			bw.write(Maxnum+"");
		}
		bw.close();
	} // end of main
} // end of main class