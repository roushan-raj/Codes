#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001];

int editDistance(string a, string b, int n, int m){

    int ans = INT_MAX;

    if(n<0){
        return m+1;
    }
    if(m<0){
        return n+1;
    }

    if(dp[n][m] != -1){
        return dp[n][m];
    }

    if(a[n-1] == b[m-1]){
        return dp[n][m] = editDistance(a, b, n-1, m-1);
    }
    else{
        int insert = 1 + editDistance(a, b, n, m-1);     // insert
        int remove = 1 + editDistance(a, b, n-1, m);     // remove
        int replace = 1 + editDistance(a, b, n-1, m-1);  // replace

        ans = min(insert, min(remove, replace));
    }
    return dp[n][m] = ans;
}
    
int main() {
    
    string a = "horse";
    string b = "ros";
    int n = a.length();
    int m = b.length();
    memset(dp, -1, sizeof(dp));

    cout<<editDistance(a, b, n, m);
    
    return 0;
}