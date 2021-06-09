#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int mcm(int arr[], int i, int j){
    if(i >= j){
        return 0;
    }

    int mn = INT_MAX;
    for(int k=i; k<=j-1; k++){
        int temp_ans = mcm(arr, i, k) + mcm(arr, k+1, j) + (arr[i-1]*arr[k]*arr[j]);
        
        if(temp_ans < mn){
            mn = temp_ans;
        }
    }
    return mn;
}
    
int main() {
    
    //int arr [] = {10, 30, 5, 60};  // -> 4500
    int arr[] = {40, 20, 30, 10, 30};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout<<mcm(arr, 1, n-1);
    
    return 0;
}