#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool isBipartite(int curr, int color [], vector<int> adj[]){
    if(color[curr] == -1){
        color[curr] = 1;
    }

    for(auto it : adj[curr]){
        if(color[it] == -1){
            color[it] = 1 - color[curr];
            if(!isBipartite(it, color, adj)){
                return false;
            }
        }
        else if(color[it] == color[curr]){
            return false;
        }
    }
    return true;
}

bool bipartiteGraph(int n, vector<int> adj[]){
    int color[n+1];
    memset(color, -1, sizeof(color));

    for(int i=1; i<=n; i++){
        if(color[i] == -1){
            if(!isBipartite(i, color, adj)){
                return false;
            }
        }
    }
    return true;
}
    
int main() {
    
    int n = 9;
    vector<int> adj[n+1];

    adj[1].push_back(2);
    adj[2].push_back(1);

    adj[2].push_back(5);
    adj[5].push_back(2);

    adj[2].push_back(3);
    adj[3].push_back(2);

    adj[3].push_back(4);
    adj[4].push_back(3);

    adj[5].push_back(9);
    adj[9].push_back(5);

    adj[9].push_back(6);
    adj[6].push_back(9);

    // adj[5].push_back(6);
    // adj[6].push_back(5);

    adj[4].push_back(6);
    adj[6].push_back(4);

    adj[4].push_back(7);
    adj[7].push_back(4);

    adj[7].push_back(8);
    adj[8].push_back(7);

    if(bipartiteGraph(n, adj)){
        cout<<"Yes bipartite graph";
    }
    else{
        cout<<"Not bipartite graph";
    }
    
    return 0;
}