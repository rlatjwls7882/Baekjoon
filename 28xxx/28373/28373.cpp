#include <algorithm>
#include <iostream>
#include <string>

using namespace std;

int main() {
  string S;
  getline(cin, S);
  transform(S.begin(), S.end(), S.begin(), ::tolower);

  for (int i = 0; i < S.length(); i++) {
    if (i + 1 < S.length() && S[i] == 's' && S[i + 1] == 's') {
      for (int j = 0; j < i; j++) {
        cout << S[j];
      }
      cout << 'B';
      for (int j = i + 2; j < S.length(); j++) {
        cout << S[j];
      }
      cout << endl;
    }
  }

  cout << S;
}