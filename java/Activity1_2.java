public class Activity1_2 {
	
	public static void main(String args[]) {
		
		int[] numArray= {10,77,10,54,-11,10};
		int sum=0;
		boolean result=false;
		for(int i=0;i<numArray.length;i++) {
			if(numArray[i]==10) {
				sum=sum+10;
			}
		}
		if(sum==30) result=true;
	
		System.out.println("Final Result :"+result);
	}

}
