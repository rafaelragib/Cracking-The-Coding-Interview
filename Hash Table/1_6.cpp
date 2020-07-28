#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector<char> str={'a','a','b','c','c','c','c','c','a','a','a'};

    int index=0,indexAns=0;
    while(index<str.size())
    {
        char currentChar=str[index];
        int co=0;
        while(index<str.size() && str[index]==currentChar)
            {
                index++;
                co++;
                cout << currentChar <<endl;
            }
        str[indexAns++]=currentChar;
        if(co!=1)
        {string s=to_string(co);
        for (auto ch:s)
            str[indexAns++]=ch;
        }
    }

    for(int i=0;i<indexAns;i++)
        cout << str[i];

}
