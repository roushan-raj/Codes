#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findKthSmallestElement(vector<int>& vec, int k){
    priority_queue<int> max_heap;  // by default priority_queue in cpp acts as max heap and in java min heap
    for(int i=0; i<vec.size(); i++){
        max_heap.push(vec[i]);
        if(max_heap.size() > k){
            max_heap.pop();
        }
    }
    return max_heap.top();
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(10);
    vec.push_back(200);
    vec.push_back(3);
    vec.push_back(45);
    vec.push_back(88);

    cout<<findKthSmallestElement(vec, 4);
    
    return 0;
}