#include<iostream>

#include<cstdlib>

#include<cmath>

#include<cstring>

#include<memory.h>

#include<algorithm>

#include<string.h>

#include<stdio.h>

using namespace std;

int row,col;

int range;

char G[101][101]={0},visit[101][101]={0};

void dfs(int x,int y)

{

   //  printf("%d,%d\n",x,y);

   //  system("pause");

     if(x<0||y<0||x>=row||y>=col||visit[x][y]=='1'||G[x][y]=='1')return;

     visit[x][y]='1';

     range++;

     dfs(x,y-1);

     dfs(x-1,y);

     dfs(x,y+1);

     dfs(x+1,y);

     return;

 }

int main()

{
    int n;

    int i,j;

    int x,y;

    cin>>n;

    for(;n>0;n--)

    {

    range=0;

    row=0;

    cin>>x>>y;

    memset(G,0,sizeof(G));

    memset(visit,0,sizeof(visit));

    getchar();

    while(gets(G[row])&&G[row][0])row++;

    col=strlen(G[row-1]);

    //cout<<" "<<row<<" "<<col<<endl;

    dfs(x-1,y-1);

    cout<<range<<endl;

    if(n-1>0)cout<<endl;

    }
    return 0;  
}