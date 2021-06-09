#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int binarySearch(int arr[], int start, int end, int k){
    
    while(start <= end){

        int mid = start + (end-start)/2;

        if(arr[mid] == k){
            return mid;
        }
        else if(arr[mid] > k){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
    }
    return -1;
}

void findElementInRotatedSortedArray(int arr[], int n, int k){

    int start = 0;
    int end = n-1;
    int index = -1;

    while(start <= end){

        if(arr[start] <= arr[end]){
            index = start;
            break;
        }

        int mid = start + (end-start)/2;
        int prev = (mid+n-1) % n;
        int next = (mid+1) % n;

        if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
            index = mid;
            break;
        }
        if(arr[mid] >= arr[start]){
            start = mid+1;
        }
        else if(arr[mid] <= arr[end]){ 
            end = mid-1;
        }
    }
    
    int low = 0;
    int high = n-1;
    int first = binarySearch(arr, low, index-1, k);
    int second = binarySearch(arr, index, high, k);

    if(first >= 0){
        cout<<first;
    }
    else if(second >= 0){
        cout<<second;
    }
    else{
        cout<<-1;
    }
}

    
int main() {
    
    int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 12;

    findElementInRotatedSortedArray(arr, n, k);
    
    return 0;
}