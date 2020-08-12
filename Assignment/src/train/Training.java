package train;

import java.util.*;
public class Training {
	
		
	    static int formingMagicSquare(int[][] s) {
	    	int[]missingArray = {1,2,3,4,5,6,7,8,9};
	    	
	    	for (int i=1;i<10;i++) {
	    		for (int x=0;x<3;x++) {
	    			for(int y=0;y<3;y++) {
	    				if(s[x][y]==i) {
	    					missingArray[i-1]=0;
	    				}
	    			}
	    		}
	    	}
	    	System.out.println(Arrays.toString(missingArray));
	 
	    	int[] extraNumbers = new int[9]; 
	    	int[] sArray2D = new int [9];
	    	
	    	for(int x=0;x<3;x++) {
	    		for(int y=0;y<3;y++) {
	    			sArray2D[x*3+y]=s[x][y];
	    		}
	    	}
	    	
	    	for(int i=0;i<sArray2D.length;i++) {
	    		for(int y=i+1;y<sArray2D.length;y++) {
	    			if(sArray2D[i]==sArray2D[y]) {
	    				for(int k=0;k<extraNumbers.length;k++) {
	    					if(extraNumbers[k]==0) {
	    						extraNumbers[k]=sArray2D[i];
	    						break;
	    					}  					
	    				}
	    			}
	    			
	    		}
	    	}
	    	
	    	System.out.println(Arrays.toString(extraNumbers));
	    	
	    	int cost=0;
	    	for(int i=0;i<missingArray.length;i++) {
	    		if(missingArray[i]!=0) {
	    			for(int z=0;z<extraNumbers.length;z++) {
	    				if(extraNumbers[z]!=0) {
	    					if(missingArray[i]>extraNumbers[z]) {
	    						cost+=missingArray[i]-extraNumbers[z];
	    						extraNumbers[z]=0;
	    						break;
	    					} else if(missingArray[i]<extraNumbers[z]) {
	    						cost+=extraNumbers[z]-missingArray[i];
	    						extraNumbers[z]=0;
	    						break;
	    					}
	    				}
	    			}
	    		}
	    	}
	    	return cost;
	    }
	    
	    public static void main(String[] args) {
	    	int [][]array= {{5,3,4},{1,5,8},{6,4,2}};
			System.out.println(formingMagicSquare(array));
		}
}