# SNHU-CS305-Portfolio


### 1. Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

The client for this project was Artemis Financial, a consulting firm that provides individualized financial plans to its users. This company requires secure software solutions to keep its clients' financial information secure. To this end, the project was to create a file verification step to the web application and to identify potential vulnerabilities either within the software as was provided or in the dependencies that were used in the software provided.

### 2. What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

The thing I did best when I found the security vulnerabilities was to report my findings and to provide solutions to the vulnerabilities. In particular, most of the vulnerabilities identified were due to the software using outdated dependencies, which required updating the dependencies, and those that existed within the code required input validation and secure error logging measures to provide information to the development team while keeping the logs secure from external clients. Software security provides security not only to the company to keep its own data secure, but also to those the company serves. Keeping user data secure gives confidence to the users, which encourages them to continue to do business with the company.

### 3. Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging part of the vulnerability assessment for me was identifying false positives within the checking tool. This is because I had to think carefully about how the program was used and what types of data would be flowing through it at any given time, and take that into account when reading through the CVEs. I feel this has given me a lot of practice with thinking through vulnerabilities and how they relate to the programs I will be working on going forward. 

### 4. How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

As I mentioned before, I implemented a checksum validation that uses SHA-256 to verify data integrity, which protects against potential injection of data during file transfer. Going forward, I will continue to use the Maven Dependency Check Tool when working on Java programs to identify vulnerable dependencies. I will also use similar mitigation techniques, such as enforcing the principle of least privilege by granting clients only the privileges they need to access what they need, and restricting further access from external clients.

### 5. How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

To make certain the code and application were functional and secure, I ran the program on my own system to check for functionality and verified the checksum generated matched the data as expected when the data was run through a SHA-256 algorithm cipher. To check if I introduced new vulnerabilities, I first ran the dependency check tool prior to code changes, and after making the changes, I ran it again. This check verified that the only vulnerabilities that were shown were already known about and would have further mitigation during development.

### 6. What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

For web application development in general, it is important to keep in mind Certificate Authorities to provide valid certificates for the website on which the application will run. This enables HTTPS and provides a layer of security for users and the organization as a whole. Next, the Maven Dependency Check Tool is valuable when developing Java-based web applications to research known vulnerabilities and potentially record new ones.

### 7. Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

From this assignment, I would show off my implementation of SHA-256 checksum verification within the application, as I feel this shows not only competence with the Java language but also verifies that I understand how the algorithm cipher works and why that algorithm was the one best suited to the task for this project.


