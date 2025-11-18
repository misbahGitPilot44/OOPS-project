# Program to calculate Mean & Median for Continuous Grouped Data (length = 10)

# Step 1: Input the class intervals and their frequencies
# Example: lengths in cm (lower limit, upper limit, frequency)
data = [
    (0, 10, 5),
    (10, 20, 8),
    (20, 30, 10),
    (30, 40, 12),
    (40, 50, 15),
    (50, 60, 20),
    (60, 70, 18),
    (70, 80, 10),
    (80, 90, 7),
    (90, 100, 5)
]

# Step 2: Mean calculation
midpoints = [(low + high) / 2 for low, high, _ in data]
frequencies = [f for _, _, f in data]
N = sum(frequencies)  # Total frequency

sum_fx = sum(m * f for m, f in zip(midpoints, frequencies))
mean = sum_fx / N

# Step 3: Median calculation
cumulative_freq = []
total = 0
for f in frequencies:
    total += f
    cumulative_freq.append(total)

median_class_index = None
for i, cf in enumerate(cumulative_freq):
    if cf >= N / 2:
        median_class_index = i
        break

L = data[median_class_index][0]            # Lower boundary of median class
F = cumulative_freq[median_class_index - 1] if median_class_index != 0 else 0
f_m = frequencies[median_class_index]      # Frequency of median class
h = data[median_class_index][1] - data[median_class_index][0]  # Class width

median = L + ((N / 2 - F) / f_m) * h

# Step 4: Output results
print(f"Mean: {mean:.2f}")
print(f"Median: {median:.2f}")
