void filter (Collection c) {
    Iterator i = c.iterator();
    while (i.hasNext()) {
        if (!cond(i.next())) {
            i.remove();
        }
    }
}