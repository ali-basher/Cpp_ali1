#include <iostream>

using namespace std;
int const SIZE = 3;

class student{
private:
    string name;
    int laval;
    int age;
    int oopDeg;
    
public:
    student(string name, int laval, int age, int oopDeg)
    {
        this ->name = name;
        this ->laval = laval;
        this ->age = age;
        this ->oopDeg = oopDeg;
        
    }
    void print()
    {
        cout<<name<<"\t"<<laval<<"\t"<<age<<"\t"<<oopDeg<<"\n";
    }
    float getoopDeg()
    {
        return oopDeg;
    }
    string getName()
    {
        return name;
    }

    
};


int main()
{
    student s[SIZE] = { student("Ali", 2, 19, 50),
                        student("Saja", 2, 22, 69),
                        student("nabaa", 2, 21, 89)
    };
    int i;
    for(i=0; i<SIZE; i++)
    {
        s[i].print();
    }
    int maxdeg;
    string maxname;
    maxdeg = s[0].getoopDeg();
    maxname = s[0].getName();
    for(int i=0; i<SIZE; i++)
    {
        if(maxdeg < s[i].getoopDeg())
        {
            maxdeg = s[i].getoopDeg();
            maxname = s[i].getName();   
        }
    }
    cout<<maxname<<"\t"<<maxdeg<<"\n\n";
    
    return 0;
}