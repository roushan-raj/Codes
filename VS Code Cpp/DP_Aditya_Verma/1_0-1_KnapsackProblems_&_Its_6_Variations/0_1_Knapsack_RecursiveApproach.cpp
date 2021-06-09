#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxProfit(int wt [], int val [], int w, int n){
    if(n == 0 || w == 0){
        return 0;
    }

    if(wt[n-1] > w){
        return maxProfit(wt, val, w, n-1);
    }
    else { // if(wt[n-1] <= w)
         return max(val[n-1] + maxProfit(wt, val, w-wt[n-1], n-1), maxProfit(wt, val, w, n-1));
    }
}
    
int main() {
    
    int wt [] = {1, 3, 4, 5};
    int val[] = {1, 4, 5, 7};
    int w = 7;
    int  n = sizeof(wt) / sizeof(wt[0]);

    cout<<maxProfit(wt, val, w, n);

    return 0;
}