#include<bits/stdc++.h>
using namespace std;

long long Hash(string &s,int m,int b,long long M)
{
    long long h=0,power=1;
    for(int i=m-1;i>=0;i--)
    {
        h=h+(s[i]*power)%M;
        h=h%M;
        power=(power*b)%M;
    }
    return h;
}

int main()
{
    string A="abcde";
    string B="cdeab";
    A=A+A;
    int n=A.length();
    int m=B.length();
    int b=347;
    long long M=10e7;
    long long power=1;
    ///calculating the b^(m-1)
    for(int i=1;i<=m-1;i++)
        power=(power*b)%M;
    long long hash_text=Hash(A,m,b,M);
    long long hash_pattern=Hash(B,m,b,M);
    if(hash_text==hash_pattern)
        cout <<"TRUE";
    for(int i=m;i<n;i++)
    {
        hash_text=(hash_text-(A[i-m]*power)%M)%M;
        hash_text=(hash_text+M)%M;
        hash_text=(hash_text*b)%M;
        hash_text=(hash_text+A[i])%M;

        if(hash_text==hash_pattern)
        {
            cout << i-m+1;
        }

    }

}

