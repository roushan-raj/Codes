#include <bits/stdc++.h>
using namespace std;

int findSecondLargest(int arr[], int n, int k){

    unordered_set<int> set;

    for(int i=0; i<n; i++){
        set.insert(arr[i]);
    }

    priority_queue<int, vector<int>, greater<int>> minh;

    if(set.size() >=k ){
        for(auto it : set){
            minh.push(it);

            if(minh.size() > k){
                minh.pop();
            }
        }
        return minh.top();
    }
    return -1;
}


int main() {
    
    int arr [] = {2, 1, 2};
    int n = sizeof(arr) / sizeof(arr[0]);

    cout << findSecondLargest(arr, n, 2);

	return 0;
}