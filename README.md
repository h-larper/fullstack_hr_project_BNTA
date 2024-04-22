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
- React Modal
- React Big Calendar
- SpringBoot

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

|   |INDEX|
|---|-------------|
|URL|/employees|
|Method| GET|
|Description |Returns list of all employees|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    [
        {
            "id": 1,
            "firstName": "Lily",
            "lastName": "Bobilly",
            "workEmail": "lily@lily.com",
            "password": "humanssuck",
            "totalHoliday": 365,
            "sortCode": "000000",
            "accountNumber": "88888888",
            "salary": 20,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "managees": [
                {
                    "id": 2,
                    "firstName": "Laura",
                    "lastName": "Harper",
                    "workEmail": "laura@lily.com",
                    "password": "cats",
                    "totalHoliday": 20,
                    "sortCode": "451269",
                    "accountNumber": "12345678",
                    "salary": 200,
                    "employeeStartDate": "2023-10-06",
                    "active": true,
                    "managees": [
                        {
                            "id": 3,
                            "firstName": "Hannah",
                            "lastName": "Riley",
                            "workEmail": "hannah@lily.com",
                            "password": "dogs",
                            "totalHoliday": 200,
                            "sortCode": "123456",
                            "accountNumber": "87654321",
                            "salary": 200000,
                            "employeeStartDate": "2024-04-10",
                            "active": true,
                            "managees": [],
                            "requestedTimeOffs": [
                                {
                                    "id": 3,
                                    "startDate": "2025-06-13",
                                    "endDate": "2025-06-27",
                                    "timeOffType": "HOLIDAYLEAVE",
                                    "notes": "Off to Portugal - tchau tá logo",
                                    "status": "PENDING",
                                    "timeOffTypeDisplay": "Holiday Leave"
                                },
                                {
                                    "id": 8,
                                    "startDate": "2024-04-01",
                                    "endDate": "2024-04-02",
                                    "timeOffType": "HOLIDAYLEAVE",
                                    "notes": "i need a holiday",
                                    "status": "PENDING",
                                    "timeOffTypeDisplay": "Holiday Leave"
                                }
                            ],
                            "calculateRemainingTimeOffs": 200
                        },
                        {
                            "id": 4,
                            "firstName": "Maya",
                            "lastName": "Tetteh",
                            "workEmail": "maya@lily.com",
                            "password": "orcas",
                            "totalHoliday": 364,
                            "sortCode": "246810",
                            "accountNumber": "12345679",
                            "salary": 3000000,
                            "employeeStartDate": "2001-12-25",
                            "active": true,
                            "managees": [],
                            "requestedTimeOffs": [
                                {
                                    "id": 4,
                                    "startDate": "2024-04-19",
                                    "endDate": "2024-04-22",
                                    "timeOffType": "COMPASSIONATELEAVE",
                                    "notes": "Partner cycled into a car door, in A&E",
                                    "status": "APPROVED",
                                    "timeOffTypeDisplay": "Compassionate Leave"
                                }
                            ],
                            "calculateRemainingTimeOffs": 364
                        },
                        {
                            "id": 5,
                            "firstName": "Karen",
                            "lastName": "Yip",
                            "workEmail": "karen.karen@lily.com",
                            "password": "flapjack",
                            "totalHoliday": 20,
                            "sortCode": "147258",
                            "accountNumber": "98745612",
                            "salary": 500,
                            "employeeStartDate": "2021-10-25",
                            "active": true,
                            "managees": [],
                            "requestedTimeOffs": [
                                {
                                    "id": 1,
                                    "startDate": "2024-04-22",
                                    "endDate": "2024-04-29",
                                    "timeOffType": "HOLIDAYLEAVE",
                                    "notes": "Going back to the motherland for some dumplings",
                                    "status": "APPROVED",
                                    "timeOffTypeDisplay": "Holiday Leave"
                                },
                                {
                                    "id": 6,
                                    "startDate": "2024-04-19",
                                    "endDate": "2024-04-19",
                                    "timeOffType": "SICKLEAVE",
                                    "notes": "Got the runs",
                                    "status": "PENDING",
                                    "timeOffTypeDisplay": "Sick Leave"
                                }
                            ],
                            "calculateRemainingTimeOffs": 14
                        }
                    ],
                    "requestedTimeOffs": [
                        {
                            "id": 5,
                            "startDate": "2024-05-07",
                            "endDate": "2024-05-17",
                            "timeOffType": "HOLIDAYLEAVE",
                            "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                            "status": "PENDING",
                            "timeOffTypeDisplay": "Holiday Leave"
                        },
                        {
                            "id": 7,
                            "startDate": "2024-04-16",
                            "endDate": "2024-04-16",
                            "timeOffType": "SICKLEAVE",
                            "notes": "My feline overlord blessed me with a bite - GP appointment",
                            "status": "APPROVED",
                            "timeOffTypeDisplay": "Sick Leave"
                        }
                    ],
                    "calculateRemainingTimeOffs": 20
                }
            ],
            "manager": null,
            "requestedTimeOffs": [],
            "calculateRemainingTimeOffs": 365
        },
        {
            "id": 2,
            "firstName": "Laura",
            "lastName": "Harper",
            "workEmail": "laura@lily.com",
            "password": "cats",
            "totalHoliday": 20,
            "sortCode": "451269",
            "accountNumber": "12345678",
            "salary": 200,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "managees": [
                {
                    "id": 3,
                    "firstName": "Hannah",
                    "lastName": "Riley",
                    "workEmail": "hannah@lily.com",
                    "password": "dogs",
                    "totalHoliday": 200,
                    "sortCode": "123456",
                    "accountNumber": "87654321",
                    "salary": 200000,
                    "employeeStartDate": "2024-04-10",
                    "active": true,
                    "managees": [],
                    "requestedTimeOffs": [
                        {
                            "id": 3,
                            "startDate": "2025-06-13",
                            "endDate": "2025-06-27",
                            "timeOffType": "HOLIDAYLEAVE",
                            "notes": "Off to Portugal - tchau tá logo",
                            "status": "PENDING",
                            "timeOffTypeDisplay": "Holiday Leave"
                        },
                        {
                            "id": 8,
                            "startDate": "2024-04-01",
                            "endDate": "2024-04-02",
                            "timeOffType": "HOLIDAYLEAVE",
                            "notes": "i need a holiday",
                            "status": "PENDING",
                            "timeOffTypeDisplay": "Holiday Leave"
                        }
                    ],
                    "calculateRemainingTimeOffs": 200
                },
                {
                    "id": 4,
                    "firstName": "Maya",
                    "lastName": "Tetteh",
                    "workEmail": "maya@lily.com",
                    "password": "orcas",
                    "totalHoliday": 364,
                    "sortCode": "246810",
                    "accountNumber": "12345679",
                    "salary": 3000000,
                    "employeeStartDate": "2001-12-25",
                    "active": true,
                    "managees": [],
                    "requestedTimeOffs": [
                        {
                            "id": 4,
                            "startDate": "2024-04-19",
                            "endDate": "2024-04-22",
                            "timeOffType": "COMPASSIONATELEAVE",
                            "notes": "Partner cycled into a car door, in A&E",
                            "status": "APPROVED",
                            "timeOffTypeDisplay": "Compassionate Leave"
                        }
                    ],
                    "calculateRemainingTimeOffs": 364
                },
                {
                    "id": 5,
                    "firstName": "Karen",
                    "lastName": "Yip",
                    "workEmail": "karen.karen@lily.com",
                    "password": "flapjack",
                    "totalHoliday": 20,
                    "sortCode": "147258",
                    "accountNumber": "98745612",
                    "salary": 500,
                    "employeeStartDate": "2021-10-25",
                    "active": true,
                    "managees": [],
                    "requestedTimeOffs": [
                        {
                            "id": 1,
                            "startDate": "2024-04-22",
                            "endDate": "2024-04-29",
                            "timeOffType": "HOLIDAYLEAVE",
                            "notes": "Going back to the motherland for some dumplings",
                            "status": "APPROVED",
                            "timeOffTypeDisplay": "Holiday Leave"
                        },
                        {
                            "id": 6,
                            "startDate": "2024-04-19",
                            "endDate": "2024-04-19",
                            "timeOffType": "SICKLEAVE",
                            "notes": "Got the runs",
                            "status": "PENDING",
                            "timeOffTypeDisplay": "Sick Leave"
                        }
                    ],
                    "calculateRemainingTimeOffs": 14
                }
            ],
            "manager": {
                "id": 1,
                "firstName": "Lily",
                "lastName": "Bobilly",
                "workEmail": "lily@lily.com",
                "password": "humanssuck",
                "totalHoliday": 365,
                "sortCode": "000000",
                "accountNumber": "88888888",
                "salary": 20,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "manager": null,
                "requestedTimeOffs": [],
                "calculateRemainingTimeOffs": 365
            },
            "requestedTimeOffs": [
                {
                    "id": 5,
                    "startDate": "2024-05-07",
                    "endDate": "2024-05-17",
                    "timeOffType": "HOLIDAYLEAVE",
                    "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                    "status": "PENDING",
                    "timeOffTypeDisplay": "Holiday Leave"
                },
                {
                    "id": 7,
                    "startDate": "2024-04-16",
                    "endDate": "2024-04-16",
                    "timeOffType": "SICKLEAVE",
                    "notes": "My feline overlord blessed me with a bite - GP appointment",
                    "status": "APPROVED",
                    "timeOffTypeDisplay": "Sick Leave"
                }
            ],
            "calculateRemainingTimeOffs": 20
        },
        {
            "id": 3,
            "firstName": "Hannah",
            "lastName": "Riley",
            "workEmail": "hannah@lily.com",
            "password": "dogs",
            "totalHoliday": 200,
            "sortCode": "123456",
            "accountNumber": "87654321",
            "salary": 200000,
            "employeeStartDate": "2024-04-10",
            "active": true,
            "managees": [],
            "manager": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "manager": {
                    "id": 1,
                    "firstName": "Lily",
                    "lastName": "Bobilly",
                    "workEmail": "lily@lily.com",
                    "password": "humanssuck",
                    "totalHoliday": 365,
                    "sortCode": "000000",
                    "accountNumber": "88888888",
                    "salary": 20,
                    "employeeStartDate": "2023-10-06",
                    "active": true,
                    "manager": null,
                    "requestedTimeOffs": [],
                    "calculateRemainingTimeOffs": 365
                },
                "requestedTimeOffs": [
                    {
                        "id": 5,
                        "startDate": "2024-05-07",
                        "endDate": "2024-05-17",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Holiday Leave"
                    },
                    {
                        "id": 7,
                        "startDate": "2024-04-16",
                        "endDate": "2024-04-16",
                        "timeOffType": "SICKLEAVE",
                        "notes": "My feline overlord blessed me with a bite - GP appointment",
                        "status": "APPROVED",
                        "timeOffTypeDisplay": "Sick Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 20
            },
            "requestedTimeOffs": [
                {
                    "id": 3,
                    "startDate": "2025-06-13",
                    "endDate": "2025-06-27",
                    "timeOffType": "HOLIDAYLEAVE",
                    "notes": "Off to Portugal - tchau tá logo",
                    "status": "PENDING",
                    "timeOffTypeDisplay": "Holiday Leave"
                },
                {
                    "id": 8,
                    "startDate": "2024-04-01",
                    "endDate": "2024-04-02",
                    "timeOffType": "HOLIDAYLEAVE",
                    "notes": "i need a holiday",
                    "status": "PENDING",
                    "timeOffTypeDisplay": "Holiday Leave"
                }
            ],
            "calculateRemainingTimeOffs": 200
        },
        {
            "id": 4,
            "firstName": "Maya",
            "lastName": "Tetteh",
            "workEmail": "maya@lily.com",
            "password": "orcas",
            "totalHoliday": 364,
            "sortCode": "246810",
            "accountNumber": "12345679",
            "salary": 3000000,
            "employeeStartDate": "2001-12-25",
            "active": true,
            "managees": [],
            "manager": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "manager": {
                    "id": 1,
                    "firstName": "Lily",
                    "lastName": "Bobilly",
                    "workEmail": "lily@lily.com",
                    "password": "humanssuck",
                    "totalHoliday": 365,
                    "sortCode": "000000",
                    "accountNumber": "88888888",
                    "salary": 20,
                    "employeeStartDate": "2023-10-06",
                    "active": true,
                    "manager": null,
                    "requestedTimeOffs": [],
                    "calculateRemainingTimeOffs": 365
                },
                "requestedTimeOffs": [
                    {
                        "id": 5,
                        "startDate": "2024-05-07",
                        "endDate": "2024-05-17",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Holiday Leave"
                    },
                    {
                        "id": 7,
                        "startDate": "2024-04-16",
                        "endDate": "2024-04-16",
                        "timeOffType": "SICKLEAVE",
                        "notes": "My feline overlord blessed me with a bite - GP appointment",
                        "status": "APPROVED",
                        "timeOffTypeDisplay": "Sick Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 20
            },
            "requestedTimeOffs": [
                {
                    "id": 4,
                    "startDate": "2024-04-19",
                    "endDate": "2024-04-22",
                    "timeOffType": "COMPASSIONATELEAVE",
                    "notes": "Partner cycled into a car door, in A&E",
                    "status": "APPROVED",
                    "timeOffTypeDisplay": "Compassionate Leave"
                }
            ],
            "calculateRemainingTimeOffs": 364
        },
        {
            "id": 5,
            "firstName": "Karen",
            "lastName": "Yip",
            "workEmail": "karen.karen@lily.com",
            "password": "flapjack",
            "totalHoliday": 20,
            "sortCode": "147258",
            "accountNumber": "98745612",
            "salary": 500,
            "employeeStartDate": "2021-10-25",
            "active": true,
            "managees": [],
            "manager": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "manager": {
                    "id": 1,
                    "firstName": "Lily",
                    "lastName": "Bobilly",
                    "workEmail": "lily@lily.com",
                    "password": "humanssuck",
                    "totalHoliday": 365,
                    "sortCode": "000000",
                    "accountNumber": "88888888",
                    "salary": 20,
                    "employeeStartDate": "2023-10-06",
                    "active": true,
                    "manager": null,
                    "requestedTimeOffs": [],
                    "calculateRemainingTimeOffs": 365
                },
                "requestedTimeOffs": [
                    {
                        "id": 5,
                        "startDate": "2024-05-07",
                        "endDate": "2024-05-17",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Holiday Leave"
                    },
                    {
                        "id": 7,
                        "startDate": "2024-04-16",
                        "endDate": "2024-04-16",
                        "timeOffType": "SICKLEAVE",
                        "notes": "My feline overlord blessed me with a bite - GP appointment",
                        "status": "APPROVED",
                        "timeOffTypeDisplay": "Sick Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 20
            },
            "requestedTimeOffs": [
                {
                    "id": 1,
                    "startDate": "2024-04-22",
                    "endDate": "2024-04-29",
                    "timeOffType": "HOLIDAYLEAVE",
                    "notes": "Going back to the motherland for some dumplings",
                    "status": "APPROVED",
                    "timeOffTypeDisplay": "Holiday Leave"
                },
                {
                    "id": 6,
                    "startDate": "2024-04-19",
                    "endDate": "2024-04-19",
                    "timeOffType": "SICKLEAVE",
                    "notes": "Got the runs",
                    "status": "PENDING",
                    "timeOffTypeDisplay": "Sick Leave"
                }
            ],
            "calculateRemainingTimeOffs": 14
        }
    ]
  ```
</details>

|   |SHOW|
|---|-------------|
|URL|/employees/:id|
|Method| GET|
|Description |Returns details one specific employee|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 3,
        "firstName": "Hannah",
        "lastName": "Riley",
        "workEmail": "hannah@lily.com",
        "password": "dogs",
        "totalHoliday": 200,
        "sortCode": "123456",
        "accountNumber": "87654321",
        "salary": 200000,
        "employeeStartDate": "2024-04-10",
        "active": true,
        "managees": [],
        "manager": {
            "id": 2,
            "firstName": "Laura",
            "lastName": "Harper",
            "workEmail": "laura@lily.com",
            "password": "cats",
            "totalHoliday": 20,
            "sortCode": "451269",
            "accountNumber": "12345678",
            "salary": 200,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "manager": {
                "id": 1,
                "firstName": "Lily",
                "lastName": "Bobilly",
                "workEmail": "lily@lily.com",
                "password": "humanssuck",
                "totalHoliday": 365,
                "sortCode": "000000",
                "accountNumber": "88888888",
                "salary": 20,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "manager": null,
                "requestedTimeOffs": [],
                "calculateRemainingTimeOffs": 365
            },
            "requestedTimeOffs": [
                {
                    "id": 5,
                    "startDate": "2024-05-07",
                    "endDate": "2024-05-17",
                    "timeOffType": "HOLIDAYLEAVE",
                    "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                    "status": "PENDING",
                    "timeOffTypeDisplay": "Holiday Leave"
                },
                {
                    "id": 7,
                    "startDate": "2024-04-16",
                    "endDate": "2024-04-16",
                    "timeOffType": "SICKLEAVE",
                    "notes": "My feline overlord blessed me with a bite - GP appointment",
                    "status": "APPROVED",
                    "timeOffTypeDisplay": "Sick Leave"
                }
            ],
            "calculateRemainingTimeOffs": 20
        },
        "requestedTimeOffs": [
            {
                "id": 3,
                "startDate": "2025-06-13",
                "endDate": "2025-06-27",
                "timeOffType": "HOLIDAYLEAVE",
                "notes": "Off to Portugal - tchau tá logo",
                "status": "PENDING",
                "timeOffTypeDisplay": "Holiday Leave"
            },
            {
                "id": 8,
                "startDate": "2024-04-01",
                "endDate": "2024-04-02",
                "timeOffType": "HOLIDAYLEAVE",
                "notes": "i need a holiday",
                "status": "PENDING",
                "timeOffTypeDisplay": "Holiday Leave"
            }
        ],
        "calculateRemainingTimeOffs": 200
    }
  ```
</details>

|   |GET|
|---|-------------|
|URL|/employees/:id/holiday_approvals|
|Method| GET|
|Description |Returns list of PENDING requested time offs (including the full name of the requester) of the selected managers managees|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    [
        {
            "id": 3,
            "startDate": "2025-06-13",
            "endDate": "2025-06-27",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "Off to Portugal - tchau tá logo",
            "fullName": "Hannah Riley"
        },
        {
            "id": 8,
            "startDate": "2024-04-01",
            "endDate": "2024-04-02",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "i need a holiday",
            "fullName": "Hannah Riley"
        },
        {
            "id": 6,
            "startDate": "2024-04-19",
            "endDate": "2024-04-19",
            "timeOffType": "SICKLEAVE",
            "notes": "Got the runs",
            "fullName": "Karen Yip"
        }
    ]
  ```
</details>

|   |GET|
|---|-------------|
|URL|/employees/:id/calendar_events|
|Method| GET|
|Description |Returns list of all requested time offs for a manager and their managees including the full name of the requester and a boolean indicating whether the requested time off belongs to the manager (the currently logged in user)|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    [
        {
            "id": 5,
            "startDate": "2024-05-07",
            "endDate": "2024-05-17",
            "timeOffType": "HOLIDAYLEAVE",
            "status": "PENDING",
            "notes": "Visiting Madeira - I hope it tastes as good as the cake",
            "fullName": "Laura Harper",
            "currentUsersEvent": true
        },
        {
            "id": 7,
            "startDate": "2024-04-16",
            "endDate": "2024-04-16",
            "timeOffType": "SICKLEAVE",
            "status": "APPROVED",
            "notes": "My feline overlord blessed me with a bite - GP appointment",
            "fullName": "Laura Harper",
            "currentUsersEvent": true
        },
        {
            "id": 3,
            "startDate": "2025-06-13",
            "endDate": "2025-06-27",
            "timeOffType": "HOLIDAYLEAVE",
            "status": "PENDING",
            "notes": "Off to Portugal - tchau tá logo",
            "fullName": "Hannah Riley",
            "currentUsersEvent": false
        },
        {
            "id": 8,
            "startDate": "2024-04-01",
            "endDate": "2024-04-02",
            "timeOffType": "HOLIDAYLEAVE",
            "status": "PENDING",
            "notes": "i need a holiday",
            "fullName": "Hannah Riley",
            "currentUsersEvent": false
        },
        {
            "id": 4,
            "startDate": "2024-04-19",
            "endDate": "2024-04-22",
            "timeOffType": "COMPASSIONATELEAVE",
            "status": "APPROVED",
            "notes": "Partner cycled into a car door, in A&E",
            "fullName": "Maya Tetteh",
            "currentUsersEvent": false
        },
        {
            "id": 1,
            "startDate": "2024-04-22",
            "endDate": "2024-04-29",
            "timeOffType": "HOLIDAYLEAVE",
            "status": "APPROVED",
            "notes": "Going back to the motherland for some dumplings",
            "fullName": "Karen Yip",
            "currentUsersEvent": false
        },
        {
            "id": 6,
            "startDate": "2024-04-19",
            "endDate": "2024-04-19",
            "timeOffType": "SICKLEAVE",
            "status": "PENDING",
            "notes": "Got the runs",
            "fullName": "Karen Yip",
            "currentUsersEvent": false
        }
    ]
  ```
</details>

|   |POST|
|---|-------------|
|URL|/employees|
|Method| POST|
|Description |Creates a new employee|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "firstName": "Laura",
        "lastName": "Harper",
        "workEmail": "laura@lily.com",
        "password": "cats",
        "totalHoliday": "20",
        "sortCode": "206089",
        "accountNumber": "12345678",
        "salary": "2",
        "employeeStartDate": "2024-03-06"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 6,
        "firstName": "Laura",
        "lastName": "Harper",
        "workEmail": "laura@lily.com",
        "password": "cats",
        "totalHoliday": 20,
        "sortCode": "206089",
        "accountNumber": "12345678",
        "salary": 2,
        "employeeStartDate": "2024-03-06",
        "active": true,
        "managees": [],
        "manager": null,
        "requestedTimeOffs": [],
        "calculateRemainingTimeOffs": 20
    }
  ```
</details>

|   |LOGIN|
|---|-------------|
|URL|/employees/login|
|Method| POST|
|Description |If the correct credentials are entered, returns the details of the relevant employee|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "workEmail": "laura@lily.com",
        "password": "cats"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 2,
        "firstName": "Laura",
        "lastName": "Harper",
        "workEmail": "laura@lily.com",
        "password": "cats",
        "totalHoliday": 20,
        "sortCode": "451269",
        "accountNumber": "12345678",
        "salary": 200,
        "employeeStartDate": "2023-10-06",
        "active": true,
        "managees": [
            {
                "id": 3,
                "firstName": "Hannah",
                "lastName": "Riley",
                "workEmail": "hannah@lily.com",
                "password": "dogs",
                "totalHoliday": 200,
                "sortCode": "123456",
                "accountNumber": "87654321",
                "salary": 200000,
                "employeeStartDate": "2024-04-10",
                "active": true,
                "managees": [],
                "requestedTimeOffs": [
                    {
                        "id": 3,
                        "startDate": "2025-06-13",
                        "endDate": "2025-06-27",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Off to Portugal - tchau tá logo",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Holiday Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 200
            },
            {
                "id": 4,
                "firstName": "Maya",
                "lastName": "Tetteh",
                "workEmail": "maya@lily.com",
                "password": "orcas",
                "totalHoliday": 364,
                "sortCode": "246810",
                "accountNumber": "12345679",
                "salary": 3000000,
                "employeeStartDate": "2001-12-25",
                "active": true,
                "managees": [],
                "requestedTimeOffs": [
                    {
                        "id": 2,
                        "startDate": "2024-04-23",
                        "endDate": "2024-04-24",
                        "timeOffType": "PARENTALLEAVE",
                        "notes": "Think of the children!",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Parental Leave"
                    },
                    {
                        "id": 4,
                        "startDate": "2024-04-19",
                        "endDate": "2024-04-22",
                        "timeOffType": "COMPASSIONATELEAVE",
                        "notes": "Partner cycled into a car door, in A&E",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Compassionate Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 364
            },
            {
                "id": 5,
                "firstName": "Karen",
                "lastName": "Yip",
                "workEmail": "karen.karen@lily.com",
                "password": "flapjack",
                "totalHoliday": 20,
                "sortCode": "147258",
                "accountNumber": "98745612",
                "salary": 500,
                "employeeStartDate": "2021-10-25",
                "active": true,
                "managees": [],
                "requestedTimeOffs": [
                    {
                        "id": 1,
                        "startDate": "2024-04-22",
                        "endDate": "2024-04-29",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Going back to the motherland for some dumplings",
                        "status": "APPROVED",
                        "timeOffTypeDisplay": "Holiday Leave"
                    },
                    {
                        "id": 6,
                        "startDate": "2024-04-19",
                        "endDate": "2024-04-19",
                        "timeOffType": "SICKLEAVE",
                        "notes": "Got the runs",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Sick Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 14
            }
        ],
        "manager": {
            "id": 1,
            "firstName": "Lily",
            "lastName": "Bobilly",
            "workEmail": "lily@lily.com",
            "password": "humanssuck",
            "totalHoliday": 365,
            "sortCode": "000000",
            "accountNumber": "88888888",
            "salary": 20,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "manager": null,
            "requestedTimeOffs": [],
            "calculateRemainingTimeOffs": 365
        },
        "requestedTimeOffs": [
            {
                "id": 5,
                "startDate": "2024-05-07",
                "endDate": "2024-05-17",
                "timeOffType": "HOLIDAYLEAVE",
                "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                "status": "PENDING",
                "timeOffTypeDisplay": "Holiday Leave"
            },
            {
                "id": 7,
                "startDate": "2024-04-16",
                "endDate": "2024-04-16",
                "timeOffType": "SICKLEAVE",
                "notes": "My feline overlord blessed me with a bite - GP appointment",
                "status": "APPROVED",
                "timeOffTypeDisplay": "Sick Leave"
            }
        ],
        "calculateRemainingTimeOffs": 20
    }
  ```
</details>

|   |PATCH|
|---|-------------|
|URL|/employees/:id/update_manager|
|Method| PATCH|
|Description |updates the manager of a specific employee|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "managerId": "1"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 4,
        "firstName": "Maya",
        "lastName": "Tetteh",
        "workEmail": "maya@lily.com",
        "password": "orcas",
        "totalHoliday": 364,
        "sortCode": "246810",
        "accountNumber": "12345679",
        "salary": 3000000,
        "employeeStartDate": "2001-12-25",
        "active": true,
        "managees": [],
        "manager": {
            "id": 1,
            "firstName": "Lily",
            "lastName": "Bobilly",
            "workEmail": "lily@lily.com",
            "password": "humanssuck",
            "totalHoliday": 365,
            "sortCode": "000000",
            "accountNumber": "88888888",
            "salary": 20,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "manager": null,
            "requestedTimeOffs": [],
            "calculateRemainingTimeOffs": 365
        },
        "requestedTimeOffs": [
            {
                "id": 2,
                "startDate": "2024-04-23",
                "endDate": "2024-04-24",
                "timeOffType": "PARENTALLEAVE",
                "notes": "Think of the children!",
                "status": "PENDING",
                "timeOffTypeDisplay": "Parental Leave"
            },
            {
                "id": 4,
                "startDate": "2024-04-19",
                "endDate": "2024-04-22",
                "timeOffType": "COMPASSIONATELEAVE",
                "notes": "Partner cycled into a car door, in A&E",
                "status": "PENDING",
                "timeOffTypeDisplay": "Compassionate Leave"
            }
        ],
        "calculateRemainingTimeOffs": 364
    }
  ```
</details>

|   |PATCH|
|---|-------------|
|URL|/employees/:id|
|Method| PATCH|
|Description |Updates bank details of an employee|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "sortCode": "568912",
        "accountNumber": "12345679"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 2,
        "firstName": "Laura",
        "lastName": "Harper",
        "workEmail": "laura@lily.com",
        "password": "cats",
        "totalHoliday": 20,
        "sortCode": "568912",
        "accountNumber": "12345679",
        "salary": 200,
        "employeeStartDate": "2023-10-06",
        "active": true,
        "managees": [
            {
                "id": 3,
                "firstName": "Hannah",
                "lastName": "Riley",
                "workEmail": "hannah@lily.com",
                "password": "dogs",
                "totalHoliday": 200,
                "sortCode": "123456",
                "accountNumber": "87654321",
                "salary": 200000,
                "employeeStartDate": "2024-04-10",
                "active": true,
                "managees": [],
                "requestedTimeOffs": [
                    {
                        "id": 3,
                        "startDate": "2025-06-13",
                        "endDate": "2025-06-27",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Off to Portugal - tchau tá logo",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Holiday Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 200
            },
            {
                "id": 5,
                "firstName": "Karen",
                "lastName": "Yip",
                "workEmail": "karen.karen@lily.com",
                "password": "flapjack",
                "totalHoliday": 20,
                "sortCode": "147258",
                "accountNumber": "98745612",
                "salary": 500,
                "employeeStartDate": "2021-10-25",
                "active": true,
                "managees": [],
                "requestedTimeOffs": [
                    {
                        "id": 1,
                        "startDate": "2024-04-22",
                        "endDate": "2024-04-29",
                        "timeOffType": "HOLIDAYLEAVE",
                        "notes": "Going back to the motherland for some dumplings",
                        "status": "APPROVED",
                        "timeOffTypeDisplay": "Holiday Leave"
                    },
                    {
                        "id": 6,
                        "startDate": "2024-04-19",
                        "endDate": "2024-04-19",
                        "timeOffType": "SICKLEAVE",
                        "notes": "Got the runs",
                        "status": "PENDING",
                        "timeOffTypeDisplay": "Sick Leave"
                    }
                ],
                "calculateRemainingTimeOffs": 14
            }
        ],
        "manager": {
            "id": 1,
            "firstName": "Lily",
            "lastName": "Bobilly",
            "workEmail": "lily@lily.com",
            "password": "humanssuck",
            "totalHoliday": 365,
            "sortCode": "000000",
            "accountNumber": "88888888",
            "salary": 20,
            "employeeStartDate": "2023-10-06",
            "active": true,
            "manager": null,
            "requestedTimeOffs": [],
            "calculateRemainingTimeOffs": 365
        },
        "requestedTimeOffs": [
            {
                "id": 5,
                "startDate": "2024-05-07",
                "endDate": "2024-05-17",
                "timeOffType": "HOLIDAYLEAVE",
                "notes": "Visiting Madeira - I hope it tastes as good as the cake",
                "status": "PENDING",
                "timeOffTypeDisplay": "Holiday Leave"
            },
            {
                "id": 7,
                "startDate": "2024-04-16",
                "endDate": "2024-04-16",
                "timeOffType": "SICKLEAVE",
                "notes": "My feline overlord blessed me with a bite - GP appointment",
                "status": "APPROVED",
                "timeOffTypeDisplay": "Sick Leave"
            }
        ],
        "calculateRemainingTimeOffs": 20
    }
  ```
</details>

|   |DELETE|
|---|-------------|
|URL|/employees/:id|
|Method| Delete|
|Description |Deletes an employee|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    1
  ```
</details>

#### RequestedTimeOffs

|   |INDEX|
|---|-------------|
|URL|/requested_time_offs|
|Method| GET|
|Description |Returns list of all requested time offs|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    [
        {
            "id": 1,
            "startDate": "2024-04-22",
            "endDate": "2024-04-29",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "Going back to the motherland for some dumplings",
            "status": "APPROVED",
            "employee": {
                "id": 5,
                "firstName": "Karen",
                "lastName": "Yip",
                "workEmail": "karen.karen@lily.com",
                "password": "flapjack",
                "totalHoliday": 20,
                "sortCode": "147258",
                "accountNumber": "98745612",
                "salary": 500,
                "employeeStartDate": "2021-10-25",
                "active": true,
                "calculateRemainingTimeOffs": 14
            },
            "timeOffTypeDisplay": "Holiday Leave"
        },
        {
            "id": 2,
            "startDate": "2024-04-23",
            "endDate": "2024-04-24",
            "timeOffType": "PARENTALLEAVE",
            "notes": "Think of the children!",
            "status": "PENDING",
            "employee": {
                "id": 4,
                "firstName": "Maya",
                "lastName": "Tetteh",
                "workEmail": "maya@lily.com",
                "password": "orcas",
                "totalHoliday": 364,
                "sortCode": "246810",
                "accountNumber": "12345679",
                "salary": 3000000,
                "employeeStartDate": "2001-12-25",
                "active": true,
                "calculateRemainingTimeOffs": 364
            },
            "timeOffTypeDisplay": "Parental Leave"
        },
        {
            "id": 3,
            "startDate": "2025-06-13",
            "endDate": "2025-06-27",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "Off to Portugal - tchau tá logo",
            "status": "PENDING",
            "employee": {
                "id": 3,
                "firstName": "Hannah",
                "lastName": "Riley",
                "workEmail": "hannah@lily.com",
                "password": "dogs",
                "totalHoliday": 200,
                "sortCode": "123456",
                "accountNumber": "87654321",
                "salary": 200000,
                "employeeStartDate": "2024-04-10",
                "active": true,
                "calculateRemainingTimeOffs": 200
            },
            "timeOffTypeDisplay": "Holiday Leave"
        },
        {
            "id": 4,
            "startDate": "2024-04-19",
            "endDate": "2024-04-22",
            "timeOffType": "COMPASSIONATELEAVE",
            "notes": "Partner cycled into a car door, in A&E",
            "status": "PENDING",
            "employee": {
                "id": 4,
                "firstName": "Maya",
                "lastName": "Tetteh",
                "workEmail": "maya@lily.com",
                "password": "orcas",
                "totalHoliday": 364,
                "sortCode": "246810",
                "accountNumber": "12345679",
                "salary": 3000000,
                "employeeStartDate": "2001-12-25",
                "active": true,
                "calculateRemainingTimeOffs": 364
            },
            "timeOffTypeDisplay": "Compassionate Leave"
        },
        {
            "id": 5,
            "startDate": "2024-05-07",
            "endDate": "2024-05-17",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "Visiting Madeira - I hope it tastes as good as the cake",
            "status": "PENDING",
            "employee": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "calculateRemainingTimeOffs": 20
            },
            "timeOffTypeDisplay": "Holiday Leave"
        },
        {
            "id": 6,
            "startDate": "2024-04-19",
            "endDate": "2024-04-19",
            "timeOffType": "SICKLEAVE",
            "notes": "Got the runs",
            "status": "PENDING",
            "employee": {
                "id": 5,
                "firstName": "Karen",
                "lastName": "Yip",
                "workEmail": "karen.karen@lily.com",
                "password": "flapjack",
                "totalHoliday": 20,
                "sortCode": "147258",
                "accountNumber": "98745612",
                "salary": 500,
                "employeeStartDate": "2021-10-25",
                "active": true,
                "calculateRemainingTimeOffs": 14
            },
            "timeOffTypeDisplay": "Sick Leave"
        },
        {
            "id": 7,
            "startDate": "2024-04-16",
            "endDate": "2024-04-16",
            "timeOffType": "SICKLEAVE",
            "notes": "My feline overlord blessed me with a bite - GP appointment",
            "status": "APPROVED",
            "employee": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "calculateRemainingTimeOffs": 20
            },
            "timeOffTypeDisplay": "Sick Leave"
        }
    ]
  ```
</details>

|   |SHOW|
|---|-------------|
|URL|/requested_time_offs/:id|
|Method| GET|
|Description |Returns details of one specific requested time off|
- Example Request Body: (None)
- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 4,
        "startDate": "2024-04-19",
        "endDate": "2024-04-22",
        "timeOffType": "COMPASSIONATELEAVE",
        "notes": "Partner cycled into a car door, in A&E",
        "status": "PENDING",
        "employee": {
            "id": 4,
            "firstName": "Maya",
            "lastName": "Tetteh",
            "workEmail": "maya@lily.com",
            "password": "orcas",
            "totalHoliday": 364,
            "sortCode": "246810",
            "accountNumber": "12345679",
            "salary": 3000000,
            "employeeStartDate": "2001-12-25",
            "active": true,
            "calculateRemainingTimeOffs": 364
        },
        "timeOffTypeDisplay": "Compassionate Leave"
    }
  ```
</details>

|   |GET|
|---|-------------|
|URL|/requested_time_offs/employee/:id|
|Method| GET|
|Description |Gets the requested time offs of a particular employee|
- Example Request Body: (None)
- Example Response Body: <details><summary>Click me</summary>
  ```json
    [
        {
            "id": 5,
            "startDate": "2024-05-07",
            "endDate": "2024-05-17",
            "timeOffType": "HOLIDAYLEAVE",
            "notes": "Visiting Madeira - I hope it tastes as good as the cake",
            "status": "PENDING",
            "employee": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "calculateRemainingTimeOffs": 20
            },
            "timeOffTypeDisplay": "Holiday Leave"
        },
        {
            "id": 7,
            "startDate": "2024-04-16",
            "endDate": "2024-04-16",
            "timeOffType": "SICKLEAVE",
            "notes": "My feline overlord blessed me with a bite - GP appointment",
            "status": "APPROVED",
            "employee": {
                "id": 2,
                "firstName": "Laura",
                "lastName": "Harper",
                "workEmail": "laura@lily.com",
                "password": "cats",
                "totalHoliday": 20,
                "sortCode": "451269",
                "accountNumber": "12345678",
                "salary": 200,
                "employeeStartDate": "2023-10-06",
                "active": true,
                "calculateRemainingTimeOffs": 20
            },
            "timeOffTypeDisplay": "Sick Leave"
        }
    ]
  ```
</details>

|   |POST|
|---|-------------|
|URL|/requested_time_offs/|
|Method| POST|
|Description |Creates a requested time off|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "startDate": "2024-04-01",
        "endDate": "2024-04-02",
        "timeOffType": "HOLIDAYLEAVE",
        "notes": "i need a holiday",
        "status": "PENDING",
        "employeeId": "3"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 8,
        "startDate": "2024-04-01",
        "endDate": "2024-04-02",
        "timeOffType": "HOLIDAYLEAVE",
        "notes": "i need a holiday",
        "status": "PENDING",
        "employee": {
            "id": 3,
            "firstName": "Hannah",
            "lastName": "Riley",
            "workEmail": "hannah@lily.com",
            "password": "dogs",
            "totalHoliday": 200,
            "sortCode": "123456",
            "accountNumber": "87654321",
            "salary": 200000,
            "employeeStartDate": "2024-04-10",
            "active": true,
            "calculateRemainingTimeOffs": 200
        },
        "timeOffTypeDisplay": "Holiday Leave"
    }
  ```
