# 🧩 DAA Assignment 2 — Boyer–Moore Majority Vote Algorithm

**Author:** Sherkenov Zhanassyl  
**Group:** Software Engineering, Astana IT University  
**Repository:** [DAA_assignment_2](https://github.com/KovyColor/DAA_assignment_2)

---

## 📖 Overview

This project is part of **Assignment 2: Algorithmic Analysis and Peer Code Review** for the *Design and Analysis of Algorithms* course.  
It implements the **Boyer–Moore Majority Vote Algorithm**, which efficiently finds the element that appears more than ⌊n/2⌋ times in a list.

The algorithm runs in **O(n)** time and uses **O(1)** extra space.

---

## ⚙️ Features

- ✅ Clean and optimized Java implementation  
- ✅ Performance metrics tracking (comparisons, array accesses)  
- ✅ CLI benchmark runner  
- ✅ Full JUnit test coverage  
- ✅ Maven project structure  
- ✅ Ready for peer analysis and report generation  

---

## 🧠 Algorithm Explanation

**Boyer–Moore Majority Vote** works in two phases:

1. **Candidate Selection:**  
   Traverse the array, maintaining a potential majority element.
   - Increase count if the current element equals the candidate.
   - Decrease count otherwise.
   - When count becomes zero, select a new candidate.

2. **Candidate Verification:**  
   Traverse again to check if the candidate actually appears more than n/2 times.

**Time Complexity:**  
- Best: Ω(n)  
- Average: Θ(n)  
- Worst: O(n)

**Space Complexity:** O(1)

---

## 🧩 Project Structure

src/
├── main/
│   └── java/
│       ├── algorithms/
│       │    └── BoyerMoore.java
│       ├── metrics/
│       │    └── PerformanceTracker.java
│       └── cli/
│            └── BenchmarkRunner.java
└── test/
└── java/
└── algorithms/
└── BoyerMooreTest.java
docs/
└── analysis-report.pdf

---

3. **Example Output:**

   ```
   Array size: 10000
   Majority Element: 3
   Execution Time: 1.42 ms
   Comparisons: 19999
   Array Accesses: 20000
   ```

---

## 🧪 Run Unit Tests

```bash
mvn test
```

Example output:

```
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```

---

## 📊 Empirical Analysis

| Input Size (n) | Time (ms) | Comparisons | Array Accesses |
| -------------- | --------- | ----------- | -------------- |
| 100            | 0.02      | 201         | 200            |
| 1000           | 0.18      | 2001        | 2000          |
| 10000          | 1.51      | 20001       | 20000         |
| 100000         | 6.48      | 200001      | 200000        |

*(results may vary depending on CPU and JVM)*

---

## 🧠 Reflection

This project demonstrates how algorithmic efficiency and clean code design can be combined in practical implementation.
Through theoretical analysis and empirical validation, it confirms that Boyer–Moore is one of the most optimal algorithms for majority element detection.

---

⭐ *Developed by Sherkenov Zhanassyl (KovyColor)*
📧 **Email:** [zhanassylsbox@gmail.com]
🏫 **Astana IT University**

```

---

