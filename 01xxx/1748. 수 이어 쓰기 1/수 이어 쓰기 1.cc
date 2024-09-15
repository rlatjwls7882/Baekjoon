#include<bits/stdc++.h>

using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;
    int len = int(log10(N)+1);

    int size=0;
    for(int i=1;i<=len;i++) {
        if(i==len) {
            size += (N-(pow(10, i-1)-1))*i;
        } else {
            size += (pow(10, i)-pow(10, i-1))*i;
        }
    }
    cout << size;
}