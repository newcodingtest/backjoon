//2512kb, 8ms
#include<iostream>
#include<stack>
using namespace std;

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	stack<int> s;
	int K; cin >> K;
	for (int i = 0; i < K; i++)
	{
		int num; cin >> num;
		if (num == 0)
			s.pop();
		else
			s.push(num);
	}

	int ret = 0;
	while (!s.empty())
	{
		ret += s.top();
		s.pop();
	}
	cout << ret;
	return 0;
}