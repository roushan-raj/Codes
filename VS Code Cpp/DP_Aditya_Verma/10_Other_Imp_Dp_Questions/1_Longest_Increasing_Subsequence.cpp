#include<iostream>
#include<bits/stdc++.h>
using namespace std;

       ////////////////////// nlogn approach /////////////////////

int lis(int arr[], int n){
    vector<int> seq;
    seq.push_back(arr[0]);

    for(int i=1; i<n; i++){
        if(seq.back() < arr[i]){
            seq.push_back(arr[i]);
        }
        else{
            // upper_bound or lower_bound behaves as binary search.
            int idx = upper_bound(seq.begin(), seq.end(), arr[i]) - seq.begin();
            seq[idx] = arr[i];
        }
    }
    return seq.size();
}
    
int main() {
    
    int arr [] = {1, 7, 9, 11, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout<<lis(arr, n);
    
    return 0;
}