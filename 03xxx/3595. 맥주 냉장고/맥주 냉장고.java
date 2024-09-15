import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		int n = Integer.valueOf(br.readLine());

		// 겉넓이가 가장 작은 냉장고의 크기 계산
		int size=10_000_000, a=1, b=1, c=1;

		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				for(int j=1;i*j<=n;j++) {
					int k=n/(i*j);
					int curSize = i*j+j*k+k*i;
					if(n%(i*j)==0&&curSize<size) {
						size=curSize;
						a=i;
						b=j;
						c=k;
					}
				}
			}
		}

		bw.write(String.format("%d %d %d", a, b, c));

		bw.close();
	} // end of main()
} // end of Main class