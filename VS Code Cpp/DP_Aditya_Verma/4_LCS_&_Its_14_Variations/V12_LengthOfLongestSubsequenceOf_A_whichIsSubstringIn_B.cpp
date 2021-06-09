#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxLength(string a, string b, int n, int m){
    int dp[n+1][m+1];

    for(int i=0; i<n+1; i++){
        dp[i][0] = 0;
    }
    for(int j=0; j<m+1; j++){
        dp[0][j] = 0;
    }

    for(int i=1; i<n+1; i++){
        for(int j=1; j<m+1; j++){
            if(a[i-1] == b[j-1]){
                dp[i][j] = 1 + dp[i-1][j-1];
            }
            else{
                dp[i][j] = dp[i][j-1];
            }
        }
    }

    int mx = INT_MIN;
    for(int i=0; i<n+1; i++){
        mx = max(mx, dp[i][n]);
    }
    return mx;
}
    
int main() {
    
    string a = "ABCD";
    string b = "BACDBDCD";
    int n = a.length();
    int m = b.length();

    cout<<maxLength(a, b, n, m);
    
    return 0;
}