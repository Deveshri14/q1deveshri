package exam;

   class Exam
		{

	
		static int odd_digits(int n)
		{
			n=3;
			if (n< 10)
				return n;
			else if (n / 10 < 10)
				return 9;
			else if (n / 100 < 10)
				return 9 + n - 99;
			else if (n / 1000 < 10)
				return 9 + 900;
			else if (n / 10000 < 10)
				return 909 + n - 9999;
			else
				return 90909;
		}

		// Driver code
		public static void main(String []args)
		{
			int n = 893;

			System.out.println(odd_digits(n));
		}
		}



	


