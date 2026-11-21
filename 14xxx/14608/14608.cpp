#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    double K, c0, c1, a, b, N; cin >> K >> c0 >> c1 >> a >> b >> N;

    double dx = (b-a)/N;
    cout << ((c0/2*(b*b-a*a)+c1*(b-a))/N - (a*c0*dx+(N-1)/2*dx*dx*c0+c1*dx))/(c0*dx);
}