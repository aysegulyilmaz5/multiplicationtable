package multiplication;

import java.util.*;

public class MultiplicationTbale {
	public static void main(String[] args) {
		
		int i;
		int j;
		
		for(i=1;i<=9;i++) {
			for(j = 1; j<=9;j++) {
				System.out.println(i+"*"+j+"="+(i*j)+"");
			}
			System.out.println();
		}
	}

}
