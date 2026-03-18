#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace std;
using namespace __gnu_pbds;

template <typename T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

int h[100'000];

int main() {
    cin.tie(0)->sync_with_stdio(0);
    int n; cin >> n;

    ordered_set<int> l, r;
    for(int i=0;i<n;i++) {
        cin >> h[i];
        l.insert(h[i]);
    }

    int cnt=0;
    for(int i=0;i<n;i++) {
        l.erase(h[i]);
        int Rcnt = r.size()-r.order_of_key(h[i]);
        int Lcnt = l.size()-l.order_of_key(h[i]);
        r.insert(h[i]);
        cnt += Rcnt*2<Lcnt || Lcnt*2<Rcnt;
    }
    cout << cnt;
}