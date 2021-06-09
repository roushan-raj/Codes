#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int findKthLargestElement(vector<int>& vec, int k){
    priority_queue<int, vector<int>, greater<int>> min_heap; // way to declare min_heap in cpp
    for(int i=0; i<vec.size(); i++){
        min_heap.push(vec[i]);
        if(min_heap.size() > k){
            min_heap.pop();
        }
    }
    return min_heap.top();
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(30);
    vec.push_back(40);
    vec.push_back(50);

    cout<<findKthLargestElement(vec, 2);
    
    return 0;
}