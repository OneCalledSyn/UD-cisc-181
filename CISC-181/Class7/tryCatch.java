File fl = new File(filename);
try {
    Scanner fn = new Scanner(f1);
    int row = 0;
    while (fn.hasNext()) {
        String line = fn.nextLine();
        arr[row] = line;
        row++;
    }
    fn.close();
}

catch (FileNotFoundException e) {
    System.out.println("e.getMessage()");
    System.exit(0);
}