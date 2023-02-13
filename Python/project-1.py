# Project 1
l = [[1, 'a', ['cat'], 2], [[[3]], 'dog'], 4, 5]
res = []


def sep(lst):
    for i in lst:
        if isinstance(i, list):
            sep(i)
        else:
            res.append(i)


# Project 2
normal_list = [[1, 2], [3, 4], [5, 6, 7]]


def reversed(lst):
    lst.reverse()
    for i in lst:
        if isinstance(i, list):
            i.reverse()
    return lst


print(reversed(normal_list))
