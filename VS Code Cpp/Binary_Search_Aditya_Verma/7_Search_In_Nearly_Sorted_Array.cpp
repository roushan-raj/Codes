#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int searchElement(int arr[], int n, int k){

    int start = 0;
    int end = n-1;

    while(start<=end){

        int mid = start + (end-start)/2;

        if(arr[mid] == k){
            return mid;
        }

        if(mid-1 >= start && arr[mid-1] == k){
            return mid-1;
        }

        if(mid+1 <= end && arr[mid+1] == k){
            return mid+1;
        }  

        if(arr[mid] > k){
            end = mid-2;
        }
        else{
            start = mid+2;
        }
    }
    return -1;
}
    
int main() {
    
    int arr[] = {10, 3, 40, 20, 50, 80, 70};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k =20;

    cout<<searchElement(arr, n, k);
    
    return 0;
}