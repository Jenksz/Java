class TV {

	public static void main (String[] args)
	{
		int channel;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp;
		do
		{
			temp = in.readline();
			channel = Integer.valueOf(temp).intValue();
			switch(channel)
			{
				case 1:
					System.out.println("Cartoon Channel");
					break;
				case 2:
					System.out.println("News");
					break;
			}
		
		}while(true);
		
	}
}