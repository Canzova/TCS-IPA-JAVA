Question Statement:
Write a Java program to manage information about documents using object-oriented programming principles. You are required to create a class Document with the following attributes and methods:

Class: Document
Attributes:

id (int): A unique identifier for each document.
title (String): The title of the document.
folderName (String): The folder where the document is stored.
pages (int): The number of pages in the document.
Constructor: Create a parameterized constructor that initializes the id, title, folderName, and pages of the document.

Methods:

getId(): Returns the id of the document.
getTitle(): Returns the title of the document.
getFolderName(): Returns the folder name of the document.
getPages(): Returns the number of pages in the document.
You also need to write a method docsWithOddPages that accepts an array of Document objects and filters out the documents with an odd number of pages. The filtered documents should be sorted by their id in ascending order and returned.

Input:
First, input details of 4 documents (document ID, title, folder name, and number of pages) in sequence.
Each document's information is provided in the following order:
Document ID (integer)
Document title (string)
Document folder name (string)
Number of pages (integer)
Output:
After filtering and sorting the documents with an odd number of pages, output the details of the sorted documents, including the ID, title, folder name, and number of pages.
Example:
Input:

Copy code
101
Project Report
Work
45
102
Assignment
Study
50
103
Invoice
Work
33
104
Presentation
Office
22
Output:

Copy code
101 Project Report Work 45
103 Invoice Work 33
Requirements:
Use an array to store the Document objects.
Use a lambda expression to define the sorting logic based on the document id.
Implement getter methods for each attribute in the Document class.
Filter out documents with an odd number of pages and sort them by id in ascending order before outputting.