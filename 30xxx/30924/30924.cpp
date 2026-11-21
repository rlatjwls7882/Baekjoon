#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    vector<int> a, b;
    for(int i=1;i<=10000;i++) {
        a.push_back(i);
        b.push_back(i);
    }
    shuffle(a.begin(), a.end(), mt19937(random_device{}()));
    shuffle(b.begin(), b.end(), mt19937(random_device{}()));

    while(a.size()>1) {
        cout << "? A " << a.back() << '\n' << flush;
        int res; cin >> res;
        if(res) {
            int ans = a.back();
            a.clear();
            a.push_back(ans);
        } else {
            a.pop_back();
        }
    }
    
    while(b.size()>1) {
        cout << "? B " << b.back() << '\n' << flush;
        int res; cin >> res;
        if(res) {
            int ans = b.back();
            b.clear();
            b.push_back(ans);
        } else {
            b.pop_back();
        }
    }
    cout << "! " << a.back() + b.back();
}