#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void K_largestElements(vector<int>& vec, int k){
    priority_queue<int, vector<int>, greater<int>> min_heap;
    int top;
    for(int i=0; i<vec.size(); i++){
        min_heap.push(vec[i]);
        if(min_heap.size() > k){
            min_heap.pop();
        }
    }
    while(min_heap.size() > 0){
        top = min_heap.top();
        min_heap.pop();
        cout<<top<<" ";
    }
}
    
int main() {
    
    vector<int> vec ;
    vec.push_back(10);
    vec.push_back(20);
    vec.push_back(30);
    vec.push_back(40);
    vec.push_back(50);

    K_largestElements(vec, 2);
    
    return 0;
}