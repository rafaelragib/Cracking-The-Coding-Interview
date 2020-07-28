#include<bits/stdc++.h>
using namespace std;

void nulifyrow(vector<vector<int>> &vec,int row)
{

    for(int i=0; i<vec.size(); i++)
    {
        //cout << vec[i][row]<<endl;
       vec[i][row]=0;
    }
}

void nulifycol(vector<vector<int>> &vec,int col)
{
    for(int i=0; i<vec[0].size(); i++)
        vec[col][i]=0;
}

int main()
{
    vector<vector<int>> vec =
    {
        {1,1,1},
        {1,0,1},
        {1,1,1}
    };
    bool nr=false;
    bool nc=false;

   // cout << vec.size();

    for(int i=0; i<vec[0].size(); i++)
        if(vec[0][i]==0)
        {

            nr=true;
            break;
        }
    for(int i=0; i<vec.size(); i++)
        if(vec[i][0]==0)
        {

            nc=true;
            break;
        }
    for(int i=1; i<vec[0].size(); i++)
        for(int j=1; j<vec.size(); j++)
        {//cout << vec[j][i]<<endl;
            if(vec[j][i]==0)
            {//cout << "D ";
                vec[j][0]=0;
                vec[0][i]=0;
            }
        }

    for(int i=1; i<vec[0].size(); i++)
   {

      //cout << vec[0][i]<<endl;
        if(vec[0][i]==0)
        {//cout << "D ";
            nulifyrow(vec,i);
        }
   }
    for(int i=1; i<vec.size(); i++)
        if(vec[i][0]==0)
        {//cout << "D ";
            nulifycol(vec,i);
        }
    if(nr)
    {
       nulifyrow(vec,0);
    }
    if(nc)
    {
       nulifycol(vec,0);
    }

    for(int i=0;i<vec.size();i++){
        for(int j=0;j<vec[0].size();j++)

        cout << vec[i][j] << " ";
        cout <<endl;
        }

}

