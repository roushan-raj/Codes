#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isCycle(int node, int parent, vector<int>& vis, vector<int> adj[]){
    vis[node] = 1;

    for(auto it : adj[node]){
        if(!vis[it]){
            if(isCycle(it, node, vis, adj)){
                return true;
            }
        }
        else if(it != parent){
            return true;
        }
    }
    return false;
}

bool cycleDetection(int n, vector<int> adj[]){
    vector<int> vis(n+1, 0);

    for(int i=1; i<=n; i++){
        if(!vis[i]){
            if(isCycle(i, -1, vis, adj)){
                return true;
            }
        }
    }
    return false;
}
    
int main() {
    
    int n, m;
    cin >> n >> m;

    vector<int> adj[n+1];

    for(int i=0; i<m; i++){
        int u, v;
        cin >> u >> v;

        adj[u].push_back(v);
        adj[v].push_back(u);
    }

    if(cycleDetection(n, adj)){
        cout<<"Graph contains cycle";
    }
    else{
        cout<<"Graph does not contains cycle";
    }
    
    return 0;
}