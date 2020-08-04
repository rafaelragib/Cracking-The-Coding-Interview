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
