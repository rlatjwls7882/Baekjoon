#include<bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    int n, a, b; cin >> n >> a >> b;

    int Fizz=0, Buzz=0, FizzBuzz=0;
    for(int i=1;i<=n;i++) {
        if(i%a==0 && i%b==0) FizzBuzz++;
        else if(i%a==0) Fizz++;
        else if(i%b==0) Buzz++;
    }
    cout << Fizz << ' ' << Buzz << ' ' << FizzBuzz;
}