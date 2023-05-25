# DSA-JAVA


##  Big-O notation  [https://www.bigocheatsheet.com/]

-   Omega   >   Best CASH
-   Theta   >   Average CASH
-   O       >   Worst CASH




>   Big-O with Array List `[Array with 3 values]`

-   mylist.add(15)          ->  O(1): No Re-indexing - If we do anything at last index
-   mylist.remove(4)        ->  O(1): No Re-indexing - If we do anything at last index
-   mylist.remove(0)        ->  O(n): We have to do Re-indexing, if we do something in the middle / start of the array
-   mylist.add(0, 23)       ->  O(n): We have to do Re-indexing, if we do something in the middle / start of the array


##  Notes

-   Drop the Constants  >   O(2n)       ->  O(n)
-   Drop Non-Dominents  >   O(n^2 + n)  ->  O(n^2)