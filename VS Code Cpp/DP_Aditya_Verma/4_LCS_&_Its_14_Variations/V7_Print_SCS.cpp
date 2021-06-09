#include<iostream>
#include<bits/stdc++.h>
using namespace std;

string printSCS(string a, string b, int n, int m){
    int dp [n+1][m+1];

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
    
    string ans = "";
    int i=n, j=m;
    while(i>0 && j>0){
        if(a[i-1] == b[j-1]){
            ans.push_back(a[i-1]);
            i--, j--;
        }
        else{
            if(dp[i][j-1] > dp[i-1][j]){
                ans.push_back(b[j-1]);
                j--;
            }
            else if(dp[i][j-1] < dp[i-1][j]){
                ans.push_back(a[i-1]);
                i--;
            }
        }
    }
    while(i>0){
        ans.push_back(a[i-1]);
        i--;
    }
    while(j>0){
        ans.push_back(b[j-1]);
        j--;
    }
    reverse(ans.begin(), ans.end());
    return ans;
}
    
int main() {
    
    string a = "acbcf";
    string b = "abcdaf";
    int n = a.length();
    int m = b.length();

    cout<<"Shortest common Subsequence is : "<<printSCS(a, b, n, m);
    
    return 0;
}