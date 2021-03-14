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
    student()
    {
        cout<<"Enter the name : ";
        cin>>name;
        cout<<"Enter the age : ";
        cin>>age;
        cout<<"Enter the laval : ";
        cin>>laval;
        cout<<"Enter the oop degree : ";
        cin>>oopDeg;
        
    }

    void print()
    {
        cout<<name<<"\t"<<laval<<"\t"<<age<<"\t"<<oopDeg<<"\n";
    }
    
    int getoopDeg()
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
    student s[SIZE] ;

    int i;
    cout<<"\n\n";
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
   
    cout<<"\n"<<maxname<<"\t"<<maxdeg<<"\n\n";
    
    return 0;
}