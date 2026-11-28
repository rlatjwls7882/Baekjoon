#include<bits/stdc++.h>
using namespace std;

int main(){
    cin.tie(0)->sync_with_stdio(0);
    int t;cin>>t;
    while(t--){
        int n;string s;cin>>n>>s;
        if(s.front()=='L'&&s.back()=='R')cout<<"NO\n";
        else cout<<"YES\n";
    }
}
