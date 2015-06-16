def max_from_array(a):
    m = a[0]

    for n in a:
        m = max(n,m)

    return m
