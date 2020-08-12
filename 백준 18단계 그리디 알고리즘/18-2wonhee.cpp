//2764kb, 28ms
#include<iostream>
#include<algorithm>
using namespace std;

// ������ �ð��� �������� �����ϸ� �ȴ�.
// ���� ������ ������ �����صе� ������ �ð����κ��� ���尡��� ȸ�� ���۽ð��� �����ϸ� ��. 
// ex) N=11
//1 4 O ---4
//3 5 X
//0 6 X
//5 7 O ---7
//3 8 X
//5 9 X
//6 10 X
//8 11 O ---11
//8 12 X
//2 13 X
//12 14 O ---14

bool compare(pair<int, int> p1, pair<int, int> p2)
{
	if (p1.second == p2.second)
		return p1.first < p2.first;
	return p1.second < p2.second;
}

pair<int, int> p[100001];
int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	for (int i = 0; i < N; i++)
		cin >> p[i].first >> p[i].second;
	sort(p, p + N, compare);
	
	int ret = 1, temp = p[0].second;// ó������ ������ �ð�������
	for (int i = 1; i < N; i++)
	{
		if (p[i].first >= temp)
		{
			temp = p[i].second;
			++ret;
		}
	}
	cout << ret;
	return 0;
}
