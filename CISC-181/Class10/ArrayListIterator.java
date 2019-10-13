public static void main(String args[]) {
      ArrayList al = new ArrayList();          // Create an array list
      al.add("C");                             // add elements to the array list
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");

      System.out.print("Original contents of al: ");
      Iterator itr = al.iterator();            // Use iterator to display contents of al
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();

      ListIterator litr = al.listIterator();
      while(litr.hasNext()) {                  // Modify objects being iterated
         Object element = litr.next();
         litr.set(element + "+");              // concatenates “+” to each String
      }
      System.out.print("Modified contents of al: ");
      itr = al.iterator();  // sets itr to initial address of ArrayList (i.e., first element in list)
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();

      System.out.print("Modified list backwards: ");
      while(litr.hasPrevious()) {              // Now, display the list backwards
         Object element = litr.previous();
         System.out.print(element + " ");
       }
       System.out.println();
    }
