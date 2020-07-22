#include<bits/stdc++.h>
using namespace std;


int main()
{
    string str="ragib";
    vector<int> m(26);

    for(auto c:str)
            m[c-'a']++;
    bool flag=0;
    for(int i=0;i<str.length();i++)
    {
        if(m[str[i]-'a']>1)
            {
                cout << "NOT"<<endl;
                flag=1;
                break;
            }

    }

    if(!flag)
        cout <<"UNIQUE"<<endl;


}
