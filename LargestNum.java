class LargestNum
{
	static public void main(String[] args)
	{
		int lar, a = 10, b = 2, c = 20;
        int exp;
		if( a>b && a>c){
			lar=a;
		}
		else if( b>a && b>c){
			lar=b;
		}
		else{
			lar=c;
		}
		System.out.println("Largest = "+lar);
	}
}