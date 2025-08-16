#include<bits/stdc++.h>
using namespace std;

int arr[4];
bool visited[4];

bool calc(vector<double> vals) {
    if(vals.size()==1) return 23.99999999<=vals[0] && vals[0]<=24.00000001;

    bool ret=false;
    vector<double> next;

    next = vals;
    next[1] = next[0] + next[1];
    next.erase(next.begin());
    ret |= calc(next);

    next = vals;
    next[1] = next[0] - next[1];
    next.erase(next.begin());
    ret |= calc(next);

    next = vals;
    next[1] = next[0] * next[1];
    next.erase(next.begin());
    ret |= calc(next);

    next = vals;
    next[1] = next[0] / next[1];
    next.erase(next.begin());
    ret |= calc(next);

    next = vals;
    next[next.size()-2] = next[next.size()-2] + next[next.size()-1];
    next.erase(next.end()-1);
    ret |= calc(next);

    next = vals;
    next[next.size()-2] = next[next.size()-2] - next[next.size()-1];
    next.erase(next.end()-1);
    ret |= calc(next);

    next = vals;
    next[next.size()-2] = next[next.size()-2] * next[next.size()-1];
    next.erase(next.end()-1);
    ret |= calc(next);

    next = vals;
    next[next.size()-2] = next[next.size()-2] / next[next.size()-1];
    next.erase(next.end()-1);
    ret |= calc(next);

    return ret;
}

bool back(int depth, vector<double> vals) {
    if(depth==4) return calc(vals);

    bool ret=false;
    vector<double> next;
    for(int i=0;i<4;i++) {
        if(!visited[i]) {
            visited[i]=true;
            next = vals; next.push_back(arr[i]);
            ret |= back(depth+1, next);
            if(depth!=0) {
                next = vals; next.back() += arr[i];
                ret |= back(depth+1, next);

                next = vals; next.push_back(-arr[i]);
                ret |= back(depth+1, next);
                next = vals; next.back() -= arr[i];
                ret |= back(depth+1, next);

                next = vals; next.back() *= arr[i];
                ret |= back(depth+1, next);

                next = vals; next.back() /= arr[i];
                ret |= back(depth+1, next);
            }
            visited[i]=false;
        }
    }
    return ret;
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int t; cin >> t;
    while(t--) {
        for(int i=0;i<4;i++) cin >> arr[i];
        cout << (back(0, {}) ? "YES\n" : "NO\n");
    }
}