#include<bits/stdc++.h>
using namespace std;

void transpose(vector<vector<int>> &matrix,int r,int c)
{
    for(int i=0;i<r;i++)
        for(int j=i;j<c;j++)
    {
       swap(matrix[i][j],matrix[j][i]);
    }

}
void columnswap(vector<vector<int>> &matrix,int r,int c)
{
    for(int i=0;i<r/2;i++)
        for(int j=0;j<c;j++)
    {
       swap(matrix[j][i],matrix[j][c-i-1]);
    }
}

int main()
{
    vector<vector<int>> matrix
    {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int row=matrix[0].size();
    int col=matrix.size();
    transpose(matrix,row,col);
    columnswap(matrix,row,col);
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
            cout << matrix[i][j] << " ";
        cout <<endl;
    }
}
