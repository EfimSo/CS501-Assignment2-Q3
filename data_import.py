import pandas as pd
import numpy as np

# CSV Dataset downloaded from 
# https://github.com/ekohrt/animal-fun-facts-dataset/blob/main/animal-fun-facts-dataset.csv

df = pd.read_csv("./animal-fun-facts-dataset.csv")
df = df[['animal_name', 'text'] ]                 # Extract animal nam and fact text from CSV

df["animal_name"] = df["animal_name"].apply(lambda word: word.capitalize())      # capitalize animal name
df = df.iloc[np.random.randint(df.shape[0], size=50), :]                         # Select 50 random facts

# # Join to a string for Kotlin hardcoding import
make_string = lambda data: f'listOf("{"\", \n\"".join(data.tolist())}")'
name, text = make_string(df["animal_name"]), make_string(df["text"])

print(name)
print(text)
