# واجبات سيف بشار 

```` C++
كود في لغة C++ لحساب المعادلة الاتية: 
Q1: Write a program that solve the following math series using functions 
𝑦=1−1/2!+ 1/3!− 1/4!+⋯… 1/𝑛!

`````
````c++
#include <iostream>
#include<math.h>
using namespace std;
int fact(int n) 
{
	if ((n == 0) || (n == 1))
		return 1;
	else
		return n * fact(n - 1);
}
void reslt()
{
	int number;
	double z, sum = 0.0, m;
	cout << "Enter any number : ";
	cin >> number;
	for (int i = 1; i <= number; i++)
	{
		m = fact(i);
		z = 1 / m;
		if (i % 2 == 0)
		{
			sum = sum - z;
		}
		else
		{
			sum = sum + z;
		}
	}
	cout << "Y = " << sum << "\n";
}
int main() 
{
	reslt();
	return 0;
}

`````
