TreeSet<Integer> tree = new TreeSet();
tree.add(12);
tree.add(63);
tree.add(34);
tree.add(45);
tree.add(16);
tree.add(22);
tree.add(54);

Iterator<Integer> it = tree.iterator();
while (it.hasNext()) {
     System.out.print(it.next() + " ");
}

System.out.println(tree.subSet(22,54));

if (tree.isEmpty()) {
     System.out.print("Tree Set is empty.");
} else {
     System.out.println("Tree Set size: " + tree.size());
}

System.out.println("First data: " + tree.first());
System.out.println("Last data: " + tree.last());

if (tree.remove(45)) {
      System.out.println("Data is removed from tree set");
} else {
      System.out.println("Data doesn't exist!");
}

tree.clear();
if (tree.isEmpty()) {
      System.out.print("Tree Set is empty.");
} else {
     System.out.println("Tree Set size: " + tree.size());
}
