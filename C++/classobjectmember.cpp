#include <iostream>

using namespace std;

class brithday{
    private:
    int year;
    int month;
    int day;

    public:
    brithday(int year, int month, int day)
    {
        this->year = year;
        this->month = month;
        this->day = day;
    }

    void print()
    {
        cout<<year<<"\t"<<month<<"\t"<<day<<"\n";
    }
};

class student{
    private:
    string name;
    int age;
    int laval;
    brithday date;

    public:
    student(string name, int age, int laval, int year, int month, int day) : date(year, month, day)
    {
        this->name = name;
        this->age = age;
        this->laval = laval;
    }

    void print()
    {
        cout<<name<<"\t"<<age<<"\t"<<laval<<"\n";
        date.print();
    }

};

int main()
{
    student *s;
    s = new student("Ali", 21, 2, 2000, 11, 16);
    s->print();
    delete s; 

    return 0;
}