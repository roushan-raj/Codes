#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int static dp[1001][1001];

bool isPalindrome(string s, int i, int j){
    if(i==j){
        return true;
    }
    if(i>j){
        return true;
    }
    while(i <= j){
        if(s[i] == s[j]){
            i++, j--;
        }
        else{
            return false;
        }
    }
    return true;
}

int palindromePartitioning(string s, int i, int j){
    if(i>=j){
        return 0;
    }
    if(isPalindrome(s, i, j) == true){
        return 0;
    }
    if(dp[i][j] != -1){
        return dp[i][j];
    }

    int mn = INT_MAX;
    for(int k=i; k<=j-1; k++){

        int left=0, right=0;
        
        if(dp[i][k] != -1){
            left = dp[i][k];
        }
        else{
            left = palindromePartitioning(s, i, k);
            dp[i][k] = left;
        }

        if(dp[k+1][j] != -1){
            right = dp[k+1][j];
        }
        else{
            right = palindromePartitioning(s, k+1, j);
            dp[k+1][j] = right;
        }

        int temp = 1 + left + right;

        if(temp < mn){
            mn = temp;
        }
    }
    return dp[i][j] = mn;
}
    
int main() {
    
    string s = "aabbccdd";
    int n = s.length();
    memset(dp, -1, sizeof(dp));

    cout<<palindromePartitioning(s, 0, n-1);
    
    return 0;
}