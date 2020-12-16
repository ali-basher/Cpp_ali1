# <div align="right"> كودات الرمحلة الثانية <div>
---------------
> Q/ <div align="right"> حساب العمر بالسنوات والشهور والايام والساعات والدقائق والثواني<div>
````C++
#include<iostream>
using namespace std;
//A function of calculating age in years, months, days, hours, minutes, and seconds
//دالة لحساب العمر بالسنوات والشهور والايام والساعات والدقائق والثواني
void age(int year, int month, int day, int y_now, int m_now, int d_now)
{
	int x, y, z, monthm, dayd = 0, minm, h, s, v = 0, ddd = 0;
	int month1[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	//If the birth day is greater than the current day
	if (day > d_now)
	{
		d_now = d_now + month1[month - 2];
		m_now = m_now - 1;
	}
	//If the birth month is greater than the current month
	if (month > m_now)
	{
		y_now = y_now - 1;
		m_now = m_now + 12;
	}

	x = y_now - year;
	y = m_now - month;
	z = d_now - day;

	cout <<"the age :" <<"  "<<x << " Year" << "  " << y << " Month" << "  " << z << " Day" << "\n";

	monthm = y + (x * 12);
    cout << "your age in months : " << monthm << "\n";

	//Calculate your age in daeys + In addition to the days of the leap year
	int month12[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	for (int i = 1; i <= x; i++)
	{
		for (int j = 0; j <= 11; j++)
		{
			dayd = dayd + month12[j];

		}
	}

	for (int r = 0; r <= y - 1; r++)
	{
		ddd = ddd + month12[r];

	}

	for (int f = year; f <= y_now; f++)
	{
		if (f % 4 == 0)
			v = v + 1;
	}

	if ((year % 4 == 0) && (month > 2))
		v = v - 2;

	cout <<"your age in days : " <<dayd + z + v + ddd << "\n";
	//Calculate your age in Hours
	h = (dayd + z + v + ddd) * 24;
	cout << "your age in Hours :" << h << "\n";
	//Calculate your age in minutes
	minm = h * 60;
	cout << "your age in minutes :" << minm << "\n";
	//Calculate your age in Seconds
	s = minm * 60;
	cout << "your age in Seconds :" << s << "\n";

}


int main()
{
	int year, month, day;
	int y_now, m_now, d_now;
	cout << "Enter the year of your birth : ";
	cin >> year;
	cout << "Enter the month of your birth : ";
	cin >> month;
	cout << "Enter the day of your birth : ";
	cin >> day;
	cout << "Enter the year now : ";
	cin >> y_now;
	cout << "Enter the month now : ";
	cin >> m_now;
	cout << "Enter the day now : ";
	cin >> d_now;
	age(year, month, day, y_now, m_now, d_now);

	return 0;
}


````

>## <div align="right"> شرح عمل الكود<div>
><div align="right"> اولا نطلب من المستخدم  ان يدخل تأريخ ميلاده اولا السنة ثم الشهر ثم اليوم  , ثانيا اطلب منه ان يدخل التاريخ الحالي بنفس الشكل الذي سبق  وبعدها نرسل جميع المتغيرات التي تم اخذها من المستخدم الى الدالة التي تحسب العمر \\\\\\\\ نلاحظ ان في الدالة اذا كان يوم الولادة المدخل اكبر من اليوم الحالي فنستعمل مصفوفة الاشهر حتى نتجاوز مشكلة ان يكون  الناتج سالب وكذالك اذا كان شهر الولادة اكبر من الشهر الحالي ننقص السنة الحالية واد نضيف للشهر الحالي 12 وكل هذا لنتجاوز مشكلة ان يكون احد النواتج سالبا لان من المستحيل ان يكون العمر بالسالب \\\\\\\\\\\\\\\  والان حسبنا العمر لكن حسبناه هكذا مثلا انا عمري 20 سنة و11 شهر و 14 يوم ولم نحسب كل العمر كامل بالاشهر او الايام  وبعدها نقوم بذالك اولا اضرب عمري في 12 لكي استنتج عمري بالشهور   وبعدها اقوم بحساب عمري بلايام من خلال مصفوفة الاشهر حيث هذه المصفوفة هي نفسها على مر السنوات فاقوم ببنأ  لوب الخارجي  يبدأ من 1 الى قل او يساوي عمرك بالسنوات و اللوب الداخلي  يبدا من 0 وينتهي الى اقل او يساوي ال 11  و اقوم ببنا متغير جمع يجمع لي عدد ايام كل شهر يمر عليه  ( ولكن  لا ننسى انه يوجد لدينا سنوات كبيسة وكل سنة كبيسة فيها يوم واحد زيادة على السنة نفسها لذالك اقوم ببنأ لوب  يحسب عدد السنوات الكبيسة من عمري واضيف عددها الى عدد الايام ) و ايضا اقوم بحساب  عدد ايام الشهور التي فوق سنوات عمري مثلا ان يكون عمري 20 سنة و11 شهر و 14 يوم لكي احصل على عمري بالايام قمت بحساب الايام خلال عشرون سنة واضفت لها عدد الايام الكبيسة ومن اثم اقوم بحساب عدد ايام الاشهر ال 11 واضيفهن اضيف عدد الايام ال 14 وبذالك اكون قد حصلت على عمري بالايام والان كل هذه الايام اقوم بضربها في 24 لكي احصل على عمري بالساعات ومن ثم اقوم بضربها في 60 لكي احصل على عمري في الدقائق ومن ثم اقوم بضربها في 60 لكي احصل على عمري بالثواني . <div>
----
> [هنا رابط موقع يحسب عمرك بالسنوات والشهور والايام حتى تتأكد من كودك ](https://www.calculateage.net/)
---
> <div align="right">ملاحظة مهمة : احيانا يكون خلط في حساب عمرك لعله فرق يوم واحد لكن لامشكلة فهوم يوم واحد لان انا قمت بذالك وكان الفرق بيني وبين الموقع يوم او يوميين  لكن من ناحية الكود على حد علمي اني قمت  بحساب كلشي فاما ان اكون ان مخطأ او الموقع وجلى من لا يخطأ <div>
----
````Python
------------------------------------------------input----------------------------------------------------------------
Enter the year of your birth : 2000
Enter the month of your birth : 11
Enter the day of your birth : 16
Enter the year now : 2020
Enter the month now : 12
Enter the day now : 15

------------------------------------------------output----------------------------------------------------------------
the age :  20 Year  0 Month  30 Day
your age in months : 240
your age in days : 7334
your age in Hours :176016
your age in minutes :10560960
your age in Seconds :633657600
`````