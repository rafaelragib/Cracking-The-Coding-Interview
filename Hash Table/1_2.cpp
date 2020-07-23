#include<bits/stdc++.h>
using namespace std;

int main()
{
    string str1="cat";
    string str2="togo";
    bool flag=false;
    vector<int> co(128); //assume that we have ascii table including numbers,uppercase,signs and lowercases

    for(auto x:str1)
        co[x-'0']++;

    for(int i=0; i<str2.length(); i++)
    {
        if(co[str2[i]-'0']<=0)
        {
            cout << "Not an permutation of string one" <<endl;
            flag=true;
            break;
        }
        else
            co[str2[i]-'0']--;
    }
    if(!flag)
        cout << "Permutation";



}
