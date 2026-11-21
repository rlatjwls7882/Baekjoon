import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	// a는 2~100까지 반복(a,b,c,d>1)
    	for(int a=2;a<=100;a++)
    		
    		//b,c,d 각각 a보다 작고 b<c<d를 만족하는 동안 반복
    		for(int b=2;b<a;b++)
    			for(int c=b+1;c<a;c++)
    				for(int d=c+1;d<a;d++)
    					
    					//b^3+c^3+d^3==a^3일때
    					if(b*b*b+c*c*c+d*d*d==a*a*a)
    						
    						//Cube = a, Triple = (b,c,d)
    						bw.write("Cube = "+a+", Triple = ("+b+","+c+","+d+")\n");
    	
    	bw.close();
    } // end of main
} // end of Main class