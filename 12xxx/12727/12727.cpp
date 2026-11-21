#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    string res[] = {"005", "027", "143", "751", "935", "607", "903", "991", "335", "047", "943", "471", "055", "447", "463", "991", "095", "607", "263", "151", "855", "527", "743", "351", "135", "407", "903", "791", "135", "647"};
    int T; cin >> T;
    for(int i=1;i<=T;i++) {
        int n; cin >> n;
        cout << "Case #" << i << ": " << res[n-1] << '\n';
    }
}