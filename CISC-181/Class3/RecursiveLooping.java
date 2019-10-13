public static  int r1 (int x) {
    if (x==0) {
        return (x);
    }
    else {
        return (x+rl(x-1));
    }
}

System.out.println(r1(5);

public static int r4 (int x, int y) {
    if (x==1) {
        return(0);
    }
    else if (y%x==0) {
        return(1+r4(x-1,y));
    }
    else {
        return(0+r4(x-1,y));
    }
}

System.out.println(r4(11,12));

public static int r3 (int x, int[] y, int z) {
    if (z==y.length) {
        return(0);
    }
    else if (y[z] == x) {
        return(r3(x,y,z+1));
    }
    else {
        return(r3(x,y,z+1));
    }
}

int vb[] = {1, 0, 1, 1, 0, 0, 1, 0, 1 };
System.out.println(r3(1, vb, 0));