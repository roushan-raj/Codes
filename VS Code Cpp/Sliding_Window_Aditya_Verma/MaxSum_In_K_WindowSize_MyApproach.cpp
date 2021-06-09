#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxSumInWindow(int arr[], int n, int k){
    if(n==0){
        return 0;
    }
    if(k>n){
        return 0;
    }

    int count = 0, sum = 0, maxSum = INT_MIN;

    for(int i=0; i<n; i++){
        count++;

        if(count > k){
            sum = sum - arr[i-k];
            count--;
        }

        sum = sum + arr[i];
        maxSum = max(maxSum, sum);
    }
    return maxSum;
}
    
int main() {
    
    int arr[] = {2, 3, 5, 2, 9, 7, 1};
    int k = 3;
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<maxSumInWindow(arr, n, k);
    
    return 0;
}