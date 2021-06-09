#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void findTopological(int node, stack<int> &st, vector<int> &vis, vector<int> adj[]){
    vis[node] = 1;

    for(auto it : adj[node]){
        if(!vis[it]){
            findTopological(it, st, vis, adj);
        }
    }
    st.push(node);
}

vector<int> topologicalSort(int n, vector<int> adj[]){
    vector<int> vis(n+1, 0);
    stack<int> st;

    for(int i=1; i<n; i++){
        if(!vis[i]){
            findTopological(i, st, vis, adj);
        }
    }
    
    vector<int> topo;
    while(!st.empty()){
        topo.push_back(st.top());
        st.pop();
    }
    return topo;
}
    
int main() {
    
    int n = 5;
    vector<int> adj[n+1];

    adj[1].push_back(2);

    adj[2].push_back(3);

    adj[3].push_back(1);

    adj[2].push_back(4);

    adj[4].push_back(5);

    vector<int> ans = topologicalSort(n, adj);
    for(int i : ans){
        cout<<i<<" ";
    }
    
    return 0;
}