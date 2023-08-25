# Luggage Optimizer 🧳

Welcome to the Luggage Optimizer, a project developed as part of the Algorithms course at the University of Michigan-Dearborn. Help Eiffel Baguette, an exchange student, maximize the value of items he can pack in his luggage while adhering to flight regulations.

## 📖 Story

Eiffel Baguette, the top student from ESIEA studying at UMich, has a peculiar habit of packing his luggage at the last minute. With flight regulations allowing only one luggage, Eiffel needs to decide which items and souvenirs to pack to maximize their value to him.

Using his computer science skills, Eiffel labels each item with two values: its volume and its value to him. Your task is to help Eiffel determine the optimal set of items to pack.

## 📄 How to Use

1. **Input Data**: Place your input data in the `input.txt` file located at the project root.
2. **Run the Program**: Execute the `App.java` file located in the `src` directory.
3. **View the Output**: The program will display the maximum value of items Eiffel can pack, along with the names of the selected items.

## 📜 Input Format

- The first line specifies the number of test cases, `C`.
- Each test case starts with the number of items, `N`, and the luggage capacity, `W`.
- This is followed by `N` lines, each detailing the name, volume, and value of an item.

## 🖨️ Output Format

For each test case, the program outputs:

1. The maximum value of the sum of the item values.
2. The count of items selected.
3. The names of the selected items.

## 🚀 Sample

**Input**:
```
2
6 10
laptop 4 7
camera 2 10
xbox 6 6
grinder 4 7
dumbell 2 5
dictionary 10 4
6 17
laptop 4 7
camera 2 10
xbox 6 6
grinder 4 7
dumbell 2 5
dictionary 10 4
```

**Output**:
```
24 3
laptop
camera
grinder
30 4
laptop
camera
xbox
grinder
```


## 📏 Constraints

- Memory limit: 64 MB.
- Time limit: 2 seconds (2000 ms).
- 1 ≤ `C` ≤ 50
- 1 ≤ `N` ≤ 100
- 1 ≤ `W` ≤ 1000
