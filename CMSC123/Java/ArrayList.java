public class ArrayList { 
    int[] a; 
    int ctr; 
    int size; 
 
    ArrayList() { 
        a = new int[10]; 
        ctr = 0; 
        size = 0; 
    } 

    public void addItem(int item) { 
        if(ctr == a.length) { 
            resize(); 
        }

        a[ctr] = item; 
        ctr++; 
        size++; 
    }

    public void addItem(int item, int position) { 
        if(position > size || position < 1) { 
            System.out.print("Invalid position "); 
            return; 
        }

        if(ctr == a.length) {  
            resize(); 
        }

        int location = position­-1; 
        
        for(int i = ctr; i > location; i--­­) { 
            a[i] = a[i­-1]; 
        }

        a[location] = item; 
        size++; 
        ctr++; 
    } 

    public boolean removeItem(int item) { 
        if(ctr == 0)
            return false;
        else
        if     
    }

    public boolean removeItemAtPosition(int position) { 
        //solution here 
    }

    public boolean removeAllItems(int item) { 
        //solution here 
    }

    public int size() { 
        return size; 
    } 
 
    private void resize() { 
        int[] b = new int[a.length * 2]; 
        
        for(int i = 0; i < a.length; i++) { 
            b[i] = a[i]; 
        }

        a = b; 
    }

    public String toString() { 
        String s = ""; 
        
        for(int i = 1; i <= size; i++) { 
            s += a[i­-1] + " "; 
        }

        return s; 
    }

    public static void main(String[] args) { 
        ArrayList ar = new ArrayList(); 
        //addItem(item) 
        System.out.println("ADDING ITEMS"); 
            //when array is not full 
            for(int i = 0; i < ar.a.length; i++) { 
                ar.addItem(i+1); 
            } 

            System.out.println(ar+" should be:1 2 3 4 5 6 7 8 9 10"); 
            //when array is full 
            ar.addItem(11); 
            System.out.println(ar+" should be:1 2 3 4 5 6 7 8 9 10 11"); 
 
            //addItem(item, position) 
            System.out.println("ADDING ITEMS GIVEN POSITION"); 
            //at a position <= size 
            ar.addItem(12, 2); 
            System.out.println(ar+" should be:1 12 2 3 4 5 6 7 8 9 10 11 "); 
            //at a position < 0 
            ar.addItem(12, ­1); 
            System.out.println(ar+" should be: Invalid position 1 12 2 3 4 5 6 
                                7 8 9 10 11"); 
            //at a position > size 
            ar.addItem(12, 12); 
            System.out.println(ar+" should be:1 12 2 3 4 5 6 7 8 9 10 12 11 "); 
 
 
        //removeItem(item) 
        System.out.println("REMOVING ITEMS"); 
            //an item found in the array 
            ar.removeItem(12); 
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12 11"); 
            //an item not in the array 
            ar.removeItem(13); 
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12 11 "); 
            //an item at the end of the array 
            ar.removeItem(11); 
            System.out.println(ar+" should be: 1 2 3 4 5 6 7 8 9 10 12"); 
            //an item at the beginning of the array 
            ar.removeItem(1); 
            System.out.println(ar+" should be:2 3 4 5 6 7 8 9 10 12"); 
 
 
        //removeItem(position) 
 
        System.out.println("REMOVING ITEMS GIVEN POSITION"); 
            //valid position:middle 
            ar.removeItemAtPosition(3); 
            System.out.println(ar+" should be:2 3 5 6 7 8 9 10 12"); 
            //valid position:leftmost 
            ar.removeItemAtPosition(1); 
            System.out.println(ar+" should be: 3 5 6 7 8 9 10 12"); 
            //valid position:rightmost 
            ar.removeItemAtPosition(8); 
            System.out.println(ar+" should be: 3 5 6 7 8 9 10");             //invalid positions: < 1 
            ar.removeItemAtPosition(0); 
            System.out.println(ar+" should be:3 5 6 7 8 9 10"); 
            //invalid positions: >size 
            ar.removeItemAtPosition(8); 
            System.out.println(ar+" should be:3 5 6 7 8 9 10"); 
 
 
        //removeAllItems(item) 
        System.out.println("REMOVING ALL ITEMS"); 
            //only one item 
            ar.removeAllItems(3); 
            System.out.println(ar+" should be:5 6 7 8 9 10"); 
            //many same items 
            ar.addItem(8); 
            ar.removeAllItems(8); 
            System.out.println(ar+" should be:5 6 7 9 10"); 
    } 
} 
 
 
 
 