//1988kb, 0ms
#include<iostream>
#include<stack>
using namespace std;

//문자열을 순차적으로 접근하면서 (이면 저장하고 )이면 이전에 저장한 (을 제거한다.
//문자열 순회 도중 )인데 저장된 (가 없거나 문자열을 모두 순회했을때 (가 남아있다면 NO
//아니라면 YES

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	for (int i = 0; i < N; i++)
	{
		stack<char> s;
		string sin; cin >> sin;
		bool c = true;
		for (int i = 0; i < sin.size(); i++)
		{
			if (sin[i] == '(')
				s.push('(');
			else
			{
				if (s.empty() || s.top() == ')')
				{
					c = false;
					break;
				}
				s.pop();
			}
		}
		if (!s.empty())
			c = false;

		if (c == true)
			cout << "YES" << '\n';
		else
			cout << "NO" << '\n';
	}
	return 0;
}