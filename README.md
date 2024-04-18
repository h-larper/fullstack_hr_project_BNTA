<h1 align="center" id="title">Yeet 👩🏻‍💻👩🏾‍💻🏝️👩🏽‍💻👩🏻‍💻</h1>

## Table of Contents
1. [Project Description](#project-description)
2. [Installation instructions](#installation-instructions)
3. [Usage](#usage)
4. [Contributing Instructions](#contributing-instructions)
5. [Credits and Acknowledgements](credits-and-acknowledgements)
6. [Licences](#licences)

   
## Project Description

**The names and versions of libraries used:**
- React.js
- React Router DOM
- SpringBoot
- React Modal

### MVP
- Enable a user to log in to the application.
- Employees can request holidays, which will then need approval from their manager.
- Managers can approve their employee's holidays.
- Calendar-view to display an employee's holidays.
- Employees can view and update their personal details.
- Ensure different actions are available if you’re logged in as an employee or manager. 

### Extensions
- Add separate functionality for fiance team members - i.e. render a list of bank account details.

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

### Component diagram
Can be viewed here:

## Installation instructions
**Client-side**
**Server-side**

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
