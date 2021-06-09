#include<iostream>
#include<bits/stdc++.h>
using namespace std;

vector<int> bfsOfGraph(int n, vector<int> adj[]){
    vector<int> bfs;
    vector<int> vis(n+1, 0);

    //  this for loop is very important as it take care for all the
    //  components of graph if there are multiple components present
    for(int i=1; i<=n; i++){  
        if(!vis[i]){
            queue<int> q;
            q.push(i);
            vis[i] = 1;

            while(!q.empty()){
                int node = q.front();
                q.pop();
                bfs.push_back(node);

                for(auto it : adj[node]){
                    if(!vis[it]){
                        vis[it] = 1;
                        q.push(it);
                    }
                }
            }
        }
    }
    return bfs;
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

    vector<int> ans = bfsOfGraph(n, adj);

    for(int i : ans){
        cout<< i << " ";
    }

    return 0;
}

/*  7
    6
    1 2
    2 7
    2 3
    7 5
    3 5
    4 6
    1 2 7 3 5 4 6

    */