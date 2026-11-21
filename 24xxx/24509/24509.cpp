#include<bits/stdc++.h>
using namespace std;

struct stu {
    int X, A, B, C, D;
    stu(int X, int A, int B, int C, int D) {
        this->X=X;
        this->A=A;
        this->B=B;
        this->C=C;
        this->D=D;
    }
};

int main(void) {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int N; cin >> N;

    vector<stu> v;
    for(int i=0;i<N;i++) {
        int X, A, B, C, D; cin >> X >> A >> B >> C >> D;
        v.push_back(stu(X, A, B, C, D));
    }
    
    sort(v.begin(), v.end(), [](stu a, stu b) {return a.A==b.A ? a.X>b.X : a.A<b.A;});
    cout << v.back().X << ' ';
    v.pop_back();

    sort(v.begin(), v.end(), [](stu a, stu b) {return a.B==b.B ? a.X>b.X : a.B<b.B;});
    cout << v.back().X << ' ';
    v.pop_back();

    sort(v.begin(), v.end(), [](stu a, stu b) {return a.C==b.C ? a.X>b.X : a.C<b.C;});
    cout << v.back().X << ' ';
    v.pop_back();

    sort(v.begin(), v.end(), [](stu a, stu b) {return a.D==b.D ? a.X>b.X : a.D<b.D;});
    cout << v.back().X;
}