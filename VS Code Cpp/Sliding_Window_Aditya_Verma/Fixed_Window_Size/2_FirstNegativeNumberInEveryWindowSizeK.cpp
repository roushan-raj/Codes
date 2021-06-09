#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void findFirstNegativeNumber(int arr[], int n, int k){

    list<int> ls;
    vector<int> vec;
    int i=0, j=0;

    while(j < n){

        if(arr[j] < 0){
            ls.push_back(arr[j]);
        }

        if(j-i+1 < k){
            j++;
        }

        else if(j-i+1 == k){

            if(ls.empty()){
                vec.push_back(0);
            }
            else{
                vec.push_back(ls.front());
                if(arr[i] == ls.front()){
                    ls.pop_front();
                }
            }
            j++, i++;
        }
    }
    for(int k : vec){
        cout<<k<<" ";
    }
}
    
int main() {
    
    int arr[] = {12, -1, -7, 8, -15, 30, 18, 28};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k = 3;

    findFirstNegativeNumber(arr, n, k);
    
    return 0;
}