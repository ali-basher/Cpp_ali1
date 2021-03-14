#include<iostream>
using namespace std;

struct node
{
    int data;
    node* next;
};

node* head = NULL;

int sum = 0;
void insertNode()
{
    node* new_node, * last;
    new_node = new node;

    cout << "Enter any number for linked list : ";
    cin >> new_node->data;


    if (head == NULL)
    {
        head = new_node;
        new_node->next = NULL;
    }
    else
    {
        last = head;

        for (; last->next != NULL; )
        {
            last = last->next;
        }

        last->next = new_node;
        new_node->next = NULL;

    }
}

void printNode()
{
    node* current_node;

    if (head == NULL)
    {
        cout << "The linked list is empty.\n";
    }

    else
    {
        current_node = head;
        for (; current_node != NULL;)
        {
            cout << current_node->data << "\t";
            current_node = current_node->next;
        }
    }
    cout << endl;
}

void counter()
{
    node* a;
    a = head;
    for (; a != NULL; )
    {
        if (a->data % 2 != 0)
            sum = sum + 1;
        a = a->next;
    }
}

void deleodd()
{
    counter();
    node* a, * b, * c, * q, * p;
    for (int i = 1; i <= sum; i++)
    {
        a = head;
        if (a->data % 2 != 0)
        {
            b = a->next;
            head = b;
            free(a);
        }

        else
        {

            a = head;

            for (; a->data % 2 == 0; )
            {
                b = a;
                a = a->next;
            }
            q = a->next;
            b->next = q;
            free(a);
        }
    }

}

void ins_betwen()
{
    node* p, * a, * b;
    int i, L;

    cout << "Enter the number of location : ";
    cin >> L;

    p = new node;

    cout << "Enter any number : ";
    cin >> p->data;

    a = head;

    for (i = 2; i < L; i++)
        a = a->next;

    b = a->next;
    a->next = p;
    p->next = b;
}



int main()
{
    int x = 0;
    for (; x != 5;)
    {
        cout << "\n";
        cout << "1-Create the linked list & Insert node.\n";
        cout << "2-Delete the odd values.\n";
        cout << "3-Add between two nodes.\n";
        cout << "4-Print the linked list.\n";
        cout << "5-Exit.\n";
        cout << "Enter your choice : ";
        cin >> x;
        cout << "\n";
        switch (x)
        {
        case 1: insertNode(); break;
        case 2: deleodd(); break;
        case 3: ins_betwen(); break;
        case 4: printNode(); break;

        default:cout << "Error\n";
        }
    }

    return 0;
}
