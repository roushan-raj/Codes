#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int numOfTimes(int arr [], int n){

    int start = 0;
    int end = n-1;

    while(start <= end){

        if(arr[start] <= arr[end]){
            return start;
        }

        int mid = start + (end-start) / 2;
        int next = (mid+1) % n;
        int prev = (mid+n-1) % n;

        if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
            int ans = mid;
            return ans;
        }

        if(arr[start] <= arr[mid]){
            start = mid+1;
        }
        else if(arr[end] >= arr[mid]){
            end = mid-1;
        }
    }
    return -1;
}
    
int main() {
    
    int arr[] = {6, 8, 11, 12, 15, 18, 2, 5};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<numOfTimes(arr, n);
    
    return 0;
}