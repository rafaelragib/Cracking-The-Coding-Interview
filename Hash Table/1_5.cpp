#include<bits/stdc++.h>
using namespace std;


bool editString(string str1,string str2)
{
    int n=str1.length();
    int m=str2.length();
   if(abs(n-m)>1)
    return false;

   string s1= str1.length()<str2.length() ?str1 :str2;
   string s2= str1.length()<str2.length() ?str2 :str1;

   bool flag=false;
   int index1=0,index2=0;
   //cout << str1<<endl;
   while(index1<s1.length() && index2<s2.length())
   {
        //cout << s1[index1]<< " " << s2[index2] <<endl;
       if(s1[index1]!=s2[index2])
       {
           //cout <<"YO"<<endl;
           if(flag) return false;
           flag=true;
            if(s1.length()==s2.length())
                index1++;


       }
       else
        index1++;
       index2++;
   }
   return true;
}

int main()
{
    string str1="plee";
    string str2="alee";
    cout << editString(str1,str2);
}
