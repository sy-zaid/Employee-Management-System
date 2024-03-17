# # Example of loading Pima Indians CSV dataset
# from csv import reader
#
#
# # Load a CSV file
# def load_csv(filename):
#     file = open(filename, "r")
#     lines = reader(file)
#     dataset = list(lines)
#     return dataset
#
#
# # Load dataset
# filename = "./pima-indians-diabetes/diabetes.csv"
# dataset = load_csv(filename)
# print("Loaded data file {0} with {1} rows and {2} columns".format(filename, len(dataset), len(dataset[0])))
# load_csv(filename)
#
#
#
#
# Example of loading Pima Indians CSV dataset
from csv import reader


# Load a CSV file
def load_csv2(filename):
    file = open(filename, "r")
    lines = reader(file)
    dataset = list()
    rec_row = None
    for row in lines:
        if not row:
            continue
        else:
            for item_ndx in range(len(row)):
                try:
                    row[item_ndx] = float(row[item_ndx].strip())
                except:
                    continue
            dataset.append(row)
    return dataset


# Load dataset
filename = "./pima-indians-diabetes/diabetes.csv"
dataset = load_csv2(filename)
print("Loaded data file {0} with {1} rows and {2} columns".format(filename, len(dataset), len(dataset[0])))
print(type(dataset[1][0]),dataset[1])
# load_csv2(filename)
