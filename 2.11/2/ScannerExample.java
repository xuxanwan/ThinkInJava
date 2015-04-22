import java.util.Scanner;

public class ScannerExample{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String temp = sc.next();
			System.out.println(temp);
		}
	}
}