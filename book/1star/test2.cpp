#include<iostream>
#include<vector>
#include<cstdlib>
#include<cstring>
#include<queue>
#include<stack>
using namespace std;
int main()
{
    int x0,y0,x1,y1,tmp1,tmp2,i;
    int first=0;
    int count=0;
    int n;
    cin>>n;
    for(i=0;i<n;i++){
    cin>>x0>>y0>>x1>>y1;
    if((x0+y0)<(x1+y1))
    {
                      
       tmp1=x1,tmp2=y1;
       while(y0!=0)
       {
         if(first==0){x0+=y0; first=1;}
         y0--;
         count++;
       }       
       while((x0+1)!=x1+y1)
       {
         x0++;                  
         count+=(x0+1);
       }
       y0=x0+1;x0=0;
       count++; 
    }
     while(x0!=x1&&y0!=y1)
       {
         x0++;y0--;
         count++;
       }
       cout<<"Case "<<(i+1)<<": "<<count<<endl;
       count=0;
       first=0;
    }
    return 0;
}