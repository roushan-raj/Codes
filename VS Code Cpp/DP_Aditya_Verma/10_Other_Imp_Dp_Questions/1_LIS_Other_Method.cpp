#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int longestIncreasingSubsequence(int arr[], int n){

    int lis [n];
    int ans = INT_MIN;

    for(int i=0; i<n; i++){
        lis[i] = 1;
    }

    for(int i=0; i<n; i++){
        for(int j=0; j<i; j++){
            if(arr[i] > arr[j] && lis[i] < 1+lis[j]){
                lis[i] = 1 + lis[j];
            }
        }
    }

    for(int i=0; i<n; i++){
        ans = max(ans, lis[i]);
    }
    
    return ans;
}
    
int main() {
    
    int arr [] = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<longestIncreasingSubsequence(arr, n);
    
    return 0;
}