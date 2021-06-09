#include<iostream>
#include<bits/stdc++.h>
using namespace std;

void revDFS(int node, vector<int>& vis, vector<int> transpose[]){
    vis[node] = 1;
    cout << node << " ";

    for(auto it : transpose[node]){
        if(!vis[it]){
            revDFS(it, vis, transpose);
        }
    }
}

void toposort(int node, stack<int>& st, vector<int>& vis, vector<int> adj[]){
    vis[node] = 1;

    for(auto it : adj[node]){
        if(!vis[it]){
            toposort(it, st, vis, adj);
        }
    }
    st.push(node);
}

void kosarajuSCC(int n, vector<int> adj[]){

    // finding topological sort ----> step - 1
    stack<int> st;
    vector<int> vis(n+1, 0);
    for(int i=1; i<=n; i++){
        if(!vis[i]){
            toposort(i, st, vis, adj);
        }
    }
    
    // doing transpose of graph ----> step - 2
    vector<int> transpose[n+1];
    for(int i=1; i<=n; i++){
        vis[i] = 0;
        for(auto it : adj[i]){
            transpose[it].push_back(i);
        }
    }

    // doing dfs on transposed graph in topological order ----> step - 3
    while(!st.empty()){
        int node = st.top();
        st.pop();

        if(!vis[node]){
            cout << "SCC : ";
            revDFS(node, vis, transpose);
            cout << endl;
        }
    } 
}
    
int main() {
    
    int n = 5;
    vector<int> adj[n+1];

    adj[1].push_back(2);

    adj[2].push_back(3);

    adj[3].push_back(1);

    adj[2].push_back(4);

    adj[4].push_back(5);

    kosarajuSCC(n, adj);

    return 0;
}