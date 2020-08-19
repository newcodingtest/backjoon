//1988kb, 0ms
#include<iostream>
#include<stack>
using namespace std;

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	string s;
	stack<int> st;
	for (int i = 0; i < N; i++)
	{
		cin >> s;
		if (s == "push")
		{
			int num; cin >> num;
			st.push(num);
		}
		else if (s == "pop")
		{
			if (st.empty())
				cout << -1 << '\n';
			else
			{
				cout << st.top() << '\n';
				st.pop();
			}
		}
		else if (s == "size")
			cout << st.size() << '\n';
		else if (s == "empty")
			cout << st.empty() << '\n';
		else if (s == "top")
		{
			if (st.empty())
				cout << -1 << '\n';
			else
				cout << st.top() << '\n';
		}
	}

	return 0;
}