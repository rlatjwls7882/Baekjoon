import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] arr = bf.readLine().toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='0') {
				bw.write("0000\n");
				bw.write("0  0\n");
				bw.write("0  0\n");
				bw.write("0  0\n");
				bw.write("0000\n\n");
			}
			else if(arr[i]=='1') {
				bw.write("   1\n");
				bw.write("   1\n");
				bw.write("   1\n");
				bw.write("   1\n");
				bw.write("   1\n\n");
			}
			else if(arr[i]=='2') {
				bw.write("2222\n");
				bw.write("   2\n");
				bw.write("2222\n");
				bw.write("2\n");
				bw.write("2222\n\n");
			}
			else if(arr[i]=='3') {
				bw.write("3333\n");
				bw.write("   3\n");
				bw.write("3333\n");
				bw.write("   3\n");
				bw.write("3333\n\n");
			}
			else if(arr[i]=='4') {
				bw.write("4  4\n");
				bw.write("4  4\n");
				bw.write("4444\n");
				bw.write("   4\n");
				bw.write("   4\n\n");
			}
			else if(arr[i]=='5') {
				bw.write("5555\n");
				bw.write("5\n");
				bw.write("5555\n");
				bw.write("   5\n");
				bw.write("5555\n\n");
			}
			else if(arr[i]=='6') {
				bw.write("6666\n");
				bw.write("6\n");
				bw.write("6666\n");
				bw.write("6  6\n");
				bw.write("6666\n\n");
			}
			else if(arr[i]=='7') {
				bw.write("7777\n");
				bw.write("   7\n");
				bw.write("   7\n");
				bw.write("   7\n");
				bw.write("   7\n\n");
			}
			else if(arr[i]=='8') {
				bw.write("8888\n");
				bw.write("8  8\n");
				bw.write("8888\n");
				bw.write("8  8\n");
				bw.write("8888\n\n");
			}
			else if(arr[i]=='9') {
				bw.write("9999\n");
				bw.write("9  9\n");
				bw.write("9999\n");
				bw.write("   9\n");
				bw.write("   9\n\n");
			}
		}

		bw.close();
	} // end of main
} // end of main class