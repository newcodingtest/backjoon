//2512kb, 20ms
#include<iostream>
#include<stack>
#include<vector>
using namespace std;

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	stack<int> s; //1부터 순서대로 푸쉬할 스택변수
	int cnt = 1; //스택에 들어갈 숫자변수
	int N; cin >> N;
	bool c = true; //가능한지 체크할 변수
	vector<char> v; //+ - 저장 변수
	for (int i = 0; i < N; i++)
	{
		int num; cin >> num;
		while (s.empty() || s.top() < num) //num까지 push
		{
			s.push(cnt);
			++cnt;
			v.push_back('+');
		}
		while (!s.empty() && s.top() > num) //num전까지 pop
		{
			s.pop();
			v.push_back('-');
		}

		//이때 스택의 top과 입력받은 num이 같아야한다.
		if (s.empty()||s.top() != num)
		{
			c = false;
			break;
		}
		s.pop();
		v.push_back('-');
	}
	if (c == false)
		cout << "NO" << '\n';
	else
		for (int i = 0; i < v.size(); i++)
			cout << v[i] << '\n';

	return 0;
}