</details>

|   |PUT|
|---|-------------|
|URL|/requested_time_offs/:id|
|Method| PUT|
|Description |Updates the start date, end date, time off type and notes of a requested time off and sets the approval status to PENDING|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "startDate": "2024-04-01",
        "endDate": "2024-04-02",
        "timeOffType": "COMPASSIONATELEAVE",
        "notes": "i need a hollybob",
        "status": "PENDING",
        "employeeId": 4
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 2,
        "startDate": "2024-04-01",
        "endDate": "2024-04-02",
        "timeOffType": "COMPASSIONATELEAVE",
        "notes": "i need a hollybob",
        "status": "PENDING",
        "employee": {
            "id": 4,
            "firstName": "Maya",
            "lastName": "Tetteh",
            "workEmail": "maya@lily.com",
            "password": "orcas",
            "totalHoliday": 364,
            "sortCode": "246810",
            "accountNumber": "12345679",
            "salary": 3000000,
            "employeeStartDate": "2001-12-25",
            "active": true,
            "calculateRemainingTimeOffs": 364
        },
        "timeOffTypeDisplay": "Compassionate Leave"
    }
  ```
</details>

|   |PATCH|
|---|-------------|
|URL|/requested_time_offs/:id|
|Method| PATCH|
|Description |Updates the approval status of a requested time off|
- Example Request Body: <details> <summary>Click me</summary>
  ```json
    {
        "status":"APPROVED"
    }
  ```
</details>

- Example Response Body: <details> <summary>Click me</summary>
  ```json
    {
        "id": 4,
        "startDate": "2024-04-19",
        "endDate": "2024-04-22",
        "timeOffType": "COMPASSIONATELEAVE",
        "notes": "Partner cycled into a car door, in A&E",
        "status": "APPROVED",
        "employee": {
            "id": 4,
            "firstName": "Maya",
            "lastName": "Tetteh",
            "workEmail": "maya@lily.com",
            "password": "orcas",
            "totalHoliday": 364,
            "sortCode": "246810",
            "accountNumber": "12345679",
            "salary": 3000000,
            "employeeStartDate": "2001-12-25",
            "active": true,
            "calculateRemainingTimeOffs": 364
        },
        "timeOffTypeDisplay": "Compassionate Leave"
    }
  ```
</details>

|   |DELETE|
|---|-------------|
|URL|/requested_time_offs/:id|
|Method| DELETE|
|Description |Deletes a requested time off|
- Example Request Body: (None)
- Example Response Body: <details><summary>Click me</summary>
  ```json
    2
  ```
</details>



### Wireframe
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Wireframe.png

### Component diagram
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Component%20Diagram.png

### Class Diagram
Can be viewed here:
https://github.com/h-larper/fullstack_hr_project_BNTA/blob/main/Class%20Diagram.png

### Entity Relationship Diagram
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

**3. Make Changes:** Make your changes to the code & ensure your changes follow our coding style.

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
