# Complete Algorithm Guide for FAANG + Competitive Programming

## **1. Array & String Algorithms**

### Basic Techniques
- **Two Pointers**: Fast-slow, opposite ends, same direction
- **Sliding Window**: Fixed size, variable size, shrinkable/non-shrinkable
- **Prefix Sums**: 1D, 2D, difference arrays
- **Kadane's Algorithm**: Maximum subarray, circular array variant
- **Dutch National Flag**: 3-way partitioning, quick sort partition
- **Boyer-Moore Majority Vote**: Finding majority element

### String Algorithms
- **KMP (Knuth-Morris-Pratt)**: Pattern matching with failure function
- **Rabin-Karp**: Rolling hash for pattern matching
- **Z-Algorithm**: Finding occurrences of pattern in text
- **Manacher's Algorithm**: Finding all palindromic substrings in O(n)
- **Suffix Array**: Construction and applications
- **LCP (Longest Common Prefix)**: Array construction
- **Trie**: Construction, prefix matching, auto-complete
- **Aho-Corasick**: Multiple pattern matching
- **Edit Distance**: Levenshtein distance, variants

## **2. Searching & Sorting**

### Binary Search Variants
- **Basic Binary Search**: On sorted arrays
- **Binary Search on Answer**: Finding optimal value
- **Rotated Array Search**: Finding pivot, searching in rotated arrays
- **Peak Finding**: 1D and 2D variants
- **Matrix Search**: Row-wise and column-wise sorted
- **Ternary Search**: Finding maximum/minimum in unimodal functions

### Sorting Algorithms
- **QuickSort**: Randomized, 3-way partitioning
- **MergeSort**: Bottom-up, counting inversions
- **HeapSort**: Using priority queues
- **Counting Sort**: For limited range integers
- **Radix Sort**: For integers and strings
- **Bucket Sort**: For uniformly distributed data

## **3. Tree Algorithms**

### Binary Trees
- **Traversals**: Preorder, inorder, postorder (recursive + iterative)
- **Level Order**: BFS, zigzag traversal
- **Tree Construction**: From traversals, serialize/deserialize
- **LCA (Lowest Common Ancestor)**: Binary lifting, Euler tour
- **Tree Diameter**: Two DFS approach
- **Path Sum Problems**: Root to leaf, any path

### Binary Search Trees
- **BST Operations**: Insert, delete, search, validate
- **BST Iterator**: In-order traversal iterator
- **Range Queries**: Sum, count in range

### Advanced Tree Structures
- **Segment Trees**: Point update, range query, lazy propagation
- **Fenwick Tree (BIT)**: Prefix sums, range updates
- **Trie**: Insertion, search, prefix operations
- **Suffix Trees**: Construction and applications

## **4. Graph Algorithms**

### Traversal & Basic Algorithms
- **DFS**: Recursive, iterative, connected components
- **BFS**: Level-wise traversal, shortest path in unweighted graphs
- **Topological Sort**: Kahn's algorithm, DFS-based
- **Cycle Detection**: Directed and undirected graphs
- **Bipartite Check**: Using DFS/BFS coloring

### Shortest Path Algorithms
- **Dijkstra's Algorithm**: Single source shortest path
- **Bellman-Ford**: Handling negative weights, detecting negative cycles
- **Floyd-Warshall**: All pairs shortest path
- **Johnson's Algorithm**: All pairs with negative edges

### Minimum Spanning Tree
- **Kruskal's Algorithm**: Using Union-Find
- **Prim's Algorithm**: Using priority queue

### Advanced Graph Algorithms
- **Tarjan's Algorithm**: Strongly connected components, bridges, articulation points
- **Kosaraju's Algorithm**: Strongly connected components
- **Maximum Flow**: Ford-Fulkerson, Edmonds-Karp
- **Maximum Bipartite Matching**: Hungarian algorithm, Hopcroft-Karp

## **5. Dynamic Programming**

### Basic DP Patterns
- **Linear DP**: Fibonacci, climbing stairs, house robber
- **Grid DP**: Unique paths, minimum path sum
- **Subsequence DP**: LIS, LCS, edit distance
- **Palindrome DP**: Longest palindromic subsequence/substring

### Advanced DP
- **Knapsack Variants**: 0/1, unbounded, bounded, fractional
- **Interval DP**: Matrix chain multiplication, burst balloons
- **State Machine DP**: Buy/sell stock problems
- **Digit DP**: Counting numbers with specific properties
- **Bitmask DP**: Traveling salesman, subset enumeration
- **DP on Trees**: Tree DP, rerooting technique
- **Convex Hull Optimization**: Optimizing DP transitions

## **6. Data Structures**

### Basic Data Structures
- **Stack**: Monotonic stack, expression evaluation
- **Queue**: Circular queue, deque, priority queue
- **Hash Tables**: Collision handling, perfect hashing
- **Heap**: Binary heap, operations, heap sort

### Advanced Data Structures
- **Disjoint Set Union (DSU)**: Path compression, union by rank
- **Segment Tree**: Range queries, lazy propagation, persistent segment tree
- **Fenwick Tree**: 2D BIT, range updates
- **Sparse Table**: Range minimum query, immutable arrays
- **Heavy-Light Decomposition**: Path queries on trees
- **Centroid Decomposition**: Tree path problems
- **Sqrt Decomposition**: Mo's algorithm, square root optimization

