#include<bits/stdc++.h>
using namespace std;

int main()
{
    string str="code";
    vector<int>val(128);

    for(int i=0;i<str.length();i++)
        val[str[i]]++;

    int co=0;

    for(int i=0;i<val.size();i++)
       {
        co+=val[i]%2;

       }
    if(co<=1)
        cout <<"True";
    else
        cout <<"false";


}
