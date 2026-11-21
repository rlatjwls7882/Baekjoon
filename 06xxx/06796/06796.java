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
		
		int A=0, B=0;
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.valueOf(st.nextToken());
			
			if(num==1) {
				if(st.nextToken().equals("A")) {
					A = Integer.valueOf(st.nextToken());
				} else {
					B = Integer.valueOf(st.nextToken());
				}
			} else if(num==2) {
				if(st.nextToken().equals("A")) {
					bw.write(A+"\n");
				} else {
					bw.write(B+"\n");
				}
			} else if(num==3) {
				if(st.nextToken().equals("A")) {
					if(st.nextToken().equals("A")) {
						A = A+A;
					} else {
						A = A+B;
					}
				} else {
					if(st.nextToken().equals("A")) {
						B = B+A;
					} else {
						B = B+B;
					}
				}
			} else if(num==4) {
				if(st.nextToken().equals("A")) {
					if(st.nextToken().equals("A")) {
						A = A*A;
					} else {
						A = A*B;
					}
				} else {
					if(st.nextToken().equals("A")) {
						B = B*A;
					} else {
						B = B*B;
					}
				}
			} else if(num==5) {
				if(st.nextToken().equals("A")) {
					if(st.nextToken().equals("A")) {
						A = A-A;
					} else {
						A = A-B;
					}
				} else {
					if(st.nextToken().equals("A")) {
						B = B-A;
					} else {
						B = B-B;
					}
				}
			} else if(num==6) {
				if(st.nextToken().equals("A")) {
					if(st.nextToken().equals("A")) {
						A = A/A;
					} else {
						A = A/B;
					}
				} else {
					if(st.nextToken().equals("A")) {
						B = B/A;
					} else {
						B = B/B;
					}
				}
			} else {
				break;
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class