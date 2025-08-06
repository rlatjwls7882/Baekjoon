#include<bits/stdc++.h>
using namespace std;

typedef long long ll;
const int INF = 0x3f3f3f3f;
const ll LINF = 0x3f3f3f3f3f3f3f3f;

int outsideM[4000], outsideK[4000]; // left right up down

ll getCost(ll x1, ll x2, ll y1, ll y2) {
    return (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int Mx, My, a, Kx, Ky, b, M, K; cin >> Mx >> My >> a >> Kx >> Ky >> b >> M >> K;
    a++; b++;

    fill(outsideM, outsideM+a, INF);
    fill(outsideM+a, outsideM+3*a, -INF);
    fill(outsideM+3*a, outsideM+4*a, INF);
    while(M--) {
        int x, y; cin >> x >> y;
        outsideM[x-Mx] = min(outsideM[x-Mx], y);
        outsideM[x-Mx+a] = max(outsideM[x-Mx+a], y);
        outsideM[y-My+2*a] = max(outsideM[y-My+2*a], x);
        outsideM[y-My+3*a] = min(outsideM[y-My+3*a], x);
    }

    fill(outsideK, outsideK+b, INF);
    fill(outsideK+b, outsideK+3*b, -INF);
    fill(outsideK+3*b, outsideK+4*b, INF);
    while(K--) {
        int x, y; cin >> x >> y;
        outsideK[x-Kx] = min(outsideK[x-Kx], y);
        outsideK[x-Kx+b] = max(outsideK[x-Kx+b], y);
        outsideK[y-Ky+2*b] = max(outsideK[y-Ky+2*b], x);
        outsideK[y-Ky+3*b] = min(outsideK[y-Ky+3*b], x);
    }

    ll minCost = LINF;
    int resX1, resX2, resY1, resY2;
    for(int i=0;i<4*a;i++) {
        for(int j=0;j<4*b;j++) {
            if(outsideM[i]==INF || outsideM[i]==-INF || outsideK[j]==INF || outsideK[j]==-INF) continue;
            int x1, y1, x2, y2;
            if(i<2*a) {
                x1 = i%a+Mx;
                y1 = outsideM[i];
            } else {
                x1 = outsideM[i];
                y1 = i%a+My;
            }
            if(j<2*b) {
                x2 = j%b+Kx;
                y2 = outsideK[j];
            } else {
                x2 = outsideK[j];
                y2 = j%b+Ky;
            }
            ll cost = getCost(x1, x2, y1, y2);
            if(minCost>cost) {
                minCost = cost;
                resX1 = x1;
                resX2 = x2;
                resY1 = y1;
                resY2 = y2;
            }
        }
    }
    cout << minCost << '\n' << resX1 << ' ' << resY1 << '\n' << resX2 << ' ' << resY2;
}