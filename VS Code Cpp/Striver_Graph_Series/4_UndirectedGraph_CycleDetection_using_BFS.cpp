#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isCycle(int i, vector<int>& vis, vector<int> adj[]){
    queue<pair<int, int>> q;
    q.push({i, -1});
    vis[i] = 1;

    while(!q.empty()){
        int node = q.front().first;
        int prev = q.front().second;
        q.pop();

        for(auto it : adj[node]){
            if(!vis[it]){
                q.push({it, node});
                vis[it] = 1;
            }
            else if(it != prev){
                return true;
            }
        }
    }
    return false;
}

bool detectCycle(int n, vector<int> adj[]){
    vector<int> vis(n+1, 0);

    for(int i=1; i<=n; i++){
        if(!vis[i]){
            if(isCycle(i, vis, adj)){
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

    if(detectCycle(n, adj)){
        cout<<"Contains Cycle";
    }
    else{
        cout<<"Does not contains cycle";
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

    Contains Cycle

    6
    4
    1 2
    2 4
    2 7
    3 5

    does not contains cycle
*/



