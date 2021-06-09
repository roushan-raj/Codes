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

bool comparator(node a, node b){
    return a.wt < b.wt;
}

int findParent(int u, vector<int>& parent){
    if(u == parent[u]){
        return u;
    }
    return parent[u] = findParent(parent[u], parent);
}

void unionn(int u, int v, vector<int>& parent, vector<int>& rank){
    u = findParent(u, parent);
    v = findParent(v, parent);

    if(rank[u] < rank[v]){
        parent[u] = v;
    }
    else if(rank[v] < rank[u]){
        parent[v] = u;
    }
    else if(rank[u] == rank[v]){
        parent[u] = v;
        rank[v]++;
    }
}
    
int main() {
    
    int n = 6;
    vector<int> edge;
    edge.push_back(node(5, 4, 9));
    edge.push_back(node(5, 1, 4));
    edge.push_back(node(4, 1, 1));
    edge.push_back(node(4, 2, 3));
    edge.push_back(node(4, 3, 5));
    edge.push_back(node(1, 2, 2));
    edge.push_back(node(3, 2, 3));
    edge.push_back(node(3, 6, 8));
    edge.push_back(node(2, 6, 7));

    vector<int> parent(n);
    for(int i=1; i<=n; i++){
        parent[i] = i;
    }

    vector<int> rank (n, 0);
    vector<pair<int, int>> mst;

    sort(edge.begin(), edge.end(), comparator);

    int cost = 0;
    for(auto it : edge){
        if(findParent(it.u, parent) != findParent(it.v, parent)){
            mst.push_back({it.u, it.v});
            cost = cost + it.wt;
            unionn(it.u, it.v, parent, rank);
        }
    }

    cout<<"MST cost is : " << cost << endl;
    for(auto it : mst){
        cout << it.first << " -- " << it.second << endl;
    } 
    
    return 0;
}