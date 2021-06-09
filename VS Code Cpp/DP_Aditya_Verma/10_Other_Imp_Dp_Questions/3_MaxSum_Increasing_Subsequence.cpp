#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxSum(int arr[], int n){

    int msis [n];

    int maximumSum = INT_MIN;

    for(int i=0; i<n; i++){
        msis[i] = arr[i];
    }

    for(int i=1; i<n; i++){
        for(int j=0; j<i; j++){
            if(arr[i] > arr[j] && msis[i] < msis[j]+arr[i]){  // logic
                msis[i] = msis[j]+arr[i];
            }
        }
    }
    for(int i=0; i<n; i++){
        maximumSum = max(maximumSum, msis[i]);
    }

    return maximumSum;
}
    
int main() {
    
    //int arr [] = {10, 22, 9, 33, 21, 50, 41, 60, 80, 3};
    int arr [] = {1, 101, 2, 3, 100, 4, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<maxSum(arr, n);
    
    return 0;
}