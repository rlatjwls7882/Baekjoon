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
		int a=0; //나머지
		
		for(int i=0;i<arr.length;i++)
			a = (a*10+arr[i]-'0')%20000303;
		
		bw.write(a+"");
		bw.close();
		
	} // end of main
} // end of main class