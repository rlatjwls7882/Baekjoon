#include<bits/stdc++.h>
using namespace std;

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int M, N, A, B, X, Y; cin >> M >> N >> A >> B >> X >> Y;
    int nextX = X+max(min(A, -X), 0);
    int nextY = Y+max(min(B, -Y), 0);
    if(0<=nextX && nextX<A && 0<=nextY && nextY<B) cout << nextX+nextY << '\n';
    else cout << "NEPATAIKYS";
}