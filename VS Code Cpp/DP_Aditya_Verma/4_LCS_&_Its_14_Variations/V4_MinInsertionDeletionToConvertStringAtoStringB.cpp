#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int lengthOfLCS(string a, string b, int n, int m){
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
                dp[i][j] = max(dp[i][j-1], dp[i-1][j]);
            }
        }
    }
    return dp[n][m];
}
    
int main() {
    
    string a = "hlole";
    string b = "hello";
    int n = a.length();
    int m = b.length();

    int lcs = lengthOfLCS(a, b, n, m);

    int insert = b.length() - lcs;
    int delet = a.length() - lcs;
    cout<<insert+delet;
    
    return 0;
}