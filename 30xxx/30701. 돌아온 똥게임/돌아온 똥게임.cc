#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    long long n, d; cin >> n >> d;
    vector<long long> monster, armor;
    for(int i=0;i<n;i++) {
        int a, x; cin >> a >> x;
        if(a==1) monster.push_back(x);
        else armor.push_back(x);
    }
    sort(monster.begin(), monster.end());
    sort(armor.begin(), armor.end());

    int cnt=armor.size(), idx1=0, idx2=0;
    while(idx1<monster.size() || idx2<armor.size()) {
        bool change=false;
        while(idx1<monster.size() && d>monster[idx1]) {
            cnt++;
            change=true;
            d += monster[idx1++];
        }
        if(idx2<armor.size()) {
            change=true;
            d *= armor[idx2++];
            if(d>1'000'000'000) {
                cout << n;
                return 0;
            }
        }
        if(!change) break;
    }
    cout << cnt;
}