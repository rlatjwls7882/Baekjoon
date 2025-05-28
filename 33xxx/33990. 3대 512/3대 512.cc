#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int n; cin >> n;
    
    int sum=-1;
    while(n--) {
        int a, b, c; cin >> a >> b >> c;
        if(a+b+c>=512 && abs(512-sum) > abs(512-(a+b+c))) {
            sum = a+b+c;
        }
    }
    cout << sum;
}