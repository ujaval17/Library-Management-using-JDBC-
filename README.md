# <b>Library Management System (JDBC + MySQL) 📚</b>

## <b>Overview</b>
The **Library Management System** is a **Java-based** application that allows users to **manage a library database** using **JDBC and MySQL**. This system provides functionalities to **add, update, delete, search, and view books** in a structured manner. The project follows the **CRUD (Create, Read, Update, Delete)** operations to interact with the database efficiently.

## <b>Technologies Used</b>
- **Java** – Core programming language  
- **JDBC (Java Database Connectivity)** – For database connection  
- **MySQL** – Database for storing books  
- **DAO (Data Access Object) Pattern** – Structured database operations  
- **Maven (Optional)** – To manage dependencies  

---

## <b>Project Description</b>
This **Library Management System** is a **Java-based** application that enables users to **manage books** using **JDBC (Java Database Connectivity) and MySQL**.  
It follows a **CRUD (Create, Read, Update, Delete)** approach to handle books in a library efficiently.  

### 🔹 **Purpose of the Project**
- To develop a **console-based** library management system.
- To implement **JDBC** for database interaction.
- To perform **CRUD operations** on the **books table** in MySQL.
- To provide a **user-friendly menu-driven interface** for managing books.

### 🔹 **Project Scope**
- Allows **librarians** or **users** to manage books.
- Provides **basic database operations** like inserting, updating, deleting, and searching books.
- Can be further expanded with **GUI, authentication, and borrowing features**.

---

## <b>Key Features</b>
✅ **Insert Books** – Add new books to the database.  
✅ **View Books** – Display a list of available books.  
✅ **Search Books** – Find books by title or author.  
✅ **Update Books** – Modify book details.  
✅ **Delete Books** – Remove books from the database.  
✅ **Interactive Console Menu** – Simple CLI-based interaction.  
✅ **Persistent Storage** – All book data is stored in MySQL.  

---

## <b>Tools & Technologies Used</b>
🟢 **Java** – Core programming language.  
🟢 **JDBC (Java Database Connectivity)** – Database interaction.  
🟢 **MySQL** – Database for storing book records.  
🟢 **DAO Pattern** – Structured database access.  
🟢 **IDE (IntelliJ/Eclipse/VS Code)** – For development.  

---

## <b>How It Works (Step-by-Step)</b>
1️⃣ **User starts the application** via the console.  
2️⃣ **A menu is displayed**, asking the user to choose an option (Insert, Update, Delete, View, Search, Exit).  
3️⃣ **User enters details** (for adding/updating/searching books).  
4️⃣ **Database is updated** using **JDBC** queries.  
5️⃣ **Success or error messages** are displayed.  
6️⃣ **User can continue** or exit the application.  

---

## <b>Database Setup</b>
### 📌 **1. Create MySQL Database**
```sql
CREATE DATABASE LibraryDB;
USE LibraryDB;


## <b>Features</b>
✅ **Insert Books** – Add new book records into the database  
✅ **View Books** – Display all books available in the library  
✅ **Search Books** – Find books by title or author  
✅ **Update Books** – Modify book details  
✅ **Delete Books** – Remove books from the database  
✅ **Interactive Console Menu** – User-friendly CLI for smooth interaction  

---

## <b>Project Setup</b>
### <b>1️⃣ Clone the Repository</b>
```sh
git clone https://github.com/your-username/library-management-jdbc.git
cd library-management-jdbc
<b>2️⃣ Configure MySQL Database</b>
Open MySQL Workbench or Command Line and create a database:

sql
Copy
Edit
CREATE DATABASE LibraryDB;
USE LibraryDB;
Create the books table:

sql
Copy
Edit
CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(100),
    published_year INT
);
