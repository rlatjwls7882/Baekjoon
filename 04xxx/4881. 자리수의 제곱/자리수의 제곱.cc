#include<bits/stdc++.h>
using namespace std;

int AtoB(int A, int B) {
    map<int, int> mapA;
    for(int cnt=1;;cnt++) {
        if(mapA.find(A)!=mapA.end()) break;
        mapA[A]=cnt;
        int tmp=0;
        while(A) {
            tmp += pow(A%10, 2);
            A/=10;
        }
        A=tmp;
    }

    set<int> setB;
    for(int cnt=1;;cnt++) {
        if(mapA.find(B)!=mapA.end()) return mapA[B]+cnt;
        if(setB.count(B)) return 0;
        setB.insert(B);
        int tmp=0;
        while(B) {
            tmp += pow(B%10, 2);
            B/=10;
        }
        B=tmp;
    }
}

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        int A, B; cin >> A >> B;
        if(!A) break;
        cout << A << ' ' << B << ' ' << min(AtoB(A, B), AtoB(B, A)) << '\n';
    }
}