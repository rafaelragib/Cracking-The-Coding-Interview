#include<bits/stdc++.h>
using namespace std;

int main()
{
    string str="Mr John Smith    ";
    int trueLength= 13;
    int i=str.length()-1;
    //cout <<i<<endl;
    int j=trueLength-1;

    while(j>=0)
    {
        if(str[j]==' ')
        {
            //printf("j:%d i:%d\n",j,i);
            str[i--]='0';
            str[i--]='2';
            str[i--]='%';
            j--;
        }
        else
        {
            str[i--]=str[j--];
        }
    }
    cout <<str <<endl;

}
