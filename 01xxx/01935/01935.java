import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 피연산자의 개수 N, 후위 표기식 입력
		int N = Integer.valueOf(br.readLine());
		String equation = br.readLine();
		
		// 피연산자 입력
		double[] operand = new double[N];
		for(int i=0;i<N;i++)
			operand[i] = Double.valueOf(br.readLine());
		
		// 식 계산
		LinkedList<Double> stack = new LinkedList<>();
		for(int i=0;i<equation.length();i++) {
			if(equation.charAt(i)=='*') {
				stack.push(stack.pop()*stack.pop());
			} else if(equation.charAt(i)=='+') {
				stack.push(stack.pop()+stack.pop());
			} else if(equation.charAt(i)=='-') {
				double A = stack.pop();
				double B = stack.pop();
				stack.push(B-A);
			} else if(equation.charAt(i)=='/') {
				double A = stack.pop();
				double B = stack.pop();
				stack.push(B/A);
			} else {
				stack.push(operand[equation.charAt(i)-'A']);
			}
		}
		
		bw.write(String.format("%.02f", stack.peekFirst()));

		bw.close();
	} // end of main()
} // end of Main class