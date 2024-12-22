# INFO 5100 - Application Engineering Development  
**Final Project at Northeastern University**  
**Group 39**  
**Project Name:** Happy Paws Pet Shelter  

## Project Members  
1. Rutuja Pawar, 002790118  
2. Chaitanya Inamdar, 002778948  
3. Shreeyash Lahane, 002743020  

---

## UML Diagrams  

### Class Diagram  
![Class Diagram](https://user-images.githubusercontent.com/114704336/206961111-1a62244b-80e0-4137-8f14-e90fa07756ba.png)  

### Object Model Diagram  
![Object Model Diagram](https://user-images.githubusercontent.com/114704336/206961131-972c312c-16e3-4fb1-b6af-a332c9eb86e1.png)  

### User Role Diagram  
![User Role Diagram](https://user-images.githubusercontent.com/114628941/207769568-63a998e0-b28f-4599-a02f-9c23d701942a.png)  

---

## Project Overview  

**Happy Paws Pet Shelter** is a JAVA Swing framework-based application designed to simplify the reporting and management of stray animals across geographical boundaries. The project tracks animal welfare from the moment they are reported until they are housed in shelters.  

### Key Features  

- The system supports **18+ user roles** spanning multiple networks and **8 core workflows**, ensuring comprehensive management.  
- Users can report stray animals, and the system keeps detailed records of their care once placed in shelter homes.  
- It accommodates various users, including field workers, administrators, and shelter office staff, ensuring seamless collaboration.  
- The ecosystem supports **vertical and horizontal scalability**, allowing the addition of hospitals, NGOs, merchants, pet training schools, and operational cities/networks.  

### Design Highlights  

- Utilized **AbsoluteLayout**, **BorderLayout**, and **CardLayout** for different stages of the application.  
- Based on an ecosystem model that supports expansion and efficient role-based management.  
- Administrators can expand the system by adding more organizations and networks.  
- Users have distinct roles:
  - **General users:** Report stray animals but cannot directly request food or medical assistance.  
  - **Employees (e.g., field workers):** Cannot report animals but can access resources and coordinate care.  

This role segregation ensures a streamlined approach and clear responsibilities for each entity within the system.  

### Additional Functionalities  

- The system allows pet shelters to request access to the supply chain and medical facilities.  
- Administrators can manage and expand the network, including adding new hospitals, NGOs, merchants, and training schools.  
