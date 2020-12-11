# واجبات سيف بشار 

```` C++
كود في لغة C++ لحساب المعادلة الاتية: 
Q1: Write a program that solve the following math series using functions 𝑦=1−1/2!+ 1/3!− 1/4!+⋯… 1/𝑛!

`````
````c++
#include <iostream>
#include<math.h>
using namespace std;
int fact(int n) {
	if ((n == 0) || (n == 1))
		return 1;
	else
		return n * fact(n - 1);
}
int main() {
	int n;
	float sum = 0, z, m;
	cin >> n;
	for (int i = 1; i <= n; i++)
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
	cout << sum << "\n";
	//	cout << "Factorial of " << n << " is " << m;
	return 0;
}
`````
