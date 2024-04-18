<h1 align="center" id="title">Yeet 👩🏻‍💻👩🏾‍💻🏝️👩🏽‍💻👩🏻‍💻</h1>

## Table of Contents
1. [Project Description](#project-description)
2. [Installation instructions](#installation-instructions)
3. [Usage](#usage)
4. [Contributing Instructions](#contributing-instructions)
5. [Credits and Acknowledgements](credits-and-acknowledgements)
6. [Licences](#licences)

   
## Project Description

- Aim: 	To create an easy-to-use, intuitive HR system that is extendable.
- Why?
   - A need to eradicate use of paper records within the business - improved organisation and reduced errors to employee records & schedules.
   - To combine separate physical diaries digitally, reducing potential conflicts.
   - Automated scheduling of appraisals - improved employee productivity & satisfaction.
   - Increased accessibility of resources to all employees.
   - Increased scalability potential of the business.


**The names and versions of libraries used:**
- React.js
- React Router DOM
- SpringBoot
- React Modal

### MVP
* [x] Enable a user to log in to the application.
* [x] Employees can request holidays, which will then need approval from their manager.
* [x] Managers can approve their employee's holidays.
* [x] Calendar-view to display an employee's holidays.
* [x] Employees can view and update their personal details.
* [x] Ensure different actions are available if you’re logged in as an employee or manager. 

### Extensions
* [x] Employees can update *(this will put the holiday through for approval again)* or delete existing holidays.
* [x] Add a counter for remaining holiday.
* [ ] Add a counter for number of holiday requests to approve, as a manager. 
* [ ] Add separate functionality for fiance team members - i.e. render a list of bank account details. 
* [ ] Add a colour picker feature to 'Hello' Statement based on a user's favourite colour. 
* [ ] Annual appraisal dates are displayed on the calendar.
* [ ] Appraisals are automatically booked on the calendar annually based on an employee's start date. 

### Endpoints

#### Employees

|   | URL         | Method | Description                    | Request Body | Response Body|
|---|-------------|--------|--------------------------------|--------------|---------------|
| INDEX | /employees| GET   | Returns a list of all employees|             |[list of employees as shown below]|
| CREATE| /employees   | POST   | Creates a new employee         | {"firstName": "Laura", "lastName": "Harper", "workEmail": "laura@laura.com", "password": "cats", "totalHoliday": "20", "sortCode": "206089", "accountNumber": "12345678", "salary": "2", "employeeStartDate": "2024-03-06"}             | {"id": 6, "firstName": "Laura", "lastName": "Harper", "workEmail": "laura@laura.com", "password": "cats", "totalHoliday": 20, "sortCode": "206089", "accountNumber": "12345678", "salary": 2, "employeeStartDate": "2024-03-06", "active": true, "managees": [], "manager": null, "requestedTimeOffs": [], "calculateRemainingTimeOffs": 20}  |
| SHOW  | /employees/:id  | GET    | Returns details of one specific employee |              |{ "id": 3, "firstName": "Hannah", "lastName": "Riley", "workEmail": "hannah@lily.com", "password": "dogs", "totalHoliday": 200, "sortCode": "123456", "accountNumber": "87654321", "salary": 200000, "employeeStartDate": "2024-04-10", "active": true, "managees": [], "manager": {Employee object of manager}, "requestedTimeOffs": [Array of RequestedTimeOff objects], "calculateRemainingTimeOffs": 200}|
| UPDATE| /employee/:id  | PUT    | Updates a specific employee       | {"sortCode": "568912", "accountNumber": "12345679"} |{"id": 2, "firstName": "Laura", "lastName": "Harper", "workEmail": "laura@laura.com", "password": "cats", "totalHoliday": "20", "sortCode": "206089", "accountNumber": "12345678", "salary": "200", "employeeStartDate": "2024-03-06", "active" : "true", "managees": [Array of Employees], "manager" : {Employee object of manager}, "requestedTimeOffs": [Array of RequestedTimeOff objects], "calculateRemainingTimeOffs": 20}|
| DELETE| /employees/:id  | DELETE | Deletes a specific employee       |              | {"id": "1"} |
| UPDATE| /posts/:postId/:userId/likes  | PATCH | Adds and removes likes       |             |    |

### Wireframe
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Wireframe.png

### Component diagram
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Component%20Diagram.png

### Class Diagram
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Class%20Diagram.png

### ERD
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Entity%20Relationship%20Diagram.png

### User Flow Diagram
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/User%20Flow%20Diagram.png

## Installation instructions
**Client-side**
**1.** Install PostgreSQL, POSTICO, POSTMAN and an IDE that supports Java
**2.** In the terminal, navigate to the directory you want to clone the repository into and then clone the repository using the following command:
   ```bash
   git clone git@github.com:h-larper/fullstack_hr_project_BNTA.git
   ```
**3.** In the terminal, create a PostgreSQL database following the command:
   ```bash
   createdb hr_system
   ```
**4.** Run the application and use POSTMAN and POSTICO to run the endpoints and view changes to the database

**Server-side**
**1.** Navigate to the front end project directory 
   ```bash
   cd frontend
   ```
**2.** Install the dependencies
   ```bash
   npm install
   ```
## Usage
**1.** Start the development server
   ``` bash 
   npm start
   ```
**2.** Open a browser and navigate to [`http://localhost:3000`](http://localhost:3000) to view the application

## Contributing Instructions

We appreciate your interest in contributing to the Yeet Project. We welcome contributions of all kinds, from bug reports and documentation improvements to new features and code changes.

Find below our contributing guidelines. By following these guidelines, you'll help us to maintain a high quality codebase and make the review process smoother for everyone.

**1. Fork the Repository:** Create a fork of the fullstack_hr_project_BNTA repository on GitHub.

**2. Create a Branch:** Clone the forked repository to your local machine & create a new branch for your contribution.

**3.Make Changes:** Make your changes to the code & ensure your changes follow our coding style.

**4. Commit Your Changes:** Commit your changes to your local branch with a descriptive commit message.

**5. Push Your Changes:** Push your changes to your forked repository on GitHub.
     
**6. Create a Pull Request:** Open a pull request from your branch to the main branch of the upstream repository.

**7. Review and Feedback:** We will review your pull request and provide feedback.


## Credits and Acknowledgements

### Yeet Collaborators:
- Laura Harper (https://github.com/h-larper)
- Karen Yip (https://github.com/karenyip1999)
- Hannah Riley (https://github.com/H8S8)
- Maya Tetteh (https://github.com/MTBNTA)

### Special thanks to:

- Anna Henderson
- Colin Farquhar
- Richard Sneyd
- Thibyaa Mahasivam
- Zsolt Podoba-Szalai

**For their invaluable guidance and assistance with this project.**

## Licences

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
