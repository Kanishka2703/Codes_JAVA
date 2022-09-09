#include <stdio.h>
#define max_size 100
int sum(int A[],int start,int len);
int main()
{
    int A[max_size];
    int n,i,sumofarray;
    /*inputing size and elements of an array*/
    printf("Enter size of array");
    scanf("%d", &n);
    printf("Enter the elements");
    for(i=0;i<n;i++)
    {
        scanf("%d", &A[i]);
    }
    sumofarray=sum(A,0,n);
    printf("Sum of elements:%d", sumofarray);
    return 0;
}

int sum(int A[],int start,int len)
{
    if(start>=len)
    return 0;
    else
    return(A[start]+ sum(A,start+1,len));
}
