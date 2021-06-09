#include<iostream>
#include<bits/stdc++.h>
using namespace std;

struct node {
    int u;
    int v;
    int wt;

    node(int first, int second, int weight){
        u = first;
        v = second;
        wt = weight;
    }
};

void bellmanFord(int n, vector<int> edge, int src){
    int inf = 10000000;
    vector<int> dist (n+1, inf);

    dist[src] = 0;
    for(int i=1; i<=n; i++){
        for(auto it : edge){
            if(dist[it.u] + it.wt < dist[it.v]){
                dist[it.v] = dist[it.u] + it.wt; 
            }
        }
    }

    int flag = 0;
    for(auto it : edge){
        if(dist[it.u] + it.wt < dist[it.v]){
            cout << "Negative Cycle";
            flsg = 1;
            break;
        }
    } 

    if(!flag){
        for(int i=0; i<n; i++){
            cout << i << " " << dist[i] << endl;
        }
    }
}
    
int main() {
    
    int n = 6;
    vector<int> edge;
    edge.push_back(node(0, 1, 5));
    edge.push_back(node(1, 5, -3));
    edge.push_back(node(1, 2, -2));
    edge.push_back(node(5, 3, 1));
    edge.push_back(node(3, 2, 6));
    edge.push_back(node(2, 4, 3));
    edge.push_back(node(3, 4, -2));

    bellmanFord(n, edge, 0);
    
    return 0;
}