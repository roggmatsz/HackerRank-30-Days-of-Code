mealCost = float(input())
tipPercent = int(input())
taxPercent = int(input())

tip = mealCost * (tipPercent / 100)
tax = mealCost * (taxPercent / 100)
total = round(mealCost + tax + tip)

print("The total meal cost is " + \
    str(total) + " dollars.")
