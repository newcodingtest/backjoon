//1988kb, 0ms
#include<iostream>
#include<algorithm>
using namespace std;
int arr[1001];

//���� ������ �͵��� �� ���� �ݺ��Ǳ⶧����
//���� ���ð��� �����ͺ����ϴ°� �̵�
//ex)		3 1 4 3 2
//����		1 2 3 3 4
//�ݺ�Ƚ��	5 4 3 2 1
// 1*5 + 2*4 + 3*3 + 3*2 + 4*1 = 32

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;
	for (int i = 0; i < N; i++)
		cin >> arr[i];
	sort(arr, arr + N);

	int sum = 0, ret = 0;
	for (int i = 0; i < N; i++)
	{
		sum += arr[i];
		ret += sum;
	}
	cout << ret;
	return 0;
}
