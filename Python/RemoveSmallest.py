def remove_smallest(numbers):
    if not numbers:
        return []
    current_value = numbers[0]
    for i in numbers:
        if i < current_value:
            current_value = i
    numbers.remove(current_value)
    return numbers
