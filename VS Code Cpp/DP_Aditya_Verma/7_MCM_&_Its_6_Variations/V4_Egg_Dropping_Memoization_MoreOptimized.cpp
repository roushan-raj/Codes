#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[101][101];

int solve(int e, int f){
    if(e == 1){
        return f;
    }
    if(f == 0 || f == 1){
        return f;
    }
    if(dp[e][f] != -1){
        return dp[e][f];
    }

    int mn = INT_MAX;
    for(int k=1; k<=f; k++){
        
        int low = 0, high = 0;

        if(dp[e-1][k-1] != -1){
            low = dp[e-1][k-1];
        }
        else{
            low = solve(e-1, k-1);
            dp[e-1][k-1] = low;
        }

        if(dp[e][f-k] != -1){
            high = dp[e][f-k];
        }
        else{
            high = solve(e, f-k);
            dp[e][f-k] = high;
        }

        int temp = 1 + max(low, high);

        mn = min(mn, temp);
    }
    return dp[e][f] = mn;
}
    
int main() {
    
    int e = 3;
    int f = 5;
    memset(dp, -1, sizeof(dp));

    cout<<solve(e, f);
    
    return 0;
}