## **7. Mathematical Algorithms**

### Number Theory
- **GCD/LCM**: Euclidean algorithm, extended GCD
- **Modular Arithmetic**: Modular inverse, Chinese remainder theorem
- **Prime Numbers**: Sieve of Eratosthenes, segmented sieve
- **Factorization**: Trial division, Pollard's rho
- **Fast Exponentiation**: Binary exponentiation, matrix exponentiation

### Combinatorics
- **Permutations & Combinations**: With repetition, without repetition
- **Catalan Numbers**: Applications and computation
- **Inclusion-Exclusion Principle**: Counting problems
- **Generating Functions**: Solving recurrence relations

### Linear Algebra
- **Matrix Operations**: Multiplication, determinant, inverse
- **Gaussian Elimination**: Solving linear systems
- **Matrix Exponentiation**: For linear recurrences

## **8. Greedy Algorithms**

### Classic Problems
- **Activity Selection**: Interval scheduling
- **Huffman Coding**: Optimal prefix codes
- **Fractional Knapsack**: Greedy choice
- **Job Scheduling**: Minimizing completion time
- **Minimum Coins**: Greedy coin change

### Advanced Greedy
- **Exchange Arguments**: Proving greedy correctness
- **Matroids**: Greedy algorithms on matroids

## **9. Backtracking & Branch and Bound**

### Backtracking Patterns
- **N-Queens**: Placing queens without conflicts
- **Sudoku Solver**: Constraint satisfaction
- **Permutations/Combinations**: All possible arrangements
- **Subset Generation**: Power set, subset sum
- **Graph Coloring**: Vertex coloring problems

### Optimization
- **Branch and Bound**: TSP, knapsack optimization
- **Pruning Techniques**: Alpha-beta pruning, constraint propagation

## **10. Bit Manipulation**

### Basic Operations
- **Bitwise Operations**: AND, OR, XOR, NOT, shifts
- **Bit Tricks**: Count set bits, check power of 2
- **Subset Enumeration**: Iterating through subsets
- **Gray Code**: Binary reflected Gray code

### Advanced Techniques
- **Bitmask DP**: State compression using bits
- **XOR Properties**: Finding unique elements
- **Bit Manipulation in Trees**: LCA using binary lifting

## **11. Computational Geometry**

### Basic Concepts
- **Point & Line**: Distance, slope, intersection
- **Polygon**: Area, perimeter, point inside polygon
- **Convex Hull**: Graham scan, Jarvis march
- **Line Sweep**: Closest pair of points, intersection detection

### Advanced Topics
- **Voronoi Diagrams**: Nearest neighbor queries
- **Delaunay Triangulation**: Mesh generation

## **12. String Matching & Processing**

### Pattern Matching
- **KMP Algorithm**: Failure function, pattern matching
- **Rabin-Karp**: Rolling hash, multiple pattern matching
- **Boyer-Moore**: Bad character, good suffix heuristics
- **Aho-Corasick**: Multiple pattern matching with trie

### String Processing
- **Suffix Arrays**: Construction, LCP array
- **Suffix Trees**: Online construction, applications
- **Palindrome Algorithms**: Manacher's algorithm

## **13. Game Theory**

### Basic Concepts
- **Nim Game**: XOR game, winning/losing positions
- **Minimax**: Two-player zero-sum games
- **Alpha-Beta Pruning**: Optimization for game trees
- **Sprague-Grundy Theorem**: Impartial games

## **14. Network Flow**

### Maximum Flow
- **Ford-Fulkerson**: Augmenting paths
- **Edmonds-Karp**: BFS-based implementation
- **Dinic's Algorithm**: Blocking flows
- **Push-Relabel**: Preflow-push algorithms

### Applications
- **Maximum Bipartite Matching**: Using max flow
- **Minimum Cut**: Max-flow min-cut theorem
- **Multi-commodity Flow**: Multiple source-sink pairs

## **15. Approximation Algorithms**

### Basic Concepts
- **Approximation Ratio**: Quality measure
- **Greedy Approximations**: Set cover, vertex cover
- **PTAS & FPTAS**: Polynomial-time approximation schemes

## **Practice Strategy**

### For FAANG Interviews
1. Focus on categories 1-5 (Array, Search, Tree, Graph, DP)
2. Master implementation of basic algorithms
3. Practice on LeetCode medium/hard problems
4. Understand time/space complexity analysis

### For Competitive Programming
1. Cover all categories comprehensively
2. Practice on Codeforces, AtCoder, TopCoder
3. Learn to implement algorithms quickly and correctly
4. Focus on contest-style problem solving

### Implementation Tips
- Practice coding algorithms from scratch
- Understand edge cases and boundary conditions
- Learn to debug efficiently
- Master template code for common algorithms
- Practice under time pressure

### Complexity Analysis
- Always analyze time and space complexity
- Understand amortized analysis
- Know when to use which algorithm based on constraints
- Practice complexity calculations for nested loops and recursive algorithms