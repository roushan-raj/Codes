#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int maxSumInWindow(int arr[], int n, int k){
    int sum = 0, i = 0, j = 0, mx = INT_MIN;

    while(j<n){
        sum = sum + arr[j];

        if(j-i+1 < k){
            j++;
        }
        else if(j-i+1 == k){
            mx = max(mx, sum);   // -> 1st calculate maximum
            sum = sum - arr[i];  // -> then subtract arr[i]
            i++;
            j++;
        }
    }
    return mx;
}
    
int main() {
    
    int arr[] = {2, 3, 5, 2, 9, 7, 1};
    int k = 3;
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<maxSumInWindow(arr, n, k);
    
    return 0;
}