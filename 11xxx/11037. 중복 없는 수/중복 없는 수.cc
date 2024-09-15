#include <bits/stdc++.h>
using namespace std;

string s;
long long N, val;
bool chk=false;
bool used[10] = {false, };
void toLen(int depth, long long sum) {
    if(depth==s.length() && sum>N) {
        val=sum;
        chk=true;
        return;
    }

    for(int i=1;i<=9;i++) {
        if(chk) return;
        if(!used[i]) {
            used[i]=true;
            toLen(depth+1, sum*10+i);
            used[i]=false;
        }
    }
}

void toLenPlusOne(int depth, long long sum) {
    if(depth==s.length()+1 && sum>N) {
        val=sum;
        chk=true;
        return;
    }

    for(int i=1;i<=9;i++) {
        if(chk) return;
        if(!used[i]) {
            used[i]=true;
            toLenPlusOne(depth+1, sum*10+i);
            used[i]=false;
        }
    }
}

int main() {
    ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
    while(true) {
        cin >> N;
        if(cin.fail()) break;

        s = to_string(N);
        chk=false;
        toLen(0, 0);
        toLenPlusOne(0, 0);

        if(chk) cout << val << '\n';
        else cout << "0\n";
    }
}