//Задание 10. Вывести все простые числа от 2 до 100
class primeNumbers{
	public static void main(String[] args) {
		short a, b;
		boolean flag = false;
		for (a=2; a<=100; a++)
			{
			for(b=2; a>=b*b; b++)
				if(a%b==0) {flag = true; break;}
			if (flag == false) {
				System.out.println(a);
				}
			else {
				flag = false;
				}
			}
	}
}