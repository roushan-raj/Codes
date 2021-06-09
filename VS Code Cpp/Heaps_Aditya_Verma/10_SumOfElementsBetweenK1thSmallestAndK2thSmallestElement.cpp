#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findKthSmallest(vector<int>& vec, int k){
    priority_queue<int> max_heap;
    for(int i=0; i<vec.size(); i++){
        max_heap.push(vec[i]);

        if(max_heap.size() > k){
            max_heap.pop();
        }
    }
    return max_heap.top();
}
    
int main() {

    vector<int> vec = {1, 3, 12, 5, 15, 11};
    int first = findKthSmallest(vec, 3);
    int second = findKthSmallest(vec, 6);
   
    int sum = 0;
    for(int i=0; i<vec.size(); i++){
        if(vec[i]>first && vec[i]<second){
            sum = sum + vec[i];
        }
    }
    cout<<sum;
    
    return 0;
}