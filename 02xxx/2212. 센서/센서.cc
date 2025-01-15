#include<bits/stdc++.h>
using namespace std;

bool sensor[2000001];

struct line {
    int x, y;
};

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int N, K; cin >> N >> K;
    set<int> sensor;
    for(int i=0;i<N;i++) {
        int pos; cin >> pos;
        sensor.insert(pos);
    }

    vector<line> v;
    for(int pos:sensor) {
        v.push_back({pos, pos});
    }

    while(v.size()>K) {
        int idx=0;
        for(int i=1;i<v.size()-1;i++) {
            if(v[idx+1].x-v[idx].y > v[i+1].x-v[i].y) {
                idx=i;
            }
        }
        v[idx].y = v[idx+1].y;
        v.erase(v.begin()+idx+1);
    }

    int sum=0;
    for(int i=0;i<v.size();i++) {
        sum += v[i].y-v[i].x;
    }
    cout << sum;
}