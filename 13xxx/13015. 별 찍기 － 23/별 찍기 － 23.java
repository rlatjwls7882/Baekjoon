import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());

		// 첫번째 줄
		for(int i=0;i<N;i++)
			bw.write("*");
		for(int i=0;i<2*N-3;i++)
			bw.write(" ");
		for(int i=0;i<N;i++)
			bw.write("*");
		bw.write("\n");

		// N>2일때의 두번째~N-2번째 줄
		for(int i=1;i<N-1;i++) {

			// *   *
			//  *   *
			//   *   *
			for(int j=0;j<i;j++)
				bw.write(" ");
			bw.write("*");
			for(int j=0;j<N-2;j++)
				bw.write(" ");
			bw.write("*");

			//           *   *
			//          *   *
			//         *   *
			for(int j=0;j<2*(N-i)-3;j++)
				bw.write(" ");
			bw.write("*");
			for(int j=0;j<N-2;j++)
				bw.write(" ");
			bw.write("*");

			bw.write("\n");
		}

		// N번째 줄
		for(int i=0;i<N-1;i++)
			bw.write(" ");
		bw.write("*");

		for(int j=0;j<N-2;j++)
			bw.write(" ");
		bw.write("*");

		for(int j=0;j<N-2;j++)
			bw.write(" ");
		bw.write("*");
		bw.write("\n");

		// N>2일때의 N+1번째~2N-2번째 줄
		for(int i=1;i<N-1;i++) {

			//   *   *
			//  *   *
			// *   *
			for(int j=0;j<N-i-1;j++)
				bw.write(" ");
			bw.write("*");
			for(int j=0;j<N-2;j++)
				bw.write(" ");
			bw.write("*");

			//         *   *
			//          *   *
			//           *   *
			for(int j=0;j<2*i-1;j++)
				bw.write(" ");
			bw.write("*");
			for(int j=0;j<N-2;j++)
				bw.write(" ");
			bw.write("*");

			bw.write("\n");
		}

		// 마지막 줄
		for(int i=0;i<N;i++)
			bw.write("*");
		for(int i=0;i<2*N-3;i++)
			bw.write(" ");
		for(int i=0;i<N;i++)
			bw.write("*");

		bw.close();
	} // end of main()
} // end of Main class