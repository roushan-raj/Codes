#include<iostream>
#include<bits/stdc++.h>
using namespace std;


void dfs(int node, vector<int>& ans_dfs, vector<int>& vis, vector<int> adj[]){
    ans_dfs.push_back(node);
    vis[node] = 1;

    for(auto it : adj[node]){
        if(!vis[it]){
            dfs(it, ans_dfs, vis, adj);
        }
    }
}

vector<int> DFS_Resursive(int n, vector<int> adj[]){
    vector<int> ans_dfs;
    vector<int> vis(n+1, 0);

    for(int i=1; i<=n; i++){
        if(!vis[i]){
            dfs(i, ans_dfs, vis, adj);
        }
    }
    return ans_dfs;
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

    vector<int> ans = DFS_Resursive(n, adj);
    for(int i : ans){
        cout<< i <<" ";
    }
    
    return 0;
}

/*  
    7
    6
    1 2
    2 4
    2 7
    4 6
    7 6
    3 5
    1 2 4 6 7 3 5
*/