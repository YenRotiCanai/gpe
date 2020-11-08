#include<iostream>
#include<cstdlib>
#include<cstdio>
#define MAXN 200
using namespace std;

int set[MAXN], number, flag;
int adjList[MAXN][MAXN], num[MAXN];

void DFS(int lastNode)
{
    if(number>0&&flag)
    {
        for(int i=0; i<num[lastNode]; i++)
        {
            int neoSet = set[lastNode]*-1;
            int nextNode = adjList[lastNode][i];
            if(set[nextNode]==0)
            {   //coloring
                set[nextNode] = neoSet;
                number--;
                DFS(nextNode);
            }
            else
            if(set[nextNode]!=neoSet)
            {
                //printf("s[%d]=%d s[%d]=%d\n",lastNode,set[lastNode],nextNode,set[nextNode]);
                flag = 0;
                break;
            }
        }
    }
}

int main()
{
    int N;
    while(scanf("%d",&N)!=EOF)
    {
        if(N==0)
            break;
        int m;
        scanf("%d",&m);

        for(int i=0; i<N; i++)
        {
            set[i] = 0;
            num[i] = 0;
        }
        for(int i=0; i<m; i++)
        {
            int s,e;
            scanf("%d %d",&s,&e);
            adjList[s][num[s]++] = e;
            adjList[e][num[e]++] = s;
        }

        set[0] = 1;
        number = N;
        flag = 1;
        DFS(0);

        if(flag)
            puts("BICOLORABLE.");
        else
            puts("NOT BICOLORABLE.");
    }
}