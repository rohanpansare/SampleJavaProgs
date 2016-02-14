/**
 * Created by Rohan Pansare on 1/24/2016.
 *
 */
/*


  Domains   Contests   Rank   Leaderboard   Jobs
 15
  rohan2005p

All Contests  30 Days of Code  Day 16: Sorting!
Day 16: Sorting!
by idlecool
Problem
Submissions
Leaderboard
Discussions

Start learning about Exceptions in Day 16's video or just jump into this sorting challenge!

Sorting is an important basic algorithmic concept used to organize data so coders can better solve problems. You may find our interactive article on widely-used sorting algorithms and this article on Insertion Sort helpful in solving today's problem.

The absolute difference between two integers, a and b, is |a−b|. The minimum absolute difference between two integers in a list A of positive integers, is the smallest absolute difference between any two integers in A.

Given a list A={a0,a1,…,aN−1} of unsorted integers, find and print the pair (or pairs) of elements having the minimum absolute difference.

Note: More than one pair of elements may have the same absolute difference.

Input Format

The first line contains a single integer N, denoting the length of list A.
The second line contains N space-separated integers, a0,a1,…,aN−1, representing the elements in A.

Constraints

2≤N≤2×105
−107≤Ai≤107
Ai≠Aj,where 0≤i<j≤N−1
Output Format

Print the space-separated pair of elements having the minimum absolute difference in ascending order. If more than one pair meets this criterion, print them consecutively, separated by a space, in ascending order on a single line. Because we are printing space-separated pairs, some elements may appear more than once in your output.

Sample Input 1

10
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854
Sample Output 1

-20 30
Explanation
The minimum absolute difference is 50 (ABS(30−(−20))=50). The only pair having this difference is (−20,30).

Sample Input 2

12
-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854 -520 -470
Sample Output 2

-520 -470 -20 30
Explanation
Our minimum absolute difference is 50. The pairs (−470,−520) and (−20,30) both have this difference.

Sample Input 3

4
5 4 3 2
Sample Output 3

2 3 3 4 4 5
Explanation
Our minimum absolute difference is 1. The pairs (2,3), (3,4), and (4,5) all have this difference. Notice that 3 and 4 appear multiple times, because they are components of more than one pair.

Note: Recall that pairs in the output must be printed in ascending order.

Submissions: 3582
Max Score: 75
Difficulty: Moderate
Download PDF
Suggest Edits
Collapse
Current Buffer (saved locally, editable)

Java 8


1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
8
        }
        9
        }
        Line: 4 Col: 24
        Run Code  Submit Code Upload Code as File
        Test against custom input
        Join us on IRC at #hackerrank on freenode for hugs or bugs.
        Contest Calendar | Blog | Scoring | Environment | FAQ | About Us | Support | Careers | Privacy Policy | Request a Feature

 */
import java.io.*;
import java.util.*;

public class Sorting {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        int[] arr = new int[noOfElements];
        int[] arr1 = new int[noOfElements];
        int diff = Integer.MAX_VALUE;
        int sIndex = 0;
        int j = 0;
        for (int i = 0; i < noOfElements; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j1 = 1; j1 < noOfElements; j1++) {
            int i = j1 - 1;
            int key = arr[j1];
            while (i >= 0 && key < arr[i]) {    // 1 2  3
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        //Arrays.sort(arr);
        for (int i = 0; i < noOfElements - 1; i++) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp <= diff) {
             diff=temp;
            }

        }

        for (int i = 0; i < noOfElements - 1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) == diff) {
                System.out.print(arr[i] + " " + arr[i+1] + " ");
            }
        }
//        for (int a    = 0; a < j; a++) {
//
//            System.out.print(arr[arr1[a]] + " " + arr[arr1[a]+1] + " ");
//            }

        }
    }

