
# Data Structures

| **Data Structure**            | Description                                                        | Time Complexity                                                                                                                                         |
|-------------------------------|--------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------|
| **Arrays**                    | Ordered collection of elements, accessible by index.               | Access by index: O(1)<br>Search: O(n)<br>Insertion/Deletion (at the end): O(1)<br>Insertion/Deletion (in the middle): O(n)                              |
| **Linked Lists**              | Series of nodes where each node points to the next.                | Access/Search: O(n)<br>Insertion/Deletion (at the beginning): O(1)<br>Insertion/Deletion (in the middle): O(1) if the position is known, O(n) otherwise |
| **Stacks**                    | Collection with Last-In, First-Out (LIFO) access.                  | Push/Pop/Peek: O(1)                                                                                                                                     |
| **Queues**                    | Collection with First-In, First-Out (FIFO) access.                 | Enqueue/Dequeue/Peek: O(1)                                                                                                                              |
| **Hash Tables**               | Key-value pairs with fast retrieval using a hash function.         | Average Case: O(1), Worst Case: O(n) for collisions                                                                                                     |
| **Trees**                     | Hierarchical structure with nodes connected by edges.              | Search/Insertion/Deletion: O(log n) - Balanced Tree, otherwise: O(n)                                                                                    |
| **Graphs**                    | Nodes connected by edges, can be directed or undirected.           | Traverse/Search/Insertion/Deletion: O(V + E) or O(n)                                                                                                    |
| **Heaps**                     | Binary tree-based structure with specific order property.          | Insert: O(log n), Extract-Min/Max: O(1)                                                                                                                 |
| **Trie**                      | Tree-like structure for strings; each node represents a character. | Search/Insertion/Deletion: O(m), where m is the length of the key                                                                                       |
| **Disjoint Set (Union-Find)** | Collection of disjoint sets with union and find operations.        | Union/Find: Nearly constant time with optimizations                                                                                                     |



# Common Graph Algorithms

## Depth-First Search (DFS):
- **description:**
  Travel as deep as we can in one direction before backtracking (so we won't stuck in an infinite loop)
- Used for topological sorting, finding connected components, and detecting cycles.
- **Time Complexity:**
  - Linear Time: O(n)
  - n: number of Nodes

![DFS](src/DFS.png)

## Breadth-First Search (BFS):
- **description:** Traverses a graph layer by layer (start from the closest).
- Useful for finding the shortest path in an unweighted graph.
- **Time Complexity:**
  - Linear Time: O(n)
  - n: number of Nodes

![DFS](src/BFS.png)


# Time Complexity
```
O : Time complexity
n : Input size (length , ...)

O(1) : Constant Time
i.e: return array[index]

O(log n) : Logarithmic Time
i.e: Binary search in a sorted array.

O(n) : Linear Time
i.e: Max, Min

O(n^2) : Quadratic Time
i.e: Bubble sort

O(1) < O(log n) < O(n) < O(n log n) < O(n^2)

- For example, if you have a loop that iterates through an array of size n, the runtime would be proportional to n.
Occurance of char:
	- double loop / search functions : O(n*n)
	- hashMap : O(n)+O(n)
	- int[26] : O(k)
```

# Refs
- https://cses.fi/problemset/
- https://leetcode.com/problems
<!-- https://www.youtube.com/watch?v=dZ_6MS14Mg4 -->
