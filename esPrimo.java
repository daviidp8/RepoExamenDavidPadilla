public static boolean esPrimo(int n)
{
	int i=5;
	while(i<n)
	{
		if(n%i==0)
			return false;
		i++;
	}
	return true;
}
