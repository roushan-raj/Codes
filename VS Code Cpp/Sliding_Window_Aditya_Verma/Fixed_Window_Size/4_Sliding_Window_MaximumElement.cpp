#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void maxSumInWindow(int arr[], int n, int k){

    int i=0, j=0;
    list<int> ls;
    vector<int> ans;

    while(j<n){

        while(ls.size() > 0 && ls.back() < arr[j]){
            ls.pop_back();
        }
        ls.push_back(arr[j]);

        if(j-i+1 < k){
            j++;
        }
        else if(j-i+1 == k){
            ans.push_back(ls.front());
            
            if(arr[i] == ls.front()){
                ls.pop_front();
            }
            i++, j++;
        }
    }
    for(int i : ans){
        cout<<i<<" ";
    }
}
    
int main() {
    
    int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int n = sizeof(arr) / sizeof(arr[0]);

    maxSumInWindow(arr, n, k);

    return 0;
}