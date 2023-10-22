"""
--------------------------------------------
#Name: Abdullah Sherwani
#SID: 1730471
#CCID: asherwan
#AnonID: 1000338172
#CMPUT 274, Fall 2023

Assessment: Weekly Exercise 4 Preprocess
--------------------------------------------

TEMPLATE: ADD YOUR INFORMATION TO ABOVE

You must determine how to structure your solution.
Create your functions here and call them from under
if __name__ == "__main__"!
"""
import sys

def lowercase(x):
    x = x.lower()
    return x
def specials(x):
    x = x.replace("-","")
    notallowed = list("~`!@#$%^&*()_-+=|}{][':;><,./?")
    for index in x:
        for i in range(len(notallowed)):
            if index == notallowed[i]:
                x = x.replace(index,"")
    return x

def removenums(x):
    if x.isnumeric():
        return x
    else:
        out=""
        for index in x:
            if index in "1234567890":
                x = x.replace(index,out)
    return x

def stopwords(x):
    if x in Stop_Words:
        x = ""
    return x

processed_words = []
def proc(x):
    processed_words.append(x)
    #print(processed_words)

def preproccessing():
    y = input().split()
    for index in y:
        index = stopwords(removenums(specials(lowercase(index))))
        if not index == "":
            proc(index)
    print(*processed_words)
        
def keepdigits():
    y = input().split()
    for index in y:
        index = stopwords(specials(lowercase(index)))
        if not index == "":
            proc(index)
    print(*processed_words)

def keepstops():
    y = input().split()
    for index in y:
        index = removenums(specials(lowercase(index)))
        if not index == "":
            proc(index)
    print(*processed_words)

def keepsymbols():
    y = input().split()
    for index in y:
        index = stopwords(removenums(lowercase(index)))
        if not index == "":
            proc(index)
    print(*processed_words)

# Global List
Stop_Words = [
    "i", "me", "my", "myself", "we", "our",
    "ours", "ourselves", "you", "your",
    "yours", "yourself", "yourselves", "he",
    "him", "his", "himself", "she", "her",
    "hers", "herself", "it", "its", "itself",
    "they", "them", "their", "theirs",
    "themselves", "what", "which", "who",
    "whom", "this", "that", "these", "those",
    "am", "is", "are", "was", "were", "be",
    "been", "being", "have", "has", "had",
    "having", "do", "does", "did", "doing",
    "a", "an", "the", "and", "but", "if",
    "or", "because", "as", "until", "while",
    "of", "at", "by", "for", "with",
    "about", "against", "between", "into",
    "through", "during", "before", "after",
    "above", "below", "to", "from", "up",
    "down", "in", "out", "on", "off", "over",
    "under", "again", "further", "then",
    "once", "here", "there", "when", "where",
    "why", "how", "all", "any", "both",
    "each", "few", "more", "most", "other",
    "some", "such", "no", "nor", "not",
    "only", "own", "same", "so", "than",
    "too", "very", "s", "t", "can", "will",
    "just", "don", "should", "now"
    ]

if __name__ == "__main__":
    # Any code indented under this line will only be run
    # when the program is called directly from the terminal
    # using "python3 preprocess.py". This is directly relevant
    # to this exercise, so you should call your code from here.
    if len(sys.argv) == 1:
        preproccessing()
    else:
        if sys.argv[1] == "keep-digits":
            keepdigits()
        elif sys.argv[1] == "keep-stops":
            keepstops()
        elif sys.argv[1] == "keep-symbols":
            keepsymbols()
