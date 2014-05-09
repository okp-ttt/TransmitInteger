package transmit;

import java.util.*;

public class IntToEng {
	
	public static String[] ones_place = {"zero","one","two","three","four",
			"five","six","seven","eight","nine"};
	public static String[] teens = {"ten","eleven","twelve","thirteen","fourteen","fifteen",
		"sixteen","eighteen","nineteen"};
	public static String[] tens_place = {"twenty","thirty","forty","fifty",
		"sixty","seventy","eighty","ninety"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int input = sc.nextInt();
	        
	    System.out.println(translateEng(input));
	}
	
	// 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	if(0<=n && n<10){
    		return ones_place[n];
    	}else if(n<=10 && n<20){
    		return teens[n-10];
    	}
        return "null";
    }
}
