#include<bits/stdc++.h>
using namespace std;

// bool isSosu(long long n) {
//     for(long long i=2;i*i<=n;i++) {
//         if(n%i==0) return false;
//     }
//     return true;
// }

int main() {
    ios::sync_with_stdio(0); cin.tie(0);
    int K; cin >> K;
    if(11<=K) cout << "23 * 89 = 2047 = ( 2 ^ 11 ) - 1\n";
    if(23<=K) cout << "47 * 178481 = 8388607 = ( 2 ^ 23 ) - 1\n";
    if(29<=K) cout << "233 * 1103 * 2089 = 536870911 = ( 2 ^ 29 ) - 1\n";
    if(37<=K) cout << "223 * 616318177 = 137438953471 = ( 2 ^ 37 ) - 1\n";
    if(41<=K) cout << "13367 * 164511353 = 2199023255551 = ( 2 ^ 41 ) - 1\n";
    if(43<=K) cout << "431 * 9719 * 2099863 = 8796093022207 = ( 2 ^ 43 ) - 1\n";
    if(47<=K) cout << "2351 * 4513 * 13264529 = 140737488355327 = ( 2 ^ 47 ) - 1\n";
    if(53<=K) cout << "6361 * 69431 * 20394401 = 9007199254740991 = ( 2 ^ 53 ) - 1\n";
    if(59<=K) cout << "179951 * 3203431780337 = 576460752303423487 = ( 2 ^ 59 ) - 1\n";
    // for(long long i=1;i<=62;i++) {
    //     if(!isSosu(i)) continue;
    //     long long cur = powl(2, i)-1;
    //     if(!isSosu(cur)) {
    //         int cnt=0;
    //         long long tmp = cur;
    //         long long j=2;
    //         for(;j*j<=cur;j++) {
    //             while(tmp%j==0) {
    //                 if(cnt) cout << "* "; 
    //                 cout << j << ' ';
    //                 tmp /= j;
    //                 cnt++;
    //             }
    //         }
    //         if(tmp!=1) cout << "* " << tmp << ' ';
    //         cout << "= " << cur << " = ( 2 ^ " << i << " ) - 1\n";
    //     }
    // }
}
