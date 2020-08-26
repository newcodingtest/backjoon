//8380kb, 392ms
#include<iostream>
#include<queue>
using namespace std;

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	queue<int> q;
	for (int i = 0; i < N; i++)
	{
		string s; cin >> s;
		if (s == "push")
		{
			int num; cin >> num;
			q.push(num);
		}
		else if(s=="pop")
		{
			cout << (q.empty() ? -1 : q.front()) << '\n';
			if(!q.empty())	
				q.pop();
		}
		else if (s == "size")
			cout << q.size() << '\n';
		else if (s == "empty")
			cout << q.empty() << '\n';
		else if (s == "front")
			cout << (q.empty() ? -1 : q.front()) << '\n';
		else if (s == "back")
			cout << (q.empty() ? -1 : q.back()) << '\n';
	}

	return 0;
}