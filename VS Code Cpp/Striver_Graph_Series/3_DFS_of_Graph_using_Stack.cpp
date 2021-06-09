#include<iostream>
#include<bits/stdc++.h>
using namespace std;

vector<int> dfsOfGraph(int n, vector<int> adj[]){
    vector<int> dfs;
    vector<int> vis(n+1, 0);

    for(int i=1; i<=n; i++){
        if(!vis[i]){
            stack<int> s;
            s.push(i);
            vis[i] = 1;
 
            while(!s.empty()){
                int node = s.top();
                s.pop();
                dfs.push_back(node);

                for(auto it : adj[node]){
                    if(!vis[it]){
                        s.push(it);
                        vis[it] = 1;
                    }
                }
            }
        }
    }
    return dfs;
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

    vector<int> ans = dfsOfGraph(n, adj);
    for(int i : ans){
        cout<< i <<" ";
    }
    
    return 0;
}