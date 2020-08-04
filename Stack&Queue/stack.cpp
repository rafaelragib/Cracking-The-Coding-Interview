#include<bits/stdc++.h>
using namespace std;

class Stack
{
public:
    int data;
    Stack *next;
    Stack(int data)
    {
        this->data=data;
        this->next=nullptr;
    }

};
Stack *top;
int Pop()
    {
        if(top==NULL)
            {cout << "ERROR";
                return -1;
            }
        else
        {
            int data= top->data;
            top=top->next;
            return data;
        }
    }

void push(int data)
{
    Stack *newnode=new Stack(data);
    newnode->next=top;
    top=newnode;
}

int peek()
{
 if(top==NULL)
           {
               cout << "ERROR";
             return -1;
           }
        else
        {
            int data= top->data;
            return data;
        }
}

bool isempty()
{
    if(top==NULL)
        return true;
    else
        return false;
}

int main()
{

    int a=2;
    push(2);
    cout << isempty()<<endl;
    cout << peek() <<endl;
    push(10);
    cout << peek() <<endl;
    cout << Pop() <<endl;
    cout <<peek() <<endl;


}
