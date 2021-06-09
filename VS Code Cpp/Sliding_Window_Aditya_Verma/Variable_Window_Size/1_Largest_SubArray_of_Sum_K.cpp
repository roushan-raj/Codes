#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findMaxWindowSize(int arr[], int n, int givenSum){
    int i=0, j=0, sum=0, mx=INT_MIN;

    while(j<n){
        sum = sum + arr[j];

        if(sum < givenSum){
            j++;
        }

        else if(sum == givenSum){
            mx = max(mx, j-i+1);
            j++;
        }

        else if(sum > givenSum){
            while(sum > givenSum){
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
    }
    return mx;
}
    
int main() {
    
    //int arr[] = {4, 1, 1, 1, 2, 3, 5};
    int arr[] = {10, 5, 2, 7, 1, 9};
    int n = sizeof(arr) / sizeof(arr[0]);
    int givenSum = 15;

    cout<<findMaxWindowSize(arr, n, givenSum);
    
    return 0;
}