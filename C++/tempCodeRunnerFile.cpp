#include <iostream>
#include <iterator>

using namespace std;

#define size 3;

class student{
private:
    string name;
    string branch;
    int laval;
    int deg1;
    int deg2;
    int deg3;
    float avg;
public:
    student(string name, string branch, int laval, int deg1, int deg2, int deg3)
    {
        this ->name = name;
        this ->branch = branch;
        this ->laval = laval;
        this ->deg1 = deg1;
        this ->deg2 = deg2;
        this ->deg3 = deg3;
    }

    void print()
    {
        cout<<name<<"\t"<<branch<<"\t"<<laval<<"\t"<<deg1<<"\t"<<deg2<<"\t"<<deg3<<"\t    "<<avg<<"\n";
    }

    float getavg()
    {
        return avg;
    }

    string getName()
    {
        return name;
    }

    friend void con_avg(student s[size]);
};

void con_avg(student s[size])
{
    int sum=0;

    for(int i=0; i<size; i++)
    {
        sum = s[i].deg1 + s[i].deg2 + s[i].deg3;
        s[i].avg = sum / 3.0;
    }

    


}


int main()
{
    student s[size] = { student("Ali", "NW", 2, 92, 50, 80),
                        student("Saja", "NW", 2, 100, 33, 97),
                        student("nabaa", "NW", 2, 69, 89, 79),
    };

    con_avg(s);
    cout<<"\n";
    
    for(int i=0; i<size; i++)
    s[i].print();

    cout<<"\n";
    
    float maxavg;
    string maxname;
    maxavg = s[0].getavg();
    maxname = s[0].getName();
    for(int i=0; i<size; i++)
    {
        if(maxavg < s[i].getavg())
        maxavg = s[i].getavg();
        maxname = s[i].getName();
    }

    cout<<maxname<<"\t"<<maxavg<<"\n\n";
    
    
    return 0;
}