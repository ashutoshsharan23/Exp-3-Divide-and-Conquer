# Exp-3-Divide-and-Conquer
Divide and Conquer - Summary for Viva Preparation

Definition:
Divide and Conquer is an algorithmic paradigm that breaks a problem into smaller subproblems, solves them recursively, and combines the results to get the final solution.

Steps:

    Divide – Split the problem into smaller subproblems.
    Conquer – Solve each subproblem recursively.
    Combine – Merge the results to solve the original problem.

Common Algorithms:

    Merge Sort – Sorts an array by recursively dividing and merging. (O(n log n))
    Quick Sort – Uses a pivot to partition and sort recursively. (Best: O(n log n), Worst: O(n²))
    Binary Search – Searches in a sorted array by repeatedly dividing the search space. (O(log n))
    Strassen’s Matrix Multiplication – Multiplies matrices faster than the naive approach. (O(n².81))

Key Differences:

    Divide and Conquer vs. Dynamic Programming: Divide and Conquer solves problems independently, while Dynamic Programming stores and reuses solutions to subproblems.
    ### **Time Complexity of Divide and Conquer Algorithms**  

| **Algorithm**                   | **Recurrence Relation**        | **Time Complexity**         |
|----------------------------------|--------------------------------|-----------------------------|
| **Merge Sort**                   | \( T(n) = 2T(n/2) + O(n) \)    | **O(n log n)**             |
| **Quick Sort** (Best/Average)     | \( T(n) = T(n/2) + O(n) \)     | **O(n log n)**             |
| **Quick Sort** (Worst)            | \( T(n) = T(n-1) + O(n) \)     | **O(n²)**                  |
| **Binary Search**                 | \( T(n) = T(n/2) + O(1) \)     | **O(log n)**               |
| **Strassen’s Matrix Multiplication** | \( T(n) = 7T(n/2) + O(n^2) \) | **O(n².81)**               |
| **Karatsuba Algorithm (Multiplication)** | \( T(n) = 3T(n/2) + O(n) \) | **O(n^{\log_2 3}) \approx O(n^{1.58})** |
| **Closest Pair of Points**        | \( T(n) = 2T(n/2) + O(n \log n) \) | **O(n log² n)** (can be optimized to O(n log n)) |

### **Master Theorem (for solving recurrence relations)**
For recurrence relations of the form:  
\[
T(n) = aT(n/b) + O(n^d)
\]
- **Case 1**: If \( d > \log_b a \), then **O(n^d)**  
- **Case 2**: If \( d = \log_b a \), then **O(n^d \log n)**  
- **Case 3**: If \( d < \log_b a \), then **O(n^{\log_b a})**  
These are the problem which are releated to Sorting-and-Searching are solved in the given expirement 🚀🚀🚀: -
>> 1. Longest Nice Substring- https://leetcode.com/problems/maximum-depth-of-binary-tree/
>>    
>> 2. Max Subarray- https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
>> 
>> 3. The Skyline Problem- https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
>>    
