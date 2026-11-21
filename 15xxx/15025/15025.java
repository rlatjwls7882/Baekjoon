import java.util.Scanner;

public class Main {
        
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        int r = scanner.nextInt();
	
    	if(l==0&&r==0) System.out.printf("Not a moose");
    	else if(l==r) System.out.printf("Even %d",l+r);
    	else System.out.printf("Odd %d",r>l ? r*2 : l*2);            
    }
}