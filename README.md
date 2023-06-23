# University of Michigan-Dearborn: Algorithms - Final Project

## Problem

Eiffel Baguette, a #1 student in the ESIEA who came to UMich for study, has one really bad habit - he never packs his luggage beforehand. As always, Eiffel sat down in his dorm room, trying to prepare his luggage in the last minute as usual. Due to the flight regulations, Eiffel was allowed to bring only one luggage, but it doesn't seem like all the items and souvenirs he wants to bring back to France will fit into that carrier.

Being a smart computer scientist aspirant, Eiffel started to design a table for each of the items he's got, and labeled 2 values - their volume, and their value to him.

For example:

| Item       | Laptop | UMich Hoodie | Camera | English Dictionary |
|------------|--------|--------------|--------|--------------------|
| **Volume** | 4      | 4            | 2      | 6                  |
| **Value**  | 7      | 8            | 10     | 4                  |

As stated before, as the volume of the luggage is limited, the total sum of the volume of the items should not exceed $w$. Given the table, find out how can Eiffel maximize the value of his luggage.

## Input

The first line of the input gives the number of test cases, $C$.
$C$ test cases follow. Each test case starts with a number of items Eiffel currently has, $N$, and the capacity of the luggage, $W$. Then, $N$ lines follow, each containing the name, volume, and value of the item. The name of the item doesn't have empty space, and is no longer than 20 characters, and the volume/value of the items are natural numbers no bigger than 1000.

Input data must be in the `input.txt` file at the project root.

## Output

For each test case, output one line containing the maximum value of the sum of the values of the item, followed by the item count. After that, print the name of the items in each line. If there are 2 different items which have same volume and value, either one can be printed as a solution.

## Limits

Memory limit: 64 MB.

Time limit: 2 seconds (2000 ms).

$1 \leq C \leq 50$

$1 \leq N \leq 100$

$1 \leq W \leq 1000$

## Sample

### Sample Input

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

### Sample Output

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
