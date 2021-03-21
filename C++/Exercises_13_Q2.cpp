#include<iostream>

using namespace std;

int const SIZE = 10;

class student
{
private:
    string name;
    string branch;
    int laval;
    int age;
    float deg1, deg2, deg3;

public:
    student(string name, string branch, int laval, int age, float deg1,  float deg2,  float deg3)
    {
        this->name = name;
        this->branch = branch;
        this->laval = laval;
        this->age = age;
        this->deg1 = deg1;
        this->deg2 = deg2;
        this->deg3 = deg3;
    }

    void print()
    {
        cout<<name<<"\t"<<branch<<"\t"<<laval<<"\t"<<age<<"\t"<<deg1<<"\t"<<deg2<<"\t"<<deg3<<"\n";
    }

    friend void average(student s[SIZE]);
};

void average(student s[SIZE])
{
    float avg;
    for(int i=0; i<SIZE; i++)
    {
        avg =  ( s[i].deg1 + s[i].deg2 + s[i].deg3 ) / 3.0;
        cout<<"\naverage : "<<avg<<"\n";
    }
}

int main()
{
    student s[SIZE]={   student("Ali", "WN", 2, 21, 90, 80, 40),
                        student("Saja", "WN", 2, 19, 40, 93, 66),
                        student("Adel", "WN", 2, 24, 77, 87, 39),
                        student("Ahmed", "WN", 2, 22, 90, 88, 20),
                        student("Duaa", "WN", 2, 20, 100, 98, 10),
                        student("Nabaa", "WN", 2, 19, 91, 83, 19),
                        student("Zahra", "WN", 2, 21, 80, 43, 55),
                        student("Fatma", "WN", 2, 22, 12, 80, 40),
                        student("bagr", "WN", 2, 20, 90, 15, 99),
                        student("saif", "WN", 2, 19, 33, 80, 66),
                    };
    for(int i=0; i<SIZE; i++)
    {
        s[i].print();
    }

    average(s);
    
    

    return 0;
}