#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[101][10001];

int solve(int e, int f){
    if(f==0 || f==1){
        return f;
    }
    if(e==1){
        return f;
    }

    if(dp[e][f] != -1){
        return dp[e][f];
    }

    int ans = INT_MAX, l=1, r=f;

    while(l<=r){
        int mid = (l+r)/2;
        int low = solve(e-1, mid-1);
        int high = solve(e, f-mid);
        int temp = 1+max(low, high);

        if(low < high){
            l = mid+1;
        }
        else{
            r = mid-1;
        }
        ans = min(ans, temp);
    }
    return dp[e][f] = ans;
}
    
int main() {
    
    int egg = 3;
    int floor = 5;
    memset(dp, -1, sizeof(dp));

    cout<<solve(egg, floor);
    
    return 0;
}