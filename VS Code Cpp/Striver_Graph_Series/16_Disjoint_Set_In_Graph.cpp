#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int parent[100000];
int rankk[100000];

void makeSet(int n){
    for(int i=1; i<=n; i++){
        parent[i] = i;
        rankk[i] = 0;
    }
}

int findParent(int node){
    if(node == parent[node]){
        return node;
    }
    return parent[node] = findParent(node);
}

void unionn(int u, int v){
    u = findParent(u);
    v = findParent(v);

    if(rankk[u] < rankk[v]){
        parent[u] = v;
    }
    else if(rankk[u] > rankk[v]){
        parent[v] = u;
    }
    else if(rankk[u] == rankk[v]){
        parent[u] = v;
        rankk[v]; 
    }
}
    
int main() {
    
    int n = 7;
    makeSet(n);

    unionn(1, 2);
    unionn(2, 3);
    unionn(4, 5);
    unionn(6, 7);
    unionn(5, 6);
    unionn(3, 7);
    
    if(findParent(2) != findParent(3)){
        cout << "Different components";
    }
    else{
        cout << "Same component";
    }

    if(findParent(2) != findParent(8)){
        cout << "Different components";
    }
    else{
        cout << "Same component";
    }
    
    return 0;
}