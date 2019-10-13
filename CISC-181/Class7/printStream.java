public void makefile() {
    File f1 = new File("testout.txt");
    try {
        PrintStream outfile = new PrintStream(f1);
        for (double[] x: newMatrix) {
            for (double y: x) {
                outfile.print(y + " ");
            }
            outfile.println();
        }
        outfile.close();
    }
    catch(IOException io) {
        System.out.println(io.getMessage());
    }
}