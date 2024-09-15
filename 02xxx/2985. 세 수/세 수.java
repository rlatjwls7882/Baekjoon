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
		
		int input1 = Integer.valueOf(st.nextToken());
		int input2 = Integer.valueOf(st.nextToken());
		int input3 = Integer.valueOf(st.nextToken());
		
		if(input1+input2==input3)
			bw.write(input1+"+"+input2+"="+input3);
		
		else if(input1-input2==input3)
			bw.write(input1+"-"+input2+"="+input3);
		
		else if(input1*input2==input3)
			bw.write(input1+"*"+input2+"="+input3);
		
		else if(input1/input2==input3)
			bw.write(input1+"/"+input2+"="+input3);
		
		else if(input1==input2+input3)
			bw.write(input1+"="+input2+"+"+input3);
		
		else if(input1==input2-input3)
			bw.write(input1+"="+input2+"-"+input3);
		
		else if(input1==input2*input3)
			bw.write(input1+"="+input2+"*"+input3);
		
		else
			bw.write(input1+"="+input2+"/"+input3);
		
		bw.close();
	} // end of main
} // end of main class