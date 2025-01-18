#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    while(true) {
        int x, n; cin >> x >> n;
        if(cin.fail()) break;
        vector<int> lego(n);
        for(int i=0;i<n;i++) cin >> lego[i];
        sort(lego.begin(), lego.end());

        int left=0, right=n-1;
        while(left<right && lego[left]+lego[right]!=x*10000000) {
            if(lego[left]+lego[right]>x*10000000) right--;
            else left++;
        }

        if(left<right && lego[left]+lego[right]==x*10000000) {
            cout << "yes" << ' ' << lego[left] << ' ' << lego[right] << '\n';
        } else {
            cout << "danger\n";
        }
    }
}