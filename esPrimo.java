public static boolean esPrimo(int n)
{
	int i=5;
	if(n<1){
		return false;
	}
	while(i<n){
		if(n%1==0){
			return false;
		}
		i++;
	}
	return true;
}