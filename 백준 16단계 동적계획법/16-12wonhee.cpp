//1996kb, 4ms
#include<iostream>
#include<algorithm>
using namespace std;
int A[1001];
int dp_inc[1001] = { 0 }; //dp_inc[x] : x번째 수를 마지막 원소로 가지는 LIS의 길이
int dp_dec[1001] = { 0 }; //dp_dec[x] : x번째 수를 첫번째 원소로 가지는 LDS의 길이

//수열의 위치에 대하여 현재 위치에서 가질수 있는 LIS와 LDS를 구하고 두 값을 합한 최대값을 찾는다.
//ex)A		1 5 2 1 4 3 4 5 2 1
//dp_inc	1 2 2 1 3 3 4 5 2 1
//dp_dec	1 5 2 1 4 3 3 3 2 1
//sum		2 7 4 2 7 6 7 8 4 2

int main()
{
	cin.sync_with_stdio(0);
	cin.tie(0); cout.tie(0);
	int N; cin >> N;


	for (int i = 0; i < N; i++)
		cin >> A[i];

	for (int i = 0; i < N; i++)
	{
		if (dp_inc[i] == 0)
			dp_inc[i] = 1;
		for (int j = 0; j < i; j++)
			if (A[i] > A[j])
				if (dp_inc[i] < dp_inc[j] + 1)
					dp_inc[i] = dp_inc[j] + 1;
	}

	for (int i = N-1; i >= 0; i--)
	{
		if (dp_dec[i] == 0)
			dp_dec[i] = 1;
		for (int j = N-1; j > i; j--)
			if (A[i] > A[j])
				if (dp_dec[i] < dp_dec[j] + 1)
					dp_dec[i] = dp_dec[j] + 1;
	}

	int ret = 0;
	for (int i = 0; i < N; i++)
		ret = max(ret, dp_inc[i] + dp_dec[i]);
	cout << ret - 1;
	return 0;
}