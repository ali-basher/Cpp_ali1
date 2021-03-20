#include<iostream>

using namespace std;

int const SIZE = 3;

class car{
private:
    string name;
    string type;
    string direction;
    string color;
    int model;
    int speed;
    int fuel;

public:
    car(string n, string t, string d, string c, int m, int s, int f)
    {
        name = n;
        type = t;
        direction = d;
        color = c;
        model = m;
        speed = s;
        fuel = f;
    }

    void stop()
    {
        direction = "None";
        speed = 0;
    }

    void moveforward()
    {
        direction = "forward";
        speed += 30;
        fuel -= 4;
    }

    void movebackward()
    {
        direction = "backward";
        speed -= 10;
        fuel -= 1;
    }

    void turnleft()
    {
        direction = "left";
        speed += 10;
        fuel -= 1;
    }

    void turnright()
    {
        direction = "right";
        speed += 10;
        fuel -= 1;
    }

    void status()
    {
        cout<<"\n"<<name<<"\t"<<direction<<"\t"<<speed<<"\t"<<fuel<<"\t"<<color<<"\t"<<type<<"\t"<<model<<"\n";
    }


};

int main()
{
    car cars[SIZE] = {
            car("a", "a1", "none", "black", 2019, 230, 40),
            car("b", "b1", "none", "red", 2010, 300, 60),
            car("c", "c1", "none", "green", 2015, 200, 50)
    };
    for(int i=0; i<SIZE; i++)
    {
        cars[i].moveforward();
        cars[i].status();
    }

    cout<<"\n";
    cars[1].turnright();
    cars[1].status();
    cout<<"\n";
    cars[0].turnleft();
    cars[0].status();
    cout<<"\n";
    cars[2].movebackward();
    cars[2].status();
    cout<<"\n";

    return 0;
}