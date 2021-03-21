#include<iostream>

using namespace std;

int const SIZE = 4;

class rectangle{
private:
    float x, y;
    float area;

public:

static int contur ;

rectangle()
{
    cout<<"Enter info for rectangle(x, y) : ";
    cin>>x>>y;
}

rectangle(float x, float y)
{
    this->x = x;
    this->y = y;
}

void print();

float gitarea()
{
    return (x * y);
}

friend void biggest(rectangle r[SIZE]);

};

void rectangle::print()
{
    area = x * y;
    cout<<"rectangle "<<contur<<" area is : "<<area<<"\n";
    contur++;
}

void biggest(rectangle r[SIZE])
{
    float maxarea;
    maxarea = r[0].gitarea();

    for(int i=0; i<SIZE; i++)
    {
        if(maxarea < r[i].gitarea())
        {
            maxarea = r[i].gitarea();
        }
    }

    cout<<"\n"<<"The biggest is : "<<maxarea<<"\n";  
}

int rectangle::contur = 1;

int main()
{
    rectangle r[SIZE] = {   rectangle(5, 6),
                            rectangle(7, 8),
                            rectangle(3, 5),
                            rectangle(4, 9)
                        };
   
    for(int i=0; i<SIZE; i++)
    {
        r[i].print();
    }

    biggest(r);
    cout<<endl;

   



    return 0;
}