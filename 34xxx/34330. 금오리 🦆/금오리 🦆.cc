#include<bits/stdc++.h>
using namespace std;

typedef long long ll;

ll r, l, n, m;
bool enter[100];
int parent[100];
ll flower[100][3], duck[100][2];

int find(int x) {
    if(parent[x]==x) return x;
    return parent[x] = find(parent[x]);
}

void merge(int x, int y) {
    x = find(x);
    y = find(y);
    if(x<y) {
        parent[y]=x;
        enter[x]|=enter[y];
    } else {
        parent[x]=y;
        enter[y]|=enter[x];
    }
}

ll pow(ll a) {
    return a*a;
}

bool outsideFlower(ll i) {
    return r<=flower[i][2] || pow(r-flower[i][2])<=pow(flower[i][0])+pow(flower[i][1]);
}

bool outsideDuck(ll i) {
    return r<=l || pow(r-l)<=pow(duck[i][0])+pow(duck[i][1]);
}

bool closeFlower(int i, int j) {
    return pow(flower[i][0]-flower[j][0])+pow(flower[i][1]-flower[j][1])<=pow(flower[i][2]+flower[j][2]);
}

bool closeDuck(int i, int j) {
    return enter[find(i)] && pow(flower[i][0]-duck[j][0])+pow(flower[i][1]-duck[j][1])<=pow(flower[i][2]+l);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> r >> l >> n >> m;
    for(int i=0;i<n;i++) {
        cin >> flower[i][0] >> flower[i][1] >> flower[i][2];
        enter[i] = outsideFlower(i);
        parent[i]=i;
    }
    for(int i=0;i<m;i++) cin >> duck[i][0] >> duck[i][1];

    for(int i=0;i<n;i++) {
        for(int j=i+1;j<n;j++) {
            if(closeFlower(i, j)) merge(i, j);
        }
    }

    int cnt=0;
    for(int j=0;j<m;j++) {
        bool chk = outsideDuck(j);
        for(int i=0;i<n;i++) chk |= closeDuck(i, j);
        cnt += chk;
    }
    cout << cnt;
}