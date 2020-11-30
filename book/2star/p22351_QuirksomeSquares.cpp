//https://blog.xuite.net/abcd6891/LJYprogramming/61586321-256+-+Quirksome+Squares

#include<iostream>
#include<cstdlib>
#include<cstdio>
using namespace std;
int table[9] = {0,10,100,1000,10000,10000,1000000,10000000,100000000};
int main()
{
    int n;
    while(scanf("%d",&n)!=EOF)
    {

        for(int i=0; i*i<table[n]; i++)
        {
            int num = i*i;
            int h = num/table[n/2];
            int l = num%table[n/2];
            
            if((h+l)*(h+l)==num)
                printf("%0*d\n",n,num,h,l);
        }
    }
}