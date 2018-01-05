def is_isogram(string):
    s = string.lower()
    for i in s:
        if s.count(i) > 1:
            return False
    return True
