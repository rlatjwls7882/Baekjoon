#include<bits/stdc++.h>
using namespace std;

int cnt=0;
int N, A, B, C;
void back(int a, int b, int c) {
    if(a+b+c==N) {
        cnt++;
        return;
    }
    if(a<A) back(a+1, b, c);
    if(b<B) back(a, b+1, c);
    if(c<C) back(a, b, c+1);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    cin >> N >> A >> B >> C;
    back(0, 0, 0);
    cout << cnt;
}