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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			int c = Integer.valueOf(st.nextToken());
			int d = Integer.valueOf(st.nextToken());
			if(a==-1&&b==-1&&c==-1&&d==-1) {
				break;
			}
			
			if(a==-1||b==-1) {
				int case1 = d-c;
				double case2 = d/(double)c;
				
				if(a==-1) {
					if(c-case1==b&&1<=b-case1&&b-case1<=10000) {
						bw.write(b-case1+"\n");
					} else if(c/case2==b&&1<=b/case2&&b/case2<=10000&&b/case2==(int)(b/case2)) {
						bw.write((int)(b/case2)+"\n");
					} else {
						bw.write("-1\n");
					}
				} else {
					if(c-case1*2==a&&1<=c-case1&&c-case1<=10000) {
						bw.write(c-case1+"\n");
					} else if(c/case2/case2==a&&1<=c/case2&&c/case2<=10000&&c/case2==(int)(c/case2)) {
						bw.write((int)(c/case2)+"\n");
					} else {
						bw.write("-1\n");
					}
				}
			} else {
				int case1 = b-a;
				double case2 = b/(double)a;
				
				if(c==-1) {
					if(b+case1*2==d&&1<=b+case1&&b+case1<=10000) {
						bw.write(b+case1+"\n");
					} else if(b*case2*case2==d&&1<=b*case2&&b*case2<=10000&&b*case2==(int)(b*case2)) {
						bw.write((int)(b*case2)+"\n");
					} else {
						bw.write("-1\n");
					}
				} else {
					if(c-case1==b&&1<=c+case1&&c+case1<=10000) {
						bw.write(c+case1+"\n");
					} else if(b*case2==c&&1<=c*case2&&c*case2<=10000&&c*case2==(int)(c*case2)) {
						bw.write((int)(c*case2)+"\n");
					} else {
						bw.write("-1\n");
					}
				}
			}
		}
		
		bw.close();
	} // end of main()
} // end of Main class