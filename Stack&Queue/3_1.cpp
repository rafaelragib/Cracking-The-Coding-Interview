#include<bits/stdc++.h>
using namespace std;

int ar[30];
int index1=0;
int index2=10;
int index3=20;
int n=10;
int pop(int index)
{
    if(index==1)
    {
        if(index1<=0)
            return -1;
        else
        {
            int data=ar[index1];
            index1--;
            return data;
        }
    }
    else if(index==2)
    {
        if(index2<=10)
            return -1;
        else
        {
            int data=ar[index2];
            index2--;
            return data;
        }
    }
    else
    {
        if(index3<=20)
            return -1;
        else
        {
            int data=ar[index3];
            index3--;
            return data;
        }
    }
}

int push(int data,int index)
{
     if(index==1)
    {
        if(index1>=10)
            return -1;
        else
        {
            index1++;
            ar[index1]=data;
        }
    }
    else if(index==2)
    {
        if(index2>=20)
            return -1;
        else
        {
            index2++;
            ar[index2]=data;
        }
    }
    else
     {
        if(index3>=30)
            return -1;
        else
        {
            index3++;
            ar[index3]=data;
        }
    }
}

int main()
{
    push(10,3);
    push(20,3);
    push(10,2);
    cout << pop(3);
